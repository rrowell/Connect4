import java.util.Scanner;
/**
 * Write a description of class connect4Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Connect4
{
    // instance variables - replace the example below with your own
    int numPlayers = 0;
    boolean AI = false;
    public void main(){
        Board Connect4 = new Board();
        player player1 = new player("o", false);
        wantAI();
        player player2 = new player("x", AI);
    }
public void wantAI(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1 for 1 player and 2 for 2 player");
int numPlayers = sc.nextInt();
if(numPlayers == 1){
    AI = false;
}
else{
    if(numPlayers == 2) {
        AI = true;
    }
    else{
        System.out.println("Please enter a valid number");
        wantAI();
        
    }
        
    }
}



}