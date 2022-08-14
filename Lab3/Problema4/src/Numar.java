import java.util.*;

public class Numar
{
    int number;

    public Numar(int number) {
        this.number = number;
    }

    public int suma(int a) {
        return this.number + a;
    }

    public int suma(int a, int b) {
        return a + b;
    }

    public int suma(int a, int b, int c) {
        return a + b + c;
    }

    public int suma(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Numar x = new Numar(2);

        System.out.println(x.suma(2));
        System.out.println(x.suma(2, 3));
        System.out.println(x.suma(2, 3, 4));
        System.out.println(x.suma(2, 3, 4, 5));
    }
}