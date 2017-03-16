
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
    public boolean check(){
        for (int row = 0; row<board.length; row++){
            for (int col = 0; col < 7; col++){
                if(checkDown(row, col)|| checkRight(row, col)|| checkLeft(row, col) || checkRD(row, col)||checkLD(row, col)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean checkDown(int row, int col){
        return false;
    }
    public boolean checkRight(int row, int col){
        return false;
    }
    public boolean checkLeft(int row, int col){
        return false;
    }
    public boolean checkRD(int row, int col){
        return false;
    }
    public boolean checkLD(int row, int col){
        return false;
    }
}
