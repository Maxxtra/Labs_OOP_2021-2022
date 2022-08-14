public class Ls implements Visitor {
    public void visit (Director f) {
        System.out.println(f.getName());
        for (Repository repo: f.getChildren()) {
            System.out.println("\t" + repo.getName());
        }
    }
    public void visit (Fisier f) {
        System.out.println("Not a folder");
    }


}