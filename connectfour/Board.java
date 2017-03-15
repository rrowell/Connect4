
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    // instance variables - replace the example below with your own
    public String[][] board = new String[6][7];
    public Board(){
    }
    public void startgame(){
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < 7; col++){
                board[row][col] = null;
            }
        }
    }
}
