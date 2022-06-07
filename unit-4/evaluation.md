<p align="center">
    <img alt="Logo" src="https://www.tijuana.tecnm.mx/wp-content/themes/tecnm/images/logo_TECT.png" width=250 height=250>
</p>
<div align="center">

## Big Data 6:00 pm - 7:00 pm

### :necktie: Student
 Name: José Miguel Aguilar López  
 Career: Ing. Sistemas Computacionales

### :necktie: Student
 Name: José Ivan Torres Negrete  
 Career: Ing. Sistemas Computacionales

### :necktie: Student
 Name: Damaris Villegas Carmona  
 Career: Ing. Sistemas Computacionales
</div>

## Index

>### [Introduction](#intro)
>### [Algorithms used](#algorithms)
 >- [ SVM - Support Vector Machine](#svm)
 >- [ DTC - Decision Tree Classifier](#dtc)
 >- [LR - Logistic Regression](#lr)
 >- [MLPC - Multilayer Perceptron Classifier](#mlpc)
>### [Implementation](#implement)
>### [Results](#result)
>### [Conclusion](#conclusions)
>### [References](#reference)

## Introduction <a name="intro"></a>
---
Machine learning is a subfield of artificial intelligence. This helps computers learn and act like human beings with the help of algorithms and data. Given a set of data, a machine learning algorithm learns different properties of the data and infers the properties of the data that may occur in the future.

A partir de la definición anterior, se puede decir que el aprendizaje máquina es desarrollar sistemas que permitan a las computadoras aprender y generalizar comportamientos. En la actualidad, el aprendizaje máquina se aplica en diversas áreas: en medicina, en sistemas financieros o informática.

## Algorithms used <a name="algorithms"></a>
---
### SVM - Support Vector Machine <a name="svm"></a>
SVM
Support Vector Machines or Support Vector Machines (SVM) are a set of supervised learning algorithms developed by Vladimir Vapnik.
The objective of the classification problems that apply this type of supervised learning algorithms is the following; given a training set with its class labels, train an SVM to build a model that predicts the class of a new sample or test set.  
SVMs are one of the most powerful techniques in machine learning. It consists of building a hyperplane in a very high dimensional space (or even infinite) that separates the classes we have. A good separation between the classes will allow a correct classification of the new sample, that is, we need to find the maximum separation to the points closest to this hyperplane.
### DTC - Decision Tree Classifier <a name="dtc"></a>
Decision trees are one of the most used algorithms for decision making in Machine Learning. Although their predictive capacity is surpassed by other algorithms, they are frequently used due to their simple implementation and easy interpretation.  
Un árbol de decisión es un modelo predictivo que divide el espacio de los predictores agrupando observaciones con valores similares para la variable respuesta o dependiente.
### LR - Logistic Regression <a name="lr"></a>
This type of statistical model (also known as a logit model) is often used for classification and predictive analysis. Logistic regression estimates the probability of an event, such as voting or not voting, occurring based on a given data set of independent variables. Since the outcome is a probability, the dependent variable is bounded between 0 and 1. In logistic regression, a logit transformation is applied to the probabilities, that is, the probability of success divided by the probability of failure.
### MLPC - Multilayer Perceptron Classifier <a name="mlpc"></a>
Multilayer perceptron (MLP) is a complement to the neural network. It consists of three types of layers: the input layer, the output layer, and the hidden layer.  
The input layer receives the input signal to be processed. The output layer performs the required task, such as prediction and classification. An arbitrary number of hidden layers that are placed between the input and output layers are the real computational engine of the MLP. The main use cases of MLP are pattern classification, recognition, prediction, and approximation.

## Implementation <a name="implement"></a>
---
**Spark**  
Apache Spark is a multilanguage engine for running data engineering, data science, and machine learning on clusters or single-node machines. Apache Spark enables developers to perform operations on large volumes of data in clusters quickly and with fault tolerance. When we have to handle algorithms, working in memory and not on disk improves performance.

**Scala**  
Scala is a modern multi-paradigm programming language designed to express common programming patterns in a concise, elegant, and type-safe way. Easily integrates features of object-oriented and functional languages.

**Visual Studio Code**  
Visual Studio Code is a free code editor that helps you get started coding quickly. You can use it to code in any programming language, without changing editors.

## Results <a name="result"></a>
---
<table class="egt" border="0">
<tr>
  <td> Averages </td>
    <td> Used memory (MB)</td>
    <td>Time (s)</td>
    <td> Accuracy (%)</td>
    <td>Error (%)</td>
  </tr>
  <tr>
    <td>Multilayer Perceptron Classifier</td>
    <td>355.9</td>
    <td>14.64</td>
    <td>84.14</td>
    <td>15.86</td>
  </tr>
    <tr>
    <td>Logistic Regression</td>
    <td>299.6</td>
    <td>8.42</td>
    <td>84.27</td>
    <td>15.73</td>
  </tr>
    <tr>
    <td>Support Vector Machine</td>
    <td>351.4</td>
    <td>11.78</td>
    <td>84.07</td>
    <td>15.93</td>
  </tr>
   <tr>
    <td>Decision Tree Classifier</td>
    <td>377.3</td>
    <td>10.03</td>
    <td>84.19</td>
    <td>15.81</td>
  </tr>
</table>

## Conclusion <a name="conclusions"></a>
---
As we can see, the results show us that the most accurate method was Logistic Regression, followed by Decision Tree Classifier and the ones with the highest error rate were Support Vector Machine and Multilayer Perceptron Classifier.
 
We can also see that the one method that used the most amount of memory was the Decision Tree Classifier, and the one that needed less memory was Logistic Regression.
Finally the method with the best timing was Logistic Regression and the worst was Multilayer Perceptron Classifier.

When carrying out the different tests and developments of the different types of methodologies, we can see the advantages of each one of them, as well as their different limitations with respect to the type of application on this occasion.
## References <a name="reference"></a>
---
Valderma, E.. (28 Junio 2021). Introducción al Machine Learning con MATLAB. España: Marcombo.

Gala García, Y. (2013). Algoritmos SVM para problemas sobre big data (Master's thesis).

IBM. (""). What is logistic regression? . junio 06, 2022, de IBM Sitio web: https://www.ibm.com/topics/logistic-regression

S. Abirami, P. Chitra. (2020). Multilayer Perceptron. junio 2, 2022, de sciencedirect Sitio web: https://www.sciencedirect.com/topics/computer-science/multilayer-perceptron
