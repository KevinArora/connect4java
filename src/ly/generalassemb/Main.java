package ly.generalassemb;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	int[][] board = new int[6][7];
    printGrid(board);

    }

    public static void printGrid(int[][] board){
        for (int r = 0; r<board.length;r++){
            for (int c = 0; c <board.length;c++){
                board[r][c] = 0;  // Initialize the cell
                System.out.print("[" +board[r][c] + "]"); // Display the content of cell board
            }
            System.out.println();  // go to next line
        }


    }


}
