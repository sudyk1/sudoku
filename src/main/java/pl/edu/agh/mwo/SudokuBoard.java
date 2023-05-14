package pl.edu.agh.mwo;

public class SudokuBoard {
    private final int BOARD_SIZE = 9;

    private int[][] board;

    public SudokuBoard() {
        this.board =  new int[BOARD_SIZE][BOARD_SIZE];
        fillBoard0();
    }

    private void fillBoard0() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                this.board[i][j] = 0;
            }
        }
    }

    public void printBoard() {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");
            }
            for (int j = 0; j < board[i].length; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print(" | ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
