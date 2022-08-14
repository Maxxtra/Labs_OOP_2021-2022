import java.util.Vector;

public class Student extends Person{
    Vector<String> courses;
    Vector<Object> grades;

    public Student(String name, String address) {
        super(name, address);
        courses = new Vector<>();
        grades = new Vector<>();
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        grades.add(grade);
    }


    public double getAverageGrade() {
        double sum = 0;

        for (Object obj : grades) {
            sum = sum + (double)obj;
        }

        return sum / grades.size();
    }

    public void printGrades() {
        StringBuilder ans = new StringBuilder();
        ans .append("\n Grades: \n");

        for (Object val : grades) {
            ans.append(val);
            ans.append(", ");
        }

        System.out.println(ans.toString());
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder(super.toString());

        ans .append("\n Courses: \n");

        for (String val : courses) {
            ans.append(val);
            ans.append(", ");
        }

        ans .append("\n Grades: \n");

        for (Object val : grades) {
            ans.append(val);
            ans.append(", ");
        }

        return ans.toString();
    }
}