package ass1

object Q2 {
   def main(args:Array[String])
  {
  var radius=5
  volumeofSphere(radius)
  }
  
  def  volumeofSphere(r:Double)=
  {
  var volume=(4*math.Pi*r*r*r)/3
  println("The volume of a sphere is: "+ volume)
  }
  
}
