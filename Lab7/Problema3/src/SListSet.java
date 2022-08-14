import java.util.*;

public class SListSet extends LinkedList implements SortedSet {
    Comparator cmp;

    public SListSet() {
        super();
        cmp = null;
    }

    public SListSet(Comparator cmp) {
        super();
        this.cmp = cmp;
    }

    @Override
    public Comparator comparator() {
        return this.cmp;
    }

    @Override
    public SortedSet subSet(Object fromElement, Object toElement) {
        SListSet ans = new SListSet();
        int index = this.size();
        for (Object obj : this)
            if (obj == fromElement)
                index = this.indexOf(obj);

        for (int i = index; i < this.size(); ++i)
            if (this.get(i) != toElement)
                ans.add(this.get(i));
            else
            {
                ans.add(this.get(i));
                return ans;
            }
        return ans;
    }

    @Override
    public SortedSet headSet(Object toElement) {
        SListSet ans = new SListSet();
        for (Object obj : this)
            if (obj == toElement)
            {
                ans.add(obj);
                return ans;
            }
            else
                ans.add(obj);
        return ans;
    }

    @Override
    public boolean add(Object o) {
        if (!this.contains(o) && super.add(o))
        {
            this.sort(comparator());
            return true;
        }

        return false;
    }

    @Override
    public SortedSet tailSet(Object fromElement) {
        SListSet ans = new SListSet();
        int index = this.size();
        for (Object obj : this)
            if (obj == fromElement)
                index = this.indexOf(obj);

        for (int i = index; i < this.size(); ++i)
            ans.add(this.get(i));
        return ans;
    }

    @Override
    public Object first() {
        return super.getFirst();
    }

    @Override
    public Object last() {
        return super.getLast();
    }
}
