import java.util.Scanner;

public class MineSweeper {
    private Grid playingGrid;
    private Difficulty difficulty;
    private long startTime;

    public MineSweeper(String diff) {
        difficulty = new Difficulty(diff);
        playingGrid = new Grid(difficulty.getWidth(), difficulty.getHeight());
        playingGrid.setNumMines(difficulty.getNumMines());
        
        startTime = java.lang.System.currentTimeMillis();
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a difficulty:");
        MineSweeper game = new MineSweeper(scan.nextLine());
        System.out.println(game.playingGrid);
        System.out.println(game.playingGrid.getNumMines());

        System.out.println((java.lang.System.currentTimeMillis() - game.startTime) / 1000);
        scan.close();
    }

    
}
