import java.util.*;

class NumarNegativ extends Exception {
    NumarNegativ() {
        System.out.println("Numarul introdus este negativ!");
    }
}

public class Problema3 {
    Vector<Integer> vect;

    Problema3() {
        vect = new Vector<>();
    }

    public void myRead() throws NumarNegativ {
        Scanner sn = new Scanner(System.in);
        int x;
        x = sn.nextInt();

        while (x >= 0) {
            vect.add(x);
            x = sn.nextInt();

            sn.next

            if (x < 0) {
                throw new NumarNegativ();
            }
        }
    }

    public static void main(String[] args) throws NumarNegativ {
        Problema3 prob = new Problema3();

        try {
            prob.myRead();
        } catch (NumarNegativ e) {
            e.printStackTrace();
        }

        System.out.println(Collections.max(prob.vect));
    }
}