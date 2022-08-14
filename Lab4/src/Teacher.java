import java.util.Vector;

public class Teacher extends Person {
    Vector<String> courses;

    public Teacher(String name, String address) {
        super(name, address);
        this.courses = new Vector<String>();
    }

    public boolean addCourse(String course) {
        if (courses.contains(course)) {
            return false;
        }

        courses.add(course);
        return true;
    }

    public boolean removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder(super.toString());

        ans .append("\n Courses: \n");

        for (String val : courses) {
            ans.append(val);
            ans.append(", ");
        }

        return ans.toString();
    }
}