package ass2

object A2Q1 {
  def main(args:Array[String])
  {
    var Sal=Homesalary()
    println("Home salary of an employee per week is:Rs."+Sal)
  }
  
  def Homesalary():Double=
  {
    var normalS=40*150
    var OTS=20*75
    var tax=(normalS+OTS)*0.1
    var homeS=(normalS+OTS)-tax
    return homeS
  }
}
