package Assignment5

object Account{
  def main(args:Array[String])
  {
    class account(id:String,n:Int,b:Double)
    {
      val nic:String=id 
      val acnumber: Int = n 
      var  balance: Double = b
      
 
     def transfer(a:account,b:Double)=
       {
        this.balance=this.balance-b
        a.balance=a.balance+b
       }
    }
    val x=new account("976010620v",10001,20000)
    val y=new account("945678901v",10002,50000)
    val z=new account("702345678v",10003,10000)
     
    val n=x.transfer(y,5000)
    println("After money trasfer,")
    println("New balance of y account:"+y.balance)
    println("New balance of x account:"+x.balance)
  }
}