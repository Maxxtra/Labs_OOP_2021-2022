import java.util.ArrayList;

public class Channel {
    public ArrayList<ObserverUser> observers;
    public String name;

    public Channel(String name) {
        this.name = name;
        observers = new ArrayList<>();
    }

    public ArrayList<ObserverUser> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<ObserverUser> observers) {
        this.observers = observers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void subscribe(User user) {
        observers.add(user);
    }

    public void unsubscribe(User user) {
        observers.remove(user);
    }

    public void notify(String notification) {
        for (ObserverUser user : observers) {
            user.notify(notification);
        }
    }
}
