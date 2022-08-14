import java.util.*;

public class Problema4 {
    public static void main(String[] args) {
        Vector<Integer> array1 = new Vector<Integer>();
        Vector<Integer> array2 = new Vector<Integer>();
        Random helper = new Random();

        while (array1.size() != 10)
            array1.add(helper.nextInt(100));

        while (array2.size() != 10)
            array2.add(helper.nextInt(100));
        System.out.println("Strings that we work on\n" + array1.toString() + "\n" + array2.toString());

        System.out.println("The reunion of the strings: ");
        Vector<Integer> reunion = new Vector<>();

        for (int i = 0; i < array1.size(); i++)
            if (! reunion.contains(array1.get(i)))
                reunion.add(array1.get(i));

        for (int i = 0; i < array2.size(); i++)
            if (! reunion.contains(array2.get(i)))
                reunion.add(array2.get(i));

        System.out.println(reunion.toString());



        System.out.println("The intersection of the strings: ");
        Vector<Integer> intersection = new Vector<>();

        for (Integer i : array1)
            if (array2.contains(i))
                intersection.add(i);

        System.out.println(intersection.toString());




        System.out.println("The difference of the strings: ");
        Vector<Integer> difference = new Vector<>();

        for (Integer i : array1)
            if (!intersection.contains(i))
                difference.add(i);

        System.out.println(difference.toString());

    }
}
