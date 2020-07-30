package Assignment5

class Rational(x:Int,y:Int)
{
   def numer=x
   def denom=y
      
 def neg = new Rational(-this.numer,this.denom)
     
}

object negative {
  def main(args:Array[String])
  {

    val p=new Rational(2,7)
    
    
    println("Rational number:"+(p.numer,p.denom))
 
    println("Negation of above rational number:"+(p.neg.numer,p.neg.denom))
 
   }
}
