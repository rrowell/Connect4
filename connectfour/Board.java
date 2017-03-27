
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    //creates a 2D array to create our board 
    public String[][] board = new String[6][7];
    public Board(){
    }
    //creates a blank board to start the game 
    public void startgame(){
        //creates blank board
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < 7; col++){
                board[row][col] = " ";
            }
        }
    }
    public boolean check(){
        //combines all the check methods to check the board to see if someone has won
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
        //checks for a win down if conditions apply
        if (row > 2 || board[row][col].equals(" ")){
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
        //check for a win right if the conditions apply
        if (col > 3 || board[row][col].equals(" ")){
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
        //checks for a win right diagonal if conditions apply
           if (col > 3 || row  >2 || board[row][col].equals(" ")){
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
        //checks for a win left diagonal if conditions apply
            if (col < 3 || row  >2 || board[row][col].equals(" ")){
            return false;
       }
       else if (board[row][col].equals(board[row+1][col-1])&&board[row][col].equals(board[row+2][col-2])&&board[row][col].equals(board[row+3][col-3])){
           return true;
        }
      else{
           return false;
        }
    }

    public boolean drop(int col, String car){
        //drops an x or an o onto the board 
        int space = 0;
        //finds the number of empty spaces to see how far down the board the char should drop 
        while(space < board.length && board[space][col-1].equals(" ") ){
            space++;
        }
        //checks to make sure there are any empty rows left to drop in 
        if (space > 0){
            space--;
            board[space][col-1] = car;
            return true;
        }
        else{
            return false;
        }
    }
    //prints the board to the console 
    public void printer(){
        
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col<7; col++){
                System.out.print(board[row][col] + "\t ");
            }
            System.out.println("");
        }
    }
    public boolean full(){
        //tie mechanism
        //checks to see if there is an empty space somewhere on the board left
         for (int row = 0; row < board.length; row++){
            for (int col = 0; col<7; col++){
                if (board[row][col].equals(" ")){
                    return false;
                }
            }
        }
        return true;
    }
}
