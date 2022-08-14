import java.util.ArrayList;

public class Parent extends User implements Observer {
    private ArrayList<Notification> notifications;

    public Parent(String firstName, String lastName) {
        super(firstName, lastName);
        notifications = new ArrayList<>();
    }

    @Override
    public void update(Notification notification) {
        this.notifications.add(notification);
    }
}