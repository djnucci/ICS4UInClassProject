public class Difficulty {
	private String diffString;
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

	public String getDiffString() {
		return diffString;
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

	public void setDiffString(String diffString) {
		this.diffString = diffString;
	}

	/**
	 * @deprecated
	 * @param difficulty
	 * @return
	 */
	public static String sanitizeDifficulty(String difficulty) {
		switch (difficulty.toLowerCase()) {
			case "easy":
			case "e":
					return "easy";
			case "hard":
			case "h":
				return "hard";
			case "medium":
			case "med":
			case "m":
			default:
				return "medium"; 
		}
	}

	/**
	 * Takes a String value and turns to a width integer
	 * @param difficulty
	 * @return int width
	 */
	public static int diffToWidth(String difficulty) {
		switch (difficulty.toLowerCase()) {
			case "easy":
			case "e":
					return 10;
			case "hard":
			case "h":
				return 24;
			case "medium":
			case "med":
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
		switch (difficulty.toLowerCase()) {
			case "easy":
			case "e":
					return 8;
			case "hard":
			case "h":
				return 20;
			case "medium":
			case "med":
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
		switch (difficulty.toLowerCase()) {
			case "easy":
			case "e":
					return 10;
			case "hard":
			case "h":
				return 99;
			case "medium":
			case "med":
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
		switch (difficulty.toLowerCase()) {
			case "easy":
			case "e":
					return new Grid(10, 8, 10);
			case "hard":
			case "h":
				return new Grid(24, 20, 99);
			case "medium":
			case "med":
			case "m":
			default:
				return new Grid(18, 14, 40); 
		}
	}
}
