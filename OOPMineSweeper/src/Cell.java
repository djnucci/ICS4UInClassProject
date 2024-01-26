public class Cell {
	boolean isVisible, isMine, isFlagged;
	byte nearbyMines;

	public Cell() {
		
	}

	public void makeMine() {
		isMine = true;
	}

	public void makeVisible() {
		isVisible = true;
	}
	
	@Override
	public String toString() {
		return !isVisible ? "#" : isMine ? "X" : "P";
	}
}
