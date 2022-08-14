import java.util.Collection;

public class BestTotalScore implements Strategy {
    @Override
    public Student getBestStudent(Collection<Grade> grades) {
        Student ans = null;
        Double value = 0.0;

        for (Grade grade : grades) {
            if (grade.getTotal() > value) {
                value = grade.getTotal();
                ans = grade.getStudent();
            }
        }

        return ans;
    }
}
