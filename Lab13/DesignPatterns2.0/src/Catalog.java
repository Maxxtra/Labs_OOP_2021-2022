import java.util.ArrayList;

public class Catalog implements Subject{
    private static Catalog instance;
    private ArrayList<Course> courses;
    private ArrayList<Observer> observers;

    private Catalog() {
        courses = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static Catalog getInstance() {
        if (instance == null) {
            synchronized (Catalog.class) {
                if (instance == null) {
                    instance = new Catalog();
                }
            }
        }

        return instance;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "courses=" + courses +
                '}';
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Grade grade) {
        for (Observer observer : observers) {
            if (grade.getStudent().isParent(observer)) {
                observer.update(new Notification("Fiu-tu a luat nota " + grade.getTotal()));
            }
        }
    }
}