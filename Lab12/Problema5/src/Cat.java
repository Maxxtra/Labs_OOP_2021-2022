import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Cat implements Visitor {
    public void visit (Director f) {

    }

    public void visit (Fisier f) throws FileNotFoundException {
        File file = new File(f.getName());
        System.out.println(f.getName());
        BufferedReader br = new BufferedReader(new FileReader(file));
        int r = 0;

        try {
            while ((r = br.read()) != -1) {
                System.out.print((char) r);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}