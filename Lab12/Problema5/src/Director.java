import java.util.*;

public class Director extends Repository {
    private List<Repository> children = new ArrayList<>();

    public Director(String name) {
        super(name);
    }

    public List<Repository> getChildren() {
        return children;
    }

    public void accept (Visitor f) {
        f.visit(this);
    }

    public void addChild(Repository rep) {
        children.add(rep);
    }
}
