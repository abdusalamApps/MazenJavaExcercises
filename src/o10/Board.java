package o10;

import java.util.Random;

public class Board {

    private int[][] board;
    private int rows;
    private int cols;
    private int step;
    private int r, c;
    private Random rg;

    /**
     * Skapar en spelplan med rows rader och cols kolonner. Spelplanen �r fr�n
     * b�rjan tom, dvs alla rutorna �r tomma och generationsnumret �r 1.
     */
    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        board = new int[rows][cols];
        step = 0;
        for (int i = 0; i < cols; i++) {
            board[0][i] = -1;
            board[rows - 1][i] = -1;
        }
        for (int i = 0; i < rows; i++) {
            board[i][0] = -1;
            board[i][cols - 1] = -1;
        }
        rg = new Random();
    }

    /**
     * Ger true om det finns en individ i rutan med index row, col, false annars.
     * Om index row, col �r utanf�r spelplanen returneras false
     */
    public boolean get(int row, int col) {
        try {
            return board[row][col] > 0;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    /**
     * Lagrar v�rdet val i rutan med index row, col
     */
    public void put(int row, int col, int val) {
        board[row][col] = val;
    }

    /**
     * Tar reda p� antalet rader
     */
    public int getRows() {
        return rows;
    }

    /**
     * Tar reda p� antalet kolonner
     */
    public int getCols() {
        return cols;
    }

    /**
     * Tar reda p� aktuellt generationsnummer
     */
    public int getStep() {
        return step;
    }

    /**
     * �kar generationsnumret med ett
     */
    public void increaseGeneration() {
        step++;
    }

    /**
     * gör rutan row, col till aktuell ruta
     */
    public void setStartPosition(int row, int col) {
        r = row;
        c = col;
    }

    public boolean possibleToMove() {
        try {
            return board[r + 1][c] == 0 ||
                    board[r - 1][c] == 0 ||
                    board[r][c + 1] == 0 ||
                    board[r][c - 1] == 0;

        } catch (IndexOutOfBoundsException e) {
            return false;
        }

    }

    public void makeOneStep() {
        boolean found = false;
        while (!found) {
            int i = r;
            int k = c;
            int random = 1 + rg.nextInt(4);
            if (random == 1) {
                k++;
            } else if (random == 2) {
                k--;
            } else if (random == 3) {
                i++;
            } else {
                i--;
            }
            if (board[i][k] == 0) {
                found = true;
                r = i;
                c = k;
                step++;
                board[r][c] = step;
            }
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Board board = new Board(5, 5);
        Random randomGenerator = new Random();
        // Satt startruta
        int randomRow = randomGenerator.nextInt(5);
        int randomCol = randomGenerator.nextInt(5);
        board.setStartPosition(randomRow, randomCol);
        // Sa lange det gar att flytta
        while (board.possibleToMove()) {
            // Flytta
            board.makeOneStep();
        }
        board.print();
    }
}