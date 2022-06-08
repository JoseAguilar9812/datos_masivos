# Decision Tree Classifier

**Import libraries for DescisionTree Model**

    package org.apache.spark.examples.mllib
    import org.apache.spark.{SparkConf, SparkContext}
    import org.apache.spark.mllib.tree.DecisionTree
    import org.apache.spark.mllib.tree.model.DecisionTreeModel
    import org.apache.spark.mllib.util.MLUtils

**Load and parse the data file**

    object DecisionTreeClassificationExample {
    def main(){
        val data = MLUtils.loadLibSVMFile(sc,"C:/datos_masivos/spark-2.4/data/mllib/sample_libsvm_data.txt")
        }
    }

**Split the data into training and test sets (30% held out for testing)**

    val splits = data.randomSplit(Array(0.7, 0.3))
    val (trainingData, testData) = (splits(0), splits(1))

**Train a DecisionTree model.  
Empty categoricalFeaturesInfo indicates all features are continuous.**

    val numClasses = 2
        val categoricalFeaturesInfo = Map[Int, Int]()
        val impurity = "gini"
        val maxDepth = 5
        val maxBins = 32
    val model = DecisionTree.trainClassifier(trainingData, numClasses, categoricalFeaturesInfo,
        impurity, maxDepth, maxBins)

**Evaluate model on test instances and compute test error**

    val labelAndPreds = testData.map { point =>
        val prediction = model.predict(point.features)
        (point.label, prediction)
        }
        val testErr = labelAndPreds.filter(r => r._1 != r._2).count().toDouble / testData.count()
        println(s"Test Error = $testErr")
        println(s"Learned classification tree model:\n ${model.toDebugString}")

**Save and load model**

    model.save(sc, "target/tmp/myDecisionTreeClassificationModel")
        val sameModel = DecisionTreeModel.load(sc, "target/tmp/myDecisionTreeClassificationModel")
        sc.stop()
**RUNNING**

    import org.apache.spark.{SparkConf, SparkContext}
    import org.apache.spark.mllib.tree.DecisionTree
    import org.apache.spark.mllib.tree.model.DecisionTreeModel
    import org.apache.spark.mllib.util.MLUtils
    defined object DecisionTreeClassificationExample

    scala> DecisionTreeClassificationExample.main()
    Test Error = 0.0
    Learned classification tree model:
    DecisionTreeModel classifier of depth 2 with 5 nodes
    If (feature 434 <= 88.5)
    If (feature 100 <= 193.5)
        Predict: 0.0
    Else (feature 100 > 193.5)
        Predict: 1.0
    Else (feature 434 > 88.5)
    Predict: 1.0