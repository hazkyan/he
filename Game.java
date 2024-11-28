import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Dice dice;

    // Constructor
    public Game(Player player1, Player player2, Dice dice) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = dice;
    }

    // Start method for the game
    public void start() {
        Scanner scanner = new Scanner(System.in);

        // Player 1 rolls
        System.out.println(player1.getName() + ", press Enter to roll the dice...");
        waitForEnter(scanner); // Custom method to handle Enter key
        int roll1 = dice.roll();
        player1.setRoll(roll1);
        System.out.println(player1.getName() + " rolled: " + roll1);

        // Player 2 rolls
        System.out.println(player2.getName() + ", press Enter to roll the dice...");
        waitForEnter(scanner); // Custom method to handle Enter key
        int roll2 = dice.roll();
        player2.setRoll(roll2);
        System.out.println(player2.getName() + " rolled: " + roll2);

        // Determine the winner
        if (player1.getRoll() > player2.getRoll()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player2.getRoll() > player1.getRoll()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

        System.out.println("Game over. Thanks for playing!");
        scanner.close();
    }

    // Custom method to wait for the Enter key
    private void waitForEnter(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine(); // Read the entire line
            if (input.isEmpty()) {
                break; // Proceed only if Enter (empty line) is pressed
            } else {
                System.out.println("Press Enter without typing anything!");
            }
        }
    }
}
