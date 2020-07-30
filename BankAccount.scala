package Assignment5

object BankAccount {
  def main(args:Array[String])
  {
    class account(id:String,n:Int,b:Double)
    {
      val nic:String=id 
      val acnumber: Int = n 
      var  balance: Double = b
    }
    
    val p=new account("976010620v",10001,-20000)
    val q=new account("945678901v",10002,50000)
    val r=new account("702345678v",10003,10000)
    val s=new account("584325790v",10004,-5000)
    val t=new account("962345609v",10005,5500)
    val u=new account("607890501v",10006,-1500)
    
    var bank:List[account]=List(p,q,r,s,t,u)
    
    val overdraft=(b:List[account])=>b.filter(x=>x.balance<0)
  
    val balance=(b:List[account])=>b.reduce((x,y)=>new account("20001978054345v",10000,x.balance+y.balance)) 
    
    val interest=(b:List[account])=>b.map(x=>(if(x.balance<0)x.balance*1.1d else x.balance*1.05d))
   
    println("***Overdraft account numbers***")
    var Overdraftacc=overdraft(bank)
    Overdraftacc.foreach(x=>print(x.acnumber+" "))
    
    var TotalBalance=balance(bank);
		println("\n\nTotal account balance: "+TotalBalance.balance);

		
		println("\n***Account balances with interest*** ")
		var interestofAccount=interest(bank);
		interestofAccount.foreach(x=>print(x+"  "));
    
    
  
  }

}