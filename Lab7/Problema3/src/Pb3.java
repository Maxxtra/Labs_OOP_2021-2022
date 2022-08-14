import java.io.*;
import java.util.*;

public class Pb3 {
    public static void main(String[] args) {
        SListSet ls1 = new SListSet();
        SListSet ls2 = new SListSet(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2) < 0)
                    return 1;
                else
                    if (o1.compareTo(o2) > 0)
                        return -1;


                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return obj == this;
            }
        });

        try {
            RandomAccessFile raf = new RandomAccessFile("C:\\Users\\alex_\\Desktop\\ACS\\Anul2\\Sem1\\POO\\Lab7\\Problema1\\src\\test01.txt" , "r");

            String tmp;
            while((tmp = raf.readLine()) != null) {
                Scanner wordScanner = new Scanner(tmp);
                wordScanner.useDelimiter("[^a-zA-Z]+");;
                while (wordScanner.hasNext()) {
                    String s = wordScanner.next();
                    ls1.add(s);
                    ls2.add(s);
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("Primul");
        for (Object ob : ls1) {
            System.out.println((String) ob);
        }

        System.out.println("Al doilea");

        for (Object ob : ls2) {
            System.out.println((String) ob);
        }
    }
}