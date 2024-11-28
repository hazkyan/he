public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Dice Game!");

        // Create players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Create a dice object
        Dice dice = new Dice();

        // Create the game object
        Game game = new Game(player1, player2, dice);

        // Start the game
        game.start();
    }
}
