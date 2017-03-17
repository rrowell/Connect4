
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
                board[row][col] = " ";
            }
        }
    }
    public boolean check(){
        /**
         * 
         */
        for (int row = 0; row<board.length; row++){
            for (int col = 0; col < 7; col++){
                if(checkDown(row, col)|| checkRight(row, col)|| checkRD(row, col)||checkLD(row, col)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean checkDown(int row, int col){
        if (row > 3 || board[row][col].equals(" ")){
            return false;
       }
       else if (board[row][col].equals(board[row+1][col])&&board[row][col].equals(board[row+2][col]) &&board[row][col].equals(board[row+3][col])){
           return true;
        }
      else{
           return false;
        }
    }
    public boolean checkRight(int row, int col){
        if (col > 4 || board[row][col].equals(" ")){
            return false;
       }
       else if (board[row][col].equals(board[row][col+1])&&board[row][col].equals(board[row][col+2])&&board[row][col].equals(board[row][col+3])){
           return true;
        }
      else{
           return false;
        }
    }
    public boolean checkRD(int row, int col){
          if (col > 4 && row  >3 || board[row][col].equals(" ")){
            return false;
       }
       else if (board[row][col].equals(board[row+1][col+1])&&board[row][col].equals(board[row+2][col+2])&&board[row][col].equals(board[row+3][col+3])){
           return true;
        }
      else{
           return false;
        }
    }
    public boolean checkLD(int row, int col){
            if (col < 3 && row  >3 || board[row][col].equals(" ")){
            return false;
       }
       else if (board[row][col].equals(board[row+1][col-1])&&board[row][col].equals(board[row+2][col-2])&&board[row][col].equals(board[row+3][col-3])){
           return true;
        }
      else{
           return false;
        }
    }
    public boolean drop(int pos){
        if (pos
    }
}
