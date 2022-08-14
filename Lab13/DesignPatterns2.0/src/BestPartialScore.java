import java.sql.Statement;
import java.util.Collection;

public class BestPartialScore implements Strategy {
    @Override
    public Student getBestStudent(Collection<Grade> grades) {
        Student ans = null;
        Double value = 0.0;

        for (Grade grade : grades) {
            if (grade.getPartialScore() > value) {
                value = grade.getPartialScore();
                ans = grade.getStudent();
            }
        }

        return ans;
    }
}