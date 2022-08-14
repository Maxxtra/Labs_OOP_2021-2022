import java.io.FileNotFoundException;

public interface Visitor {
    void visit (Director f);
    void visit (Fisier f) throws FileNotFoundException;
}
