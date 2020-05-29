package ass3

object A3Q5 {
  def main(args:Array[String])
  {
  print("Enter the number:")
  var num:Int=scala.io.StdIn.readInt()
  var sum=0
  while(num>=0)
  {
    if(EvenOdd(num,2)==0)
    {
      sum+=num
    }
    num=num-1
  }
  println("The sum of even numbers to:"+sum)
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