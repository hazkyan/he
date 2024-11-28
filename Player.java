public class Player {
    private String name;
    private int roll;

    // Constructor
    public Player(String name) {
        this.name = name;
    }

    // Setter for the roll
    public void setRoll(int roll) {
        this.roll = roll;
    }

    // Getter for the roll
    public int getRoll() {
        return roll;
    }

    // Getter for the player's name
    public String getName() {
        return name;
    }
}
