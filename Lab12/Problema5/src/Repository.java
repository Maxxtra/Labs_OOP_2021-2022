import java.io.FileNotFoundException;

public abstract class Repository {
    private String name;

    public Repository(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void accept (Visitor f) throws FileNotFoundException;

}
