public class Ogre extends Warrior{

    public Ogre() {
        this(10, "Gusti");
    }

    public Ogre(int health, String name) {
        super(health, name);
    }

    public int getDamage() {
        return 6;
    }
}