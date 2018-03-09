package ly.generalassemb;

import java.util.Scanner;

public class Board {
    static int[][] board = new int[6][6];
//    int[] row1 = {0, 0, 0, 0, 0, 0};
//    int[] row2 = {0, 0, 0, 0, 0, 0};
//    int[] row3 = {0, 0, 0, 0, 0, 0};
//    int[] row4 = {0, 0, 0, 0, 0, 0};
//    int[] row5 = {0, 0, 0, 0, 0, 0};
//    int[] row6 = {0, 0, 0, 0, 0, 0};

//    int[][] board = {row1, row2, row3, row4, row5, row6};

    public int getValue(int x, int y) {
        return board[x][y];
    }

    public static void main(String[] args) {
        int player = 1;
        boolean win = false;


        for (int r = 0; r<board.length;r++) {
            for (int c = 0; c < board.length; c++) {
                board[r][c] = 0;  // Initialize the cell
            }
        }
        printGrid(board);
        while (win == false){
            addChip(takeInput(), board, player);
            player++;
            printGrid(board);
            win = checkWin(board);
            if(win == true) System.out.println("player " +(player %2+1) +" wins");
        }

    }

    public static void printGrid(int[][] board){
        for (int r = 0; r<board.length;r++){
            for (int c = 0; c <board.length;c++){
//                board[r][c] = 0;  // Initialize the cell
                System.out.print("[" +board[r][c] + "]"); // Display the content of cell board
            }
            System.out.println();  // go to next line
        }
        System.out.println();

    }


    public static void addChip(int column, int[][] board,int token){
        for (int r = board.length-1;r >=0;r--){
            if(board[r][column]==0){
//                System.out.println("if happening");
                if(token%2==1) {
                    board[r][column] = 1;
                    return;
                }
                else {
                    board[r][column] = 2;
                    return;
                }
            }
        }


    }

    public static int takeInput(){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Pick a column: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
//once finished
//        reader.close();
        return n;
    }

    public static boolean checkWin(int[][] board){
        // horizontal
        for (int j = 0; j<board.length-3 ; j++ ){
            for (int i = 0; i<board.length; i++){
                if (board[i][j] == 1 && board[i][j+1] == 1 && board[i][j+2] == 1 && board[i][j+3] == 1){
                    return true;
                }
                if (board[i][j] == 2 && board[i][j+1] == 2 && board[i][j+2] == 2 && board[i][j+3] == 2){
                    return true;
                }
            }
        }
        // vertical
        for (int i = 0; i<board.length-3 ; i++ ){
            for (int j = 0; j<board.length; j++){
                if (board[i][j] == 1 && board[i+1][j] == 1 && board[i+2][j] == 1 && board[i+3][j] == 1){
                    return true;
                }
                if (board[i][j] == 2 && board[i+1][j] == 2 && board[i+2][j] == 2 && board[i+3][j] == 2){
                    return true;
                }
            }
        }
        // Diagonals
        for (int i=3; i<board.length; i++){
            for (int j=0; j<board.length-3; j++){
                if (board[i][j] == 1 && board[i-1][j+1] == 1 && board[i-2][j+2] == 1 && board[i-3][j+3] == 1)
                    return true;
                if (board[i][j] == 2 && board[i-1][j+1] == 2 && board[i-2][j+2] == 2 && board[i-3][j+3] == 2)
                    return true;

            }

        }

        for (int i=3; i<board.length; i++){
            for (int j=3; j<board.length; j++){
                if (board[i][j] == 1 && board[i-1][j-1] == 1 && board[i-2][j-2] == 1 && board[i-3][j-3] == 1)
                    return true;
                if (board[i][j] == 2 && board[i-1][j-1] == 2 && board[i-2][j-2] == 2 && board[i-3][j-3] == 2)
                    return true;
            }
        }
        return false;


    }
}
