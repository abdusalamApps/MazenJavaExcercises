package o10;

public class Life {

    private LifeBoard board;

    /**
     * Skapar ett Life-spel med spelplanen board
     */
    public Life(LifeBoard board) {
        this.board = board;
    }

    /**
     * Skapar en ny generation
     */
    public void newGeneration() {
        board.increaseGeneration();
        boolean[][] newGenBoard = new boolean[board.getRows()][board.getCols()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getCols(); j++) {
                int neighbours = getNeighbours(board, i, j);
/*
                System.out.println(
                        "Cell[" + i + "," + j + "] " + "is " + board.get(i, j) + " and has " + neighbours + " neighbours");
*/
                if (board.get(i, j)) {
                    if (neighbours >= 4 || neighbours == 0 || neighbours == 1) {
                        newGenBoard[i][j] = false;
                    }
                    if (neighbours == 2 || neighbours == 3) {
                        newGenBoard[i][j] = true;
                    }
                } else {
                    if (neighbours == 3) {
                        newGenBoard[i][j] = true;
                    }
                }
            }
        }

        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getCols(); j++) {
                board.put(i, j, newGenBoard[i][j]);
            }
        }
    }

    private int getNeighbours(LifeBoard board, int row, int col) {
        int n = 0;
        if (board.get(row - 1, col - 1)) n++;
        if (board.get(row - 1, col)) n++;
        if (board.get(row - 1, col + 1)) n++;
        if (board.get(row, col - 1)) n++;
        if (board.get(row, col + 1)) n++;
        if (board.get(row + 1, col - 1)) n++;
        if (board.get(row + 1, col)) n++;
        if (board.get(row + 1, col + 1)) n++;
        return n;
    }

    /**
     * Andrar inneh[llet i rutan med index row, col fran individ till tom
     * eller tvartom
     *
     * @param row
     * @param col
     */
    public void flip(int row, int col) {
        board.put(row, col, !board.get(row, col));
    }
}
