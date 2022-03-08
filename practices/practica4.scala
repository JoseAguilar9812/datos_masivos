 //Algoritms of Fibonacci in SCALA Sintaxis

 def fibn1(num : Int) : Int = {
     if(num<2){
      return num
      }
     else {
     return fibn1(num-1)+fibn1(num-2)
    }
     }

def fibn2(num:Int) :Double = {
    if(num<2){return num}
    else{ var p = ((1+math.sqrt(5))/2)
          var j = ((math.pow(p,num)-(math.pow((1-p),num))) /(math.sqrt(5)))
          return j
 }

}

import util.control.Breaks._

def fibn3(num:Int) : Int = {
      var a = 0 
      var b = 1 
      var c = 0 
      var k = 0
     while (k < num) { 
        c = b+a 
        a = b 
        b = c 
        k = k+1} 
  return a }

def fibn4(num:Int) : Int = {
      var a = 0 
      var b = 1 
      var k = 0
     while (k < num) {  
        b = b+a 
        a = b-a
        k = k+1} 
  return a }
