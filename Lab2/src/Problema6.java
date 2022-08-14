import java.util.*;

public class Problema6 {
    public static void main(String[] args)
    {
        Vector array = new Vector();
        HashMap<String, Integer> mp = new HashMap<>();

        array.add(1); array.add(2);
        array.add(1.1); array.add(2.2);
        array.add(10000.111); array.add(20000.22);
        array.add("We have OOP laboratory");
        array.add('a'); array.add('b'); array.add('c');
        array.add(true); array.add(false);

        for (int i = 0; i < array.size(); i++)
                if (!mp.containsKey(array.get(i).getClass().toString()))
                    mp.put(array.get(i).getClass().toString(), 1);
                 else
                    mp.replace(array.get(i).getClass().toString(), mp.get(array.get(i).getClass().toString()) + 1);


        System.out.println(mp);
    }
}


