package ass2

object A2Q2 {
  def main(args:Array[String])
  {  
   println("Income of day that ticket price is Rs.15: Rs. "+income(15,120))
   println("Income of day that ticket price is Rs.10: Rs. "+income(10,140))
   println("Income of day that ticket price is Rs.20: Rs. "+income(20,100))
   
   println("\n")
   
   println("The cost of day that ticket price is Rs.15: Rs. "+cost(120))
   println("The cost of day that ticket price is Rs.10: Rs. "+cost(140))
   println("The cost of day that ticket price is Rs.20: Rs. "+cost(100))
   
   println("\n")
   
   var a=(income(15,120)-cost(120))
   var b=(income(10,140)-cost(140))
   var c=(income(20,100)-cost(100))
   
   println("The profit of day that ticket price is Rs.15: Rs. "+a)
   println("The profit of day that ticket price is Rs.10: Rs. "+b)
   println("The profit of day that ticket price is Rs.20: Rs. "+c)
   
   println("\n")
   
   println("The hightest profit is: Rs."+math.max(math.max(a, b), math.max(b, c)))
  }
  
  def income(x:Int,y:Int):Int=
  {
    var Income=x*y
    return Income
  }
  
  def cost(y:Int):Int=
  {
    var Cost=500+(3*y)
    return Cost
  }
}