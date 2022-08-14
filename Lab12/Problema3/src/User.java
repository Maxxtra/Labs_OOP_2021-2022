public class User implements ObserverUser {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void notify(String notification) {
        System.out.println(name + " " + notification);
    }
}
