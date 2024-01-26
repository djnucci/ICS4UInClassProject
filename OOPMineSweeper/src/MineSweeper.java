import java.util.Scanner;

public class MineSweeper {
	Grid playingGrid;
	Difficulty difficulty;
	long startTime;

	public MineSweeper(String diff) {
		startTime = System.currentTimeMillis();
		difficulty = new Difficulty(diff);
		playingGrid = new Grid(difficulty.getWidth(), difficulty.getHeight(), difficulty.getNumMines());
	}

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a game difficulty (Easy, m, hard): ");
		MineSweeper game = new MineSweeper(scan.nextLine());

		String sanitizedUserInput = "";
		do {
			System.out.print("\033[2J"); // Clears the console
			System.out.println((System.currentTimeMillis() - game.startTime) / 1000.0);
			System.out.println(game.playingGrid);
			System.out.println("Please enter a coordinate: ");
			sanitizedUserInput = sanitizeString(scan.nextLine());
			if (sanitizedUserInput.equals("")) {
				System.out.println("Not a valid input. Please try again.");
				Thread.sleep(300);
				continue;
			}
			String[] splitInput = sanitizedUserInput.split(",");
			if (splitInput.length < 2) {
				System.out.println("Not a valid input. Please try again.");
				Thread.sleep(300);
				continue;
			}
			int x = Integer.parseInt(splitInput[0].trim()) - 1;
			int y = Integer.parseInt(splitInput[1].trim()) - 1;
			if (x > game.difficulty.getWidth() || y > game.difficulty.getHeight()) {
				System.out.println("Not a valid input. Please try again.");
				Thread.sleep(300);
				continue;
			}

			Coordinate coord = new Coordinate(x, y);
			System.out.println(coord);

			game.playingGrid.cellGridArray[coord.getX()][coord.getY()].makeMine();
			game.playingGrid.cellGridArray[coord.getX()][coord.getY()].makeVisible();
		} while (!sanitizedUserInput.equals("halt"));

		
	}


	private static String sanitizeString(String str) {
		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch) || ch == ',') {
				sb.append(ch);
			}
		}

		return sb.toString();
	}
}
