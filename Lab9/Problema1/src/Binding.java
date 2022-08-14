public class Binding{
    public static void main(String args[]) {
        Hero h1 = new Warrior(), h2 = new Ninja();
        Hero h3 = new Rogue();
        BadLuck bl = new StormFire();
        bl.execute(h1);
        bl.execute(h2);
        bl.execute(h3);
    }
}

abstract class BadLuck {
    abstract void execute(Hero h);
    abstract void execute(Warrior w);
    abstract void execute(Ninja n);
    abstract void execute(Rogue r);
}