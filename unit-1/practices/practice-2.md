**1. Programming an algorithm in Scala language that calculates the radius of a circle**

    def example1(){
            val diametro=6
            val radio=diametro/2
            println(s"El radio es de :$radio")
        }
**2. Programming an algorithm in Scala language tell me if a number is prime**

    def example2(){
        var num=3;
        var contador=2;
        var bandera=true;
        //val primo=num1%2;
        while(bandera==true && contador<num){
            if (num<=0){
                println("El numero debe ser mayor a cero")
                }
            else if (num%contador==0){
                bandera=false;
            }
            else {
                contador=contador+1;
            }
        }
        if(bandera==true){
            println("El numero es primo")
        }
        else{
            println("El numero no es primo")
        }
    }

**3. Given the variable var bird = "tweet", use string interpolation to print "Estoy escribiendo un tweet"**

    def example3(){
        var bird = "tweet"
        println(s"Estoy ecribiendo un $bird")
    }

**4. Given the variable var mensaje = "Hola Luke yo soy tu padre!" uses slice to extract the sequence "Luke"**

    def example4(){
        var mensaje ="Hola Luke yo soy tu padre!";
        var luke=mensaje.slice(4,9);
        println(luke);
    }

**5. What is the difference between value (val) and a variable (var) in scala?**

    def example5(){
        val texto="Val define una constante con un valor, por lo que no puede modificarse durante la ejecucion de codigo.\nVar es todo lo contrario, define una variable que permite la modificacion de su contenido."
    }

**6. Given the tuple (2,4,5,1,2,3,3.1416,23) it returns the number 3.1416**

    def example6(){
        val myTuple = (2,4,5,1,2,3,3.1416,23)
        println(myTuple._7)
    }