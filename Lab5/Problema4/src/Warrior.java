import java.util.*;


public class Warrior {
    public static final int SNAKE_Warrior = 0;
    public static final int OGRE_Warrior = 1;
    public static final int BEAR_Warrior = 2;

    //0 = dead, 100 = full strength
    private int health;
    private String name;

    public Warrior (int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", type" + this.getClass() +
                "} \n";
    }
}