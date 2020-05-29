package ass3

object A3Q6 {
  def main(args:Array[String])
  {
   print("Enter your number:")
   var num=scala.io.StdIn.readInt()
   println("The fibnoacci series is to "+num+" , ")
   println(fibSeq(num))
  }
  def fib(n:Int):Int=n match
  {
    case x if(x==0)=>return 0
    case x if(x==1)=>return 1
    case x if(x>1)=>return (fib(x-1)+fib(x-2))
  }
  def fibSeq(n:Int):Unit=
  {
    if(n>0)
      fibSeq(n-1)
      println(fib(n))
  }
}