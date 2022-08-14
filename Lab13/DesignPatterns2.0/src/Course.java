import java.util.ArrayList;
import java.util.Collections;

public class Course {
    private String name;
    private Teacher prof;
    private ArrayList<Assistant> assistants;
    private ArrayList<Grade> grades;
    private ArrayList<Student> students;
    private Strategy strategy;

    public Course(String name) {
        this.name = name;
    }

    private Course(String name, Teacher prof, ArrayList<Assistant> assistants, ArrayList<Grade> grades, ArrayList<Student> students, Strategy strategy) {
        this.name = name;
        this.prof = prof;
        this.assistants = assistants;
        this.grades = grades;
        this.students = students;
        this.strategy = strategy;
    }

    public void add(Grade grade) {
        grades.add(grade);
        Collections.sort(grades);
    }

    public Student getBestStudent() {
        return this.strategy.getBestStudent(grades);
    }

    @Override
    public String toString() {
        return name + " " + prof.toString();
    }

    static class CourseBuilder {
        private String name;
        private Teacher prof;
        private ArrayList<Assistant> assistants;
        private ArrayList<Grade> grades;
        private ArrayList<Student> students;
        private Strategy strategy;

        public CourseBuilder(String name) {
            this.name = name;
            assistants = new ArrayList<>();
            grades = new ArrayList<>();
            students = new ArrayList<>();
        }

        public CourseBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder teacher(Teacher prof) {
            this.prof = prof;
            return this;
        }

        public CourseBuilder assistant(Assistant assistant) {
            this.assistants.add(assistant);
            return this;
        }

        public CourseBuilder grade(Grade grade) {
            this.grades.add(grade);
            return this;
        }

        public CourseBuilder strategy(Strategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public CourseBuilder student(Student stdent) {
            this.students.add(stdent);
            return this;
        }

        public Course build() {
            return new Course(name, prof, assistants, grades, students, strategy);
        }
    }
}

