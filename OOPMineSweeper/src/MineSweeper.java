import java.util.Scanner;

public class MineSweeper {
    private Grid playingGrid;
    private Difficulty difficulty;
    private long startTime;

    public MineSweeper(String diff) {
        difficulty = new Difficulty(diff);
        playingGrid = new Grid(difficulty.getWidth(), difficulty.getHeight(), difficulty.getNumMines());
        
        startTime = java.lang.System.currentTimeMillis();
    }

		@Override
		public String toString() {
			return playingGrid.toString();
		}
    public static void main(String[] args) throws Exception {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a difficulty:");
			MineSweeper game = new MineSweeper(scan.nextLine());
			scan.next();
			do {
				System.out.println(game);
				System.out.println((java.lang.System.currentTimeMillis() - game.startTime) / 1000);
			} while (false);
			scan.close();
    }

    
}
