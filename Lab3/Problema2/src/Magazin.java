import java.util.*;

public class Magazin
{
    String nume;
    Produs[] prods;

    public Magazin(String nume, Produs[] prods)
    {
        this.nume = nume;
        this.prods = prods;
    }

    public String toString() {
        return "Magazin{" +
                "nume='" + nume + '\'' +
                ", prods=" + Arrays.toString(prods) +
                '}';
    }

    public double getTotalMagazin()
    {
        double sum = 0;

        for (Produs i : this.prods)
            sum = sum + i.getTotalProdus();

        return sum;
    }

    public static void main(String[] args)
    {
        Magazin mag = new Magazin("Gusti", new Produs[]{new Produs("da",
                2.3,
                5), new Produs("da", 2.3, 10), new Produs("da", 2.5, 4)});

        System.out.println(mag.toString());
        System.out.println(mag.getTotalMagazin());
        System.out.println(mag.prods[0].toString());
    }
}