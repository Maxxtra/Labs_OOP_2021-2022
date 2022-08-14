import java.io.FileNotFoundException;

public class Fisier extends Repository {
    public Fisier(String name) {
        super(name);
    }

    public void accept (Visitor f) throws FileNotFoundException {
        f.visit(this);
    }
}