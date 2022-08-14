public class Bear extends Warrior{
    public Bear() {
        this(0, "Gusti");
    }

    public Bear(int health, String name) {
        super(health, name);
    }

    public int getDamage() {
        return 1;
    }