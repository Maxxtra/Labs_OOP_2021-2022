public class Main {

    public static void main(String[] args) {
        Catalog catalog = Catalog.getInstance();

        catalog.addCourse(new Course("Name"));
        catalog.addCourse(new Course("Name1"));
        catalog.addCourse(new Course("Name2"));
        catalog.addCourse(new Course("Name3"));

        System.out.println(catalog);
    }
}
