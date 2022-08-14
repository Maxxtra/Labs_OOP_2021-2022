import java.util.Collection;

public class BestExamScore implements Strategy {
    @Override
    public Student getBestStudent(Collection<Grade> grades) {
        Student ans = null;
        Double value = 0.0;

        for (Grade grade : grades) {
            if (grade.getExamScore() > value) {
                value = grade.getExamScore();
                ans = grade.getStudent();
            }
        }

        return ans;
    }
}