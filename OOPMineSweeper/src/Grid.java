import java.util.Arrays;

public class Grid {
	private int numMines, numFlagsRemaining, numUserFlags;
	private Cell[][] playingCells;

	public Grid (int width, int height, int numMines) {
		playingCells = new Cell[width][height];

		for (int i = 0; i < numMines; i++) {
			
		}

		for (int i = 0; i < playingCells.length; i++) {
			for (int k = 0; k < playingCells[i].length; k++) {
				playingCells[i][k] = new Cell();
			}
		}

		
		// populate with cells
	}

	public int getNumFlagsRemaining() {
		return numFlagsRemaining;
	}

	public int getNumMines() {
		return numMines;
	}

	public int getNumUserFlags() {
		return numUserFlags;
	}

	public Cell[][] getPlayingCells() {
		return playingCells;
	}
	
	public void setNumFlagsRemaining(int numFlagsRemaining) {
		this.numFlagsRemaining = numFlagsRemaining;
	}
	
	public void setNumMines(int numMines) {
		this.numMines = numMines;
	}

	public void setNumUserFlags(int numUserFlags) {
		this.numUserFlags = numUserFlags;
	}

	public void setPlayingCells(Cell[][] playingCells) {
		this.playingCells = playingCells;
	}

	public String toString() {
		String builder = "";
		for (Cell[] c : playingCells) {
			builder += Arrays.toString(c) + "\n";
		}
		return builder;
	}
}
