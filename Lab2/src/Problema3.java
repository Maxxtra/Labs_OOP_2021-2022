import java.util.*;

public class Problema3 {
    public  static int remove(Vector<Integer> arr, int x)
    {
        int counter = 0;

        for (int i = 0; i < arr.size(); i++)
            if (arr.get(i) == x) {
                counter++;
                arr.remove(i);
                i--;
            }

        return counter;
    }

    public static void main(String[] args) {
        Vector<Integer> array = new Vector<Integer>();
        Random helper = new Random();

        while (array.size() != 20)
            array.add(helper.nextInt(10));

        System.out.println("String that we work on " + array.toString());
        System.out.println("Subpunctul 1: ");

        remove(array, 1);
        System.out.println(array.toString());
        System.out.println("\nSubpunctul 2:\n");

        int sum = 0;
        int maxim = 0;
        int minim = 11;
        int poz = 0;

        for (int i = 0; i < array.size(); i++)
        {
            sum += array.get(i);

            if (array.get(i) > maxim)
                maxim = array.get(i);

            if (array.get(i) < minim)
            {
                minim = array.get(i);
                poz = i;
            }
        }

        System.out.println("Valoare maxima este:" + maxim + "\nPozitia valorii minime este: " + poz + "\nMedia aritmetica este:"  + sum / array.size());
    }
}
