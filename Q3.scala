package ass1

object Q3 {
  def main(args:Array[String])
  {
  var totalPrice=priceofBooks(60)+shippingCost(60)
  println("The total wholesale cost for 60 copies is: "+totalPrice)
  
  }
  
  def priceofBooks(x:Int):Double=
  {
  x*(24.95-(24.95*40)/100)
  }
  
  def shippingCost(x:Int):Double=
  {
  (3.00*x)+(0.75*(x-50))
  }
  
}