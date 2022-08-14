public class StormFire extends BadLuck
{
    @Override
    void execute(Hero h) {

        h.print(h);
    }

    @Override
    void execute(Warrior w) {

        w.print(w);
    }

    @Override
    void execute(Ninja n) {

        n.print(n);
    }

    @Override
    void execute(Rogue r) {

        r.print(r);
    }
}
