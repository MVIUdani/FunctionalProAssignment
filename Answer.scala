package Assignment6

case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
  def +(that:Point)=Point(this.x+that.x,this.y+that.y) //method 1
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy) //method 2
  
  def -(that:Point)=Point(this.x-that.x,this.y-that.y) //method3
  def distance(that:Point):Double=
  {
   val d=math.sqrt((this.x)*(this.x)+(this.y)*(this.y))
   return d
  }
  
  def invert(that:Point)=Point(this.y,this.x)//method 4
}

object Answer {
  def main(args:Array[String])
  {
   val p1=Point(2,4)
   val p2=Point(3,7)
   
   println("Add "+p1+" and "+p2+"="+(p1+p2))
   println("")
   println("Move a "+p1+" by given distance="+p1.move(5, 2))
   println("")
   val p3=p1-p2
//   println(p3)
   println("Distance between "+p1+" and "+p2+"="+p3.distance(p3))
   println("")
   println("Invert of "+p1+"="+p1.invert(p1))
  }
}