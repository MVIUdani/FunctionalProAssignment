package ass3

object A3Q4 {
  def main(args:Array[String])
  {
    print("Enter your number:")
    var num=scala.io.StdIn.readInt();
    if(EvenOdd(num,2)==1)
    {
      println(num+" is an odd number.")
    }
    else
    {
      println(num+" is an even number.")
    }
    
  }
  def EvenOdd(n:Int,x:Int=2):Int=
  {
    if(n==1)
    {
      return 1
    }
    else
    {
      if(n%2==0)
      {
        return 0;
      }
      else
      {
        return EvenOdd(n-(n-1),2)
      }
    }
  }
}