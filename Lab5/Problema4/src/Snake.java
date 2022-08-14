public class Snake  extends Warrior{
    public Snake() {
        this(0, "Gusti");
    }

    public Snake(int health, String name) {
        super(health, name);
    }

    public int getDamage() {
        return 10;
    }
}