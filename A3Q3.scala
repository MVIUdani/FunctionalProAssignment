package ass3

object A3Q3 {
  def main(args:Array[String])
  {
   print("Enter your number:")
   var num=scala.io.StdIn.readInt()
   println("The sum of number to "+num+" is:"+sum(num))
  }
  def sum(x:Int):Int=x match
  {
    case n if(n==1)=>return 1
    case n if(n>1)=>return (n+sum(n-1))  
  }
  
}