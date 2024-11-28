import java.util.Random;

public class Dice {
    private Random random;

    // Constructor
    public Dice() {
        random = new Random();
    }

    // Method to roll the dice and return a number between 1 and 6
    public int roll() {
        return random.nextInt(6) + 1;
    }
}
