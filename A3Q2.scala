package ass3

object A3Q2
{
  def main(args:Array[String])
  {
  print("Enter your number:")
  var num=scala.io.StdIn.readInt()
  println(primeSeq(num))
  }
  def gcd(x:Int,y:Int):Int=y match
  {
    case 0=>x
    case y if(y>x)=>gcd(y,x)
    case default =>gcd(y,x%y)
  }
  def prime(s:Int,t:Int=2):Boolean=t match
  {
    case p if(p==s)=>true
    case p if(gcd(s,p)>1)=>false
    case p=>prime(s,t+1)
  } 
  def primeSeq(n:Int):Unit=
  {
   if(prime(n))
   {
     println(n)
   }
   if(n>0)
   {
     primeSeq(n-1)
   }
  }
}