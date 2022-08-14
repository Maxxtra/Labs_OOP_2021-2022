import java.io.*;
import java.util.*;

public class Pb4 {
    public static void main(String[] args) {
        TreeMap<String, LinkedList<Integer>> mp = new TreeMap<>();
        TreeMap<String, Integer> mp2 = new TreeMap<>();

        try {
            // create a new RandomAccessFile with filename test
            RandomAccessFile raf = new RandomAccessFile("C:\\Users\\alex_\\Desktop\\ACS\\Anul2\\Sem1\\POO\\Lab7\\Problema1\\src\\test01.txt" , "r");

            String tmp;
            int counter = 0;
            while((tmp = raf.readLine()) != null) {
                counter++;
                Scanner wordScanner = new Scanner(tmp);
                wordScanner.useDelimiter("[^a-zA-Z]+");;
                while (wordScanner.hasNext()) {
                    String s = wordScanner.next();

                    if (mp.containsKey(s)) {
                        LinkedList<Integer> lst = mp.get(s);
                        if (!lst.contains(counter)) {
                            lst.add(counter);
                        }

                        mp.put(s, lst);
                    } else {
                        LinkedList<Integer> lst = new LinkedList<>();
                        lst.add(counter);
                        mp.put(s, lst);
                    }

                    mp2.put(s, !mp2.containsKey(s) ? 1 : mp2.get(s) + 1);

                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for (Map.Entry<String, LinkedList<Integer>> entry : mp.entrySet()) {
            System.out.println(entry.getKey());
            System.out.print("[");
            for (Iterator it = entry.getValue().iterator(); it.hasNext();)
                System.out.print(it.next() + " ");
            System.out.print("]");
            System.out.println(mp2.get(entry.getKey()));
        }
    }
}