package CaesarCipher

object cip{
  def main(args:Array[String])
{
    val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ" 
    
    val a=scala.io.StdIn.readLine("Shift By: ")
    
    val shift=(a.toInt+alphabet.size)% alphabet.size
    
    val inputText=scala.io.StdIn.readLine("Secret Message: ")
    
    println("")
    
    val outputText=inputText.map((c: Char) => {
    
    val y=alphabet.indexOf(c.toUpper)
    
    if(y == -1)
    {
      c
    }
    else
    {
     alphabet((y + shift) % alphabet.size)
    }
    });
    
    println("Cipher Text: "+outputText)
    
    println("")
   
    val Text=outputText.map((c: Char) => {
    
    val y=alphabet.indexOf(c.toUpper)
    
    if(y == -1)
    {
      c
    }
    else
    {
     alphabet((y - shift) % alphabet.size)
    }
    });
    
    println("Plain Text: "+Text)
}
 
}  
 

    


