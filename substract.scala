package Assignment5

object substract {
   def main(args:Array[String])
  {
    class Rational(x:Int,y:Int)
    {
      def numer=x
      def denom=y
      
      def sub(r:Rational)= new Rational(numer * r.denom - r.numer * denom, denom * r.denom)
      
    }
    val x=new Rational(3,4)
    val y=new Rational(5,8)
    val z=new Rational(2,7)
    
   // println((x.sub(y).numer,x.sub(y).denom))
   
   // println("")
    val q=new Rational(x.sub(y).numer,x.sub(y).denom)
    
    println("Answer for (x-y-z)="+(q.sub(z).numer,q.sub(z).denom))
   
    
  }
}