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
    public int winner = 0;
    public void main(){
        Board gameboard = new Board();
        player player1 = new player("o", false);
        wantAI();
        player player2 = new player("x", AI);
        gameboard.printer();
        gameboard.startgame();
        while(gameboard.check() == false){
             if(gameboard.full()== true){
                 winner = 0;
                 break;
                }
            Scanner sc = new Scanner(System.in);
             System.out.println("Enter which column you want to drop (1-7)");
             int col = sc.nextInt();
            
             while(col > 7 || col < 1) {
                      System.out.println("Enter which column you want to drop (1-7)");
                      col = sc.nextInt();
             }
             gameboard.drop(col, player1.symbol);
             gameboard.printer();
            if (gameboard.check()==true){
                winner = 1;
                break;
                
             }
             if (AI == false){
                 Scanner bc = new Scanner(System.in);
                 System.out.println("Enter which column you want to drop (1-7)");
                 col = bc.nextInt();
                 while(col > 7 || col < 1) {
                      System.out.println("Enter which column you want to drop (1-7)");
                      col = bc.nextInt();
                    }
                 gameboard.drop(col, player2.symbol);
                
           
            }
            if (AI == true){
                System.out.println("Computer's Turn");
                gameboard.drop(player2.dropAI(), player2.symbol);
            }
            gameboard.printer();
            winner = 2;
        }
        if (winner == 1){
            System.out.println("Player 1 wins, congrats");
        }
        else if (winner == 2){
            System.out.println("Player 2 wins, congrats");
        }
        else if (winner == 0){
            System.out.println("TIE YOU BOTH TAKING L's");
        }
    }
    public void wantAI(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for 1 player and 2 for 2 player");
        int numPlayers = sc.nextInt();
        if(numPlayers == 1){
            AI = true;
        }
        else{
            if(numPlayers == 2) {
                AI = false;
            }
            else{
                System.out.println("Please enter a valid number");
                wantAI();
                
            }
                
            }
    }



}