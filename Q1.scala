package ass1

object Q1 {
  def main(args:Array[String])
  {
  var celTemperature=35
  convertTemperature(celTemperature)
  }
  
  def convertTemperature(t:Double)
  {
  var fahTemperature=t*1.8000+32.00
  println("Fahrenheit temperature of 35C is: "+fahTemperature+"\'F")
  }
  
}

