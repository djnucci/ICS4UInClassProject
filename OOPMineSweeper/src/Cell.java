public class Cell {
	byte nearbyMines; // maximum 8
	public boolean isMine, isFlagged, isVisible;
	
	public Cell() {
		nearbyMines = 0;
		isFlagged = isMine = isVisible = false;
	}

	public Cell(boolean mine) {
		
	}

	public byte getNearbyMines() {
		return nearbyMines;
	}
	
	

	public String toString() {
		return ".";
	}
}
