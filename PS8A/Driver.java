
/**
 * Driver for TicTacToe
 *
 * Michael
 * PS8A
 */
import java.util.*;
public class Driver {
    public static void main(String[] args){
        TicTacToe TicTacToe = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        String player = "X";
        while(true){
            System.out.println("player " + player + " make your move (row,col)");
            String input = scanner.nextLine();
            int i = Integer.parseInt(input.substring(0, input.indexOf(",")));
            int j = Integer.parseInt(input.substring(input.indexOf(",") + 1));

            if(TicTacToe.isEmpty(i,j)){
                TicTacToe.fillBoard(i, j, player);
                TicTacToe.print();
                boolean win = TicTacToe.checkWin(player);
                if (win == true){
                    System.out.println("YOU WON!");
                    System.out.println("Play again? Y/N");
                    String response = scanner.nextLine();
                    if(response.equals("Y")){
                        TicTacToe = new TicTacToe();
                        player = "X";
                        win = false;
                    }else{
                        break;
                    }
                }else{
                    if(player.equals("X")){
                        player = "O";
                    }else{
                        player = "X";
                    }
                }
            }
        }
    }
}
