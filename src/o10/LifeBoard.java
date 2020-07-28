package o10;

public class LifeBoard {

	private boolean[][] board;
	private int generation;
	private int rows;
	private int cols;

	/** Skapar en spelplan med rows rader och cols kolonner. Spelplanen �r fr�n
	    b�rjan tom, dvs alla rutorna �r tomma och generationsnumret �r 1. */	
	public LifeBoard(int rows, int cols) {
		board = new boolean[rows][cols];
		generation = 1;
		this.rows = rows;
		this.cols = cols;
	}

	/** Ger true om det finns en individ i rutan med index row, col, false annars. 
	    Om index row, col �r utanf�r spelplanen returneras false */
	public boolean get(int row, int col) {
		try {
			return board[row][col];
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
	}

	/** Lagrar v�rdet val i rutan med index row, col */
	public void put(int row, int col, boolean val) {
		try {
			board[row][col] = val;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of bound!");
		}

	}

	/** Tar reda p� antalet rader */
	public int getRows() {
		return rows;
	}

 	/** Tar reda p� antalet kolonner */
	public int getCols() {
		return cols;
	}

	/** Tar reda p� aktuellt generationsnummer */
	public int getGeneration() {
		return generation;
	}

	/** Okar generationsnumret med ett */
	public void increaseGeneration() {
		generation++;
	}
}