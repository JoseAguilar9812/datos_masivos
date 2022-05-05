object practice_2 {
    def main(args: Array[String]) = {
        //1. Programming an algorithm in Scala lenguage that calculates the radius of a circle
        example1();
        //2.  Programming an algorithm in Scala lenguage tell me if a number is prime
        example2();
        //3. Given the variable var bird = "tweet", use string interpolation to print "Estoy ecribiendo un tweet"
        example3();
        //4. Given the variable var mensaje = "Hola Luke yo soy tu padre!" uses slice to extract the sequence "Luke"
        example4();
        //5. What is the difference between value (val) and a variable (var) in scala?
        example5();
        //6. Given the tuple (2,4,5,1,2,3,3.1416,23) it returns the number 3.1416
        example6();
    }
    def example1(){
        val diametro=6
        val radio=diametro/2
        println(s"El radio es de :$radio")
    }
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
    def example3(){
        var bird = "tweet"
        println(s"Estoy ecribiendo un $bird")
    }
    def example4(){
        var mensaje ="Hola Luke yo soy tu padre!";
        var luke=mensaje.slice(4,9);
        println(luke);
    }
    def example5(){
        val texto="Val define una constante con un valor, por lo que no puede modificarse durante la ejecucion de codigo.\nVar es todo lo contrario, define una variable que permite la modificacion de su contenido."
    }
    def example6(){
        val myTuple = (2,4,5,1,2,3,3.1416,23)
        println(myTuple._7)
    }
}
