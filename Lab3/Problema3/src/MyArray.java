import java.util.*;

public class MyArray
{
    private int v[];
    private int size;

    public MyArray() {
        this(100);
    }

    public MyArray(int length)
    {
        size = 0;
        v = new int[length];
    }

    public int get(int poz)
    {
        if(poz < size)
            return v[poz];
        else
            return -1;
    }

    public void set(int pos, int value)
    {
        v[pos] = value;
        size++;
    }

    public int getSize() {
        return size;
    }
}