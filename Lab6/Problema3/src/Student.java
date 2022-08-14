import java.util.*;

public class Student implements Persoana {
    private String name;
    private Vector<Double> medii;

    public Student() {
        this("Student", new Vector<Double>());
    }

    public Student(String name) {
        this(name, new Vector<Double>());
    }

    public Student(String name, Vector<Double> medii) {
        this.medii = medii;
        this.name = name;
    }

    public String getName() { return name;}

    public void setName(String name) { this.name = name;}

    public Vector<Double> getMedii() { return medii;}

    public void setMedii(Vector<Double> medii) { this.medii = medii;}

    @Override
    public double calculMedieGenerala() {
        double sum = 0;

        for (Double val : this.medii) {
            sum += val;
        }

        return sum / this.medii.size();
    }

    @Override
    public String getNume() { return this.getName();}

    @Override
    public void setNume(String nume) { this.setName(nume);}

    @Override
    public void addMedie(double medie) { this.medii.add(medie);}

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;

        if (this.name.equals(student.name)) {
            if ((student.calculMedieGenerala() - this.calculMedieGenerala()) < 0) {
                return -1;
            }
            return 1;
        }

        return this.name.compareTo(student.name);

    }

    public static void main(String[] args) {
        Vector<Student> students = new Vector<>();

        Student stud1 = new Student("Alex");
        Student stud2 = new Student("Alex");
        Student stud3 = new Student("Deonise");

        stud1.addMedie(8);
        stud1.addMedie(8);
        stud1.addMedie(8);
        stud1.addMedie(8);
        stud1.addMedie(8);
        stud2.addMedie(9);
        stud2.addMedie(9);
        stud2.addMedie(9);
        stud2.addMedie(9);
        stud3.addMedie(10);
        stud3.addMedie(10);
        stud3.addMedie(10);
        stud3.addMedie(10);


        students.add(stud1);
        students.add(stud2);
        students.add(stud3);

        Collections.sort(students);

        for (Student st : students) {
            System.out.println(st.getName() + " " + st.calculMedieGenerala());
        }

    }
}