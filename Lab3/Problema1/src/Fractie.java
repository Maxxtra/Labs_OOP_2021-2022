import java.util.*;

public class Fractie {
    int numarator;
    int numitor;

    public Fractie(int numarator, int numitor)
    {
        this.numarator = numarator;
        this.numitor = numitor;
    }

    public void setNumarator(int numarator)
    {
        this.numarator = numarator;
    }

    public Fractie()
    {
        this(1, 2);
    }

    public int getNumarator()
    {
        return numarator;
    }

    public int getNumitor()
    {
        return numitor;
    }

    public void setNumitor(int numitor)
    {
        this.numitor = numitor;
    }

    public String toString()
    {
        return numarator + "/" + numitor;
    }

    public boolean equals(Object fr2)
    {
        if (fr2.getClass() == this.getClass()) {
            return ((Fractie) fr2).numarator * this.numitor == this.numarator * ((Fractie) fr2).numitor;
        }

        return false;
    }


    Fractie calculate(Fractie fr2)
    {
        Fractie ans = new Fractie();

        ans.setNumitor(this.numitor * fr2.numitor);
        ans.setNumarator(this.numarator * fr2.numitor + this.numitor * fr2.numarator);

        return ans;
    }


    public static void main(String[] args) {
        Fractie fr1 = new Fractie();
        Fractie fr2 = new Fractie(3, 4);
        Fractie fr3 = new Fractie(3, 4);

        System.out.println(fr1.calculate(fr2).toString());
        System.out.println(fr1.equals(fr2));
        System.out.println(fr1.equals(fr3));

    }
}