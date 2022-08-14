import java.util.*;

class SortedVector extends Vector{
    Comparator comp;
    public SortedVector(Comparator comp){
        this.comp=comp;
    }

    public boolean add(Object obj){
        super.add(obj);
        Collections.sort(this,comp);
        return true;
    }

}

class Comp1 implements Comparator{
    public int compare(Object obj1, Object obj2){
        Pair p1=(Pair)obj1;
        Pair p2=(Pair)obj2;
        return ((Comparable)(p1.a)).compareTo(p2.a);
    }
}
class Comp2 implements Comparator{
    public int compare(Object obj1, Object obj2){
        Pair p1=(Pair)obj1;
        Pair p2=(Pair)obj2;
        return ((Comparable)(p1.b)).compareTo(p2.b);
    }
}