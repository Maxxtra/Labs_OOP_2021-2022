import java.util.Collection;

public interface Strategy {
    Student getBestStudent(Collection<Grade> grades);
}
