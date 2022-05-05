import org.apache.spark.sql.SparkSession
//1.  Start a simple Spark session.
val spark = SparkSession.builder().getOrCreate()

//2. Load the Netflix Stock CSV file, have Spark infer the data types.
val df = spark.read.option("header", "true").option("inferSchema","true")csv("C:/Users/JOSE/Downloads/evaluation_1/Netflix_2011_2016.csv")

//df.show()

//3.  What are the names of the columns?
val allColumnNames=df.columns
// //println(allColumnNames.mkString(","))
// //df.columns()

//4. How is the scheme?
df.printSchema()

//5. Print the first 5 columns.
df.drop("Volume", "Adj Close").show()

//6.Use describe() to learn about the DataFrame.
df.describe()

//7. Create a new dataframe with a new column called "HV Ratio" which is the ratio that exists between the price of the “High” column versus the “Volume” column of shares traded for one day. Hint - is an operation
var hvRatio = df.withColumn("HV Ratio", df("High")/df("Volume"))
hvRatio.show()

//8. Which day had the highest peak in the “Open” column?
val colDia = df.withColumn("Dia", dayofmonth(df("Date")))

val dias = colDia.groupBy("Dia").max()

val agrupados = dias.select($"Dia", $"max(Close)").sort(desc("max(Close)")).show()

//9. What is the meaning of the “Close” column in the context of financial information, explain it, there is no need to code anything?

//This column refers to the price that the stock or share had at the close of the day, it was the value with which it was being sold


//10. What is the maximum and minimum of the “Volume” column?
df.select(max("Volume"), min("Volume")).show()

//11.With Scala/Spark Syntax $ answer the following:

//a. How many days was the “Close” column less than $600?
df.filter($"Close" < 600).count()

//b. What percentage of the time was the "High" column greater than $500?
val dias = df.filter($"High" > 500).count().toDouble
val porcentaje = ((dias / df.count())*100) // 4.92% aprox

//c.  What is the Pearson correlation between the “High” column and the “Volume” column?
df.select(corr("High", "Volume")).show()

//d. What is the maximum of the “High” column per year?
val colAnio = df.withColumn("Anio", year(df("Date")))

val dfMaximos = colAnio.groupBy("Anio").max()

dfMaximos.select($"Anio", $"max(High)").show()

//e.  What is the average of the “Close” column for each calendar month?
val colMes = df.withColumn("Mes", month(df("Date")))

val dfProm = colMes.groupBy("Mes").mean() 

dfProm.select($"Mes", $"avg(Close)").show()