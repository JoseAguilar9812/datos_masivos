<p align="center">
    <img alt="Logo" src="https://www.tijuana.tecnm.mx/wp-content/themes/tecnm/images/logo_TECT.png" width=250 height=250>
</p>

## Big Data 6:00 pm - 7:00 pm

### :necktie: Student
* Name: José Miguel Aguilar López
* Career: Ing. Sistemas Computacionales

### :necktie: Student
* Name: José Ivan Torres Negrete
* Career: Ing. Sistemas Computacionales

### :necktie: Student
* Name: Damaris Villegas Carmona
* Career: Ing. Sistemas Computacionales

**import the corresponding libraries**

    package org.apache.spark.examples.ml
    import org.apache.spark.ml.classification.NaiveBayes
    import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
    import org.apache.spark.sql.SparkSession

**Create de scala object and main method**

    object NaiveBayesExample {
    def main(){
        val spark = SparkSession
        .builder
        .appName("NaiveBayesExample")
        .getOrCreate()
        }
    }

**Load the data stored in LIBSVM format as a DataFrame.**

    val data = spark.read.format("libsvm").load("C:\datos_masivos\spark-2.4\data\mllib\sample_libsvm_data.txt")

**Split the data into training and test sets (30% held out for testing**

    val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3), seed = 1234L)

**Train a NaiveBayes model.**

    val model = new NaiveBayes()
      .fit(trainingData)

**Select example rows to display.**

    val predictions = model.transform(testData)
    predictions.show()

**Select (prediction, true label) and compute test error**

    val evaluator = new MulticlassClassificationEvaluator()
    .setLabelCol("label")
    .setPredictionCol("prediction")
    .setMetricName("accuracy")
    val accuracy = evaluator.evaluate(predictions)
    println(s"Test set accuracy = $accuracy")

    spark.stop()