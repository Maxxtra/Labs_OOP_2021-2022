import java.util.*;

public class MyQueue {
    MyArray arr;
    final int Infinit = 9500;
    int indexStart, indexStop, len;

    public MyQueue() {
        this.arr = new MyArray();
        this.indexStart = 0;
        this.indexStop = -1;
        this.len = 0;
    }

    int getSize() {
        return this.len;
    }

    void enqueue(int value) {
        indexStop++;
        this.arr.set(indexStop, value);
        len++;
    }

    int dequeue()
    {
        int value = this.arr.get(indexStart);
        this.arr.set(indexStart, Infinit);
        indexStart++;
        len --;

        return value;
    }

    boolean isEmpty() {
        return getSize() == 0;
    }

    public String toString()
    {
        StringBuffer ans = new StringBuffer("{ arr = ");

        for (int i = indexStart; i <= indexStop; ++i)
        {
            ans.append(this.arr.get(i));
            ans.append(" ");
        }

        ans.append(", Infinit=" + Infinit + ", indexStart=").append(indexStart).append(", indexStop=").append(indexStop).append(", len=").append(len).append('}');

        return ans.toString();
    }

}
