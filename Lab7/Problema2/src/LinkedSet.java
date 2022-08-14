import java.util.LinkedList;
import java.util.Set;

public class LinkedSet extends LinkedList implements Set {

    @Override
    public boolean add(Object obj) {
        if (!this.contains(obj))
            if (super.add(obj))
                return true;
            return false;
        return false;
    }

    @Override
    public void add(int i, Object obj) {
        if (!this.contains(obj))
            super.add(i, obj);
    }

    @Override
    public Object set(int i, Object obj) {
        if (!this.contains(obj))
            return super.set(i, obj);
        return null;
    }

}
