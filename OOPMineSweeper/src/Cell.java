public class Cell {
	byte nearbyMines; // maximum 8
	boolean isMine, isFlagged, isVisible;
	
	public Cell () {
	}

	public String toString() {
		return ".";
	}
}
