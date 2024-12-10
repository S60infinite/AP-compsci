/**
 * TicTacToe game
 *
 * Michael
 * PS8A
 */
import java.util.Arrays;
public class TicTacToe {
    String[][] board;
    public TicTacToe() {
        board = new String[3][3];
    }

    public void fillBoard(int i, int j, String Player) {
        board[i][j] = Player;
    }

    public boolean isEmpty(int i, int j) {
        return board[i][j] == null;
    }

    public boolean checkWin(String Player) {
        for (int r = 0; r < 3; r++) {
            if (winArr(getRow(r), Player)) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (winArr(getCol(i), Player)) {
                return true;
            }
        }
        {
            if (board[0][0] == "X" && board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            return true;
            }
            if (board[0][2] == "X" && board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            return true;
            }
            if (board[0][0] == "O" && board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            return false;
            }
            if (board[0][2] == "O" && board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            return false;
            }
        }
        return false;
    }       
    public String[] getRow(int r) {
        return board[r];
    }

    public String[] getCol(int c) {
        String[] result = new String[3];
        for (int r = 0; r < 3; r++) {
            result[r] = board[r][c];
        }
        return result;
    }

    public boolean winArr(String[] arr, String Player) {
        for (int i = 0; i < 3; i++){
            if(!Player.equals(arr[i])){
                return false;
            }
        }
        return true;
    }

    public void print(){
        for(int r =0; r<3; r++) {
            for (int c = 0; c < 3; c++) {
                if(board[r][c] == null) {    
                    System.out.print("[ ]");              
                }else{
                    System.out.print("[" + board[r][c] + "]");
                }
            }
            System.out.println();
        }
    }
}


