**1. Create a list called "list" with the elements "red", "white", "black"**

    var lista = List("red", "white","black")
    lista

**2. Add 5 more items to "list" "green" ,"yellow", "blue", "orange", "pearl"**

    lista = lista :+ "green" :+ "yellow" :+ "blue" :+ "orange" :+ "pearl"

**3. Bring the items from "list" "green", "yellow", "blue"**

    lista slice(3,6)

**4. Create an array of numbers in the range 1-1000 in steps of 5 at a time**

    var array = Array.range(1,1000,5)

**5. What are the unique elements of the list List(1,3,3,4,6,7,3,7) use conversion to sets**

    var Lista = List(1,3,3,4,6,7,3,7)
    num.toSet

**6. Create a mutable map named names containing the following: "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"**

    val names = collection.mutable.Map(("Jose",20),("Luis",24)("Ana",23),("Susana",27))

**6a. Print all the keys on the map**
    
    names.keys

**6b. Add the following value to the map("Miguel", 23)**

    name +=("Miguel" -> 23)