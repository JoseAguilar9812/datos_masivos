# :page_facing_up: Evaluation 1
## :pencil: Instructions 
**Answer the following questions with Spark DataFrames and Scala using the “CSV” Netflix_2011_2016.csv which is located in the spark-dataframes folder.**

---
## :computer: Development
1. Start a simple Spark session.
![Imagen 1](img/img_001.PNG)
2. Load the Netflix Stock CSV file, have Spark infer the data types.
![Imagen 2](img/img_002.PNG)
3. What are the names of the columns?
![Imagen 3](img/img_003.PNG)
4. How is the scheme?
![Imagen 4](img/img_004.PNG)
5. Print the first 5 columns.
![Imagen 5](img/img_005.PNG)
6. Use describe() to learn about the DataFrame.
![Imagen 6](img/img_006.PNG)
7. Create a new dataframe with a new column called "HV Ratio" which is the ratio that exists between the price of the “High” column versus the “Volume” column of shares traded for one day. Hint - is an operation
![Imagen 7](img/img_007.PNG)
8. Which day had the highest peak in the “Open” column?
![Imagen 8](img/img_008.PNG)
9. What is the meaning of the “Close” column in the context of financial information, explain it, there is no need to code anything?
    >This column refers to the price that the stock or share had at the close of the day, it was the value with which it was being sold
10. What is the maximum and minimum of the “Volume” column?
![Imagen 10](img/img_010.PNG)

11. With Scala/Spark Syntax $ answer the following:
    + How many days was the “Close” column less than $600?  
    ![Imagen 11a](img/img_011_a.PNG)
    + What percentage of the time was the "High" column greater than $500?  
    ![Imagen 11b](img/img_011_b.PNG)
    + What is the Pearson correlation between the “High” column and the “Volume” column?
    ![Imagen 11c](img/img_011_c.PNG)
    + What is the maximum of the “High” column per year?
    ![Imagen 11d](img/img_011_d.PNG)
    + What is the average of the “Close” column for each calendar month?
    ![Imagen 11e](img/img_011_e.PNG)