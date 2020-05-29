package ass3

object A3Q1 {
  def main(args:Array[String])
  {
   print("Enter your number:")
   var num=scala.io.StdIn.readInt()
   print(""+num)
   println(prime(num))

  }
  def gcd(x:Int,y:Int):Int=y match
  {
    case 0=>x
    case y if(y>x)=>gcd(y,x)
    case default =>gcd(y,x%y)
  }
  def prime(s:Int,t:Int=2):Any=t match
  {
    case p if(p==s)=>return (print(" is a prime number"))
    case p if(gcd(s,p)>1)=>return (print(" is not a prime number"))
    case p=>prime(s,t+1)
  } 
}