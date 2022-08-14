import java.util.*;

public class Punct {
    private int x, y;

    public Punct()
    {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "Punct{" + "x=" + x + ", y=" + y + '}';
    }

    double distance(int a, int b) {
        return Math.sqrt((this.x - a) * (this.x - a) + (this.y - b) * (this.y - b));
    }

    double distance(Punct p) {
        return distance(p.getX(), p.getY());
    }

}

class Test1
{
    public static void main(String[] args)
    {
        Punct A = new Punct();
        A.setX(1);
        A.setY(2);
        Punct B = new Punct();
        B.setX(-1);
        B.setY(3);

        System.out.println(A.distance(B));
    }
}