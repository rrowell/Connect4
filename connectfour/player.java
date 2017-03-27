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
     
     //player constructor with the symbol and AI boolean 
    public player(String sym, boolean yayornay) {
        symbol = sym;
        AI = yayornay;
        
    }
   //generates a random int from 1-7 for the AI player to use in the drop class
    public int dropAI() {
        if(AI = true){
        Random rand = new Random();
        n = rand.nextInt(7) + 1;

       }
            return n;
    }
}
