import java.util.*;

public class Graph extends MyList{
    int size;
    boolean[] vizat;

    public Graph(int N) {
        for (int i = 0; i <= N; ++i) {
            this.add(new MyList());
        }

        this.size = N;
        this.vizat = new boolean[N + 1];
    }

    public void add(int x, int y) {
        MyList lst = (MyList) this.get(x);
        lst.add(y);
    }

    public void dfs(int start) {
        vizat[start] = true;
        System.out.print(start + " ");

        int counter = 0;

        MyList lst = (MyList) this.get(start);

        if (lst == null) {
            return;
        }

        while (lst.get(counter) != null) {
            Object node = lst.get(counter);

            if (!vizat[(int)node]) {
                dfs((int) node);
            }

            counter++;
        }
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= size; ++i) {
            MyList lst = (MyList) this.get(i);
            ans.append(i);
            ans.append(": ");
            ans.append(lst.toString());
            ans.append('\n');
        }

        return ans.toString();
    }
}