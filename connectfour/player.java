import java.util.Random;
/**
 * Write a description of class player here.
 *  
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player
{
    // instance variables - replace the example below with your own
    
    public String symbol;
     public boolean AI;
     public int n ;
     
    public player(String sym, boolean yayornay) {
        symbol = sym;
        AI = yayornay;
        
    }
   
    public int dropAI() {
        if(AI = true){
        Random rand = new Random();
        int n = rand.nextInt(7) + 1;
       
        
        
           
        
    }
    return n;
}
}
