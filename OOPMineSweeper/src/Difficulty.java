public class Difficulty {
	private int width, height, numMines;

	public Difficulty (String difficulty) {
		setWidth(diffToWidth(difficulty));
		setHeight(diffToHeight(difficulty));
		setNumMines(diffToNumMines(difficulty));
	}

	public int getHeight() {
		return height;
	}

	public int getNumMines() {
		return numMines;
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setNumMines(int numMines) {
		this.numMines = numMines;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Takes a String value and turns to a width integer
	 * @param difficulty
	 * @return int width
	 */
	public static int diffToWidth(String difficulty) {
		switch (difficulty) {
			case "Easy":
			case "easy":
			case "E":
			case "e":
					return 10;
			case "Hard":
			case "hard":
			case "H":
			case "h":
				return 24;
			case "Expert":
			case "expert":
			case "Ex":
			case "ex":
				return 30;
			case "Medium":
			case "medium":
			case "Med":
			case "med":
			case "M":
			case "m":
			default:
				return 18; 
		}
	}

	/**
	 * Takes a String value and turns to a height integer
	 * @param difficulty
	 * @return int width
	 */
	public static int diffToHeight(String difficulty) {
		switch (difficulty) {
			case "Easy":
			case "easy":
			case "E":
			case "e":
					return 8;
			case "Hard":
			case "hard":
			case "H":
			case "h":
				return 20;
			case "Expert":
			case "expert":
			case "Ex":
			case "ex":
				return 24;
			case "Medium":
			case "medium":
			case "Med":
			case "med":
			case "M":
			case "m":
			default:
				return 14; 
		}
	}

	/**
	 * Takes a String value and turns to a number of mines
	 * @param difficulty
	 * @return int width
	 */
	public static int diffToNumMines(String difficulty) {
		switch (difficulty) {
			case "Easy":
			case "easy":
			case "E":
			case "e":
					return 10;
			case "Hard":
			case "hard":
			case "H":
			case "h":
				return 99;
			case "Expert":
			case "expert":
			case "Ex":
			case "ex":
				return 120;
			case "Medium":
			case "medium":
			case "Med":
			case "med":
			case "M":
			case "m":
			default:
				return 40; 
		}
	}

	/**
	 * Returns a grid of the specified difficulty,
	 * abbr. allowed (Easy, easy, E, e for example)
	 * @param difficulty
	 * @return {@link #Grid(int, int)}
	 */
	public static Grid toGrid(String difficulty) {
		switch (difficulty) {
			case "Easy":
			case "easy":
			case "E":
			case "e":
					return new Grid(10, 8);
			case "Hard":
			case "hard":
			case "H":
			case "h":
				return new Grid(24, 20);
			case "Expert":
			case "expert":
			case "Ex":
			case "ex":
				return new Grid(30, 24);
			case "Medium":
			case "medium":
			case "Med":
			case "med":
			case "M":
			case "m":
			default:
				return new Grid(18, 14); 
		}
	}
}
