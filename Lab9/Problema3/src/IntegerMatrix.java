import java.util.*;

public class IntegerMatrix extends AMatrix<Integer> {
    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();

        this.forEach(el -> {
            el.forEach(element -> {ans.append(element).append(" ");});
            ans.append('\n');
        });

        return ans.toString();
    }

    @Override
    public Integer sum(Integer obj1, Integer obj2) {
        return obj1 + obj2;
    }

    @Override
    public AMatrix<Integer> addition(AMatrix<Integer> m1) {
        IntegerMatrix m2 = new IntegerMatrix();

        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < this.get(i).size(); j++) {
                m1.get(i).set(j, sum(m1.get(i).get(j), this.get(i).get(j)));
            }
        }

        return m1;
    }
}

