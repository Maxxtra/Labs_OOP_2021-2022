import java.util.*;

public class WarriorPack {
    private Vector warriors ;

    public WarriorPack () {
        warriors = new Vector();
    }

    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector getWarriors() {
        return warriors ;
    }

    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < warriors.length; i++) {
            if (warriors.get(i).type == Warrior.SNAKE_Warrior) {
                //Snake does 10 damage
                damage += 10;
            } else if (warriors.get(i).type == Warrior.OGRE_Warrior) {
                //Ogre does 6 damage
                damage += 6;
            } else if (warriors.get(i).type == Warrior.BEAR_Warrior) {
                //Marshmallow Man does 1 damage
                damage += 1;
            }
        }
        return damage;
    }
}
