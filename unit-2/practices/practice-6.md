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
    import org.apache.spark.ml.classification.LinearSVC
    import org.apache.spark.sql.SparkSession

**Create de scala object and main method**

    object LinearSVCExample {

    def main()= {
        val spark = SparkSession
        .builder
        .appName("LinearSVCExample")
        .getOrCreate()
        }
    }

**Load training data**

    val training = spark.read.format("libsvm").load("C:\datos_masivos\spark-2.4\data\mllib\sample_libsvm_data.txt")

    val lsvc = new LinearSVC()
      .setMaxIter(10)
      .setRegParam(0.1)

**Fit the model**

    val lsvcModel = lsvc.fit(training)

**Print the coefficients and intercept for linear svc**
   
    println(s"Coefficients: ${lsvcModel.coefficients} Intercept: ${lsvcModel.intercept}")