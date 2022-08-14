import java.util.*;

public class Graph
{
    private int matrice[][];
    private final int Infinit = 9500;
    private int n;

    public Graph(int n)
    {
        this.n = n;
        this.matrice = new int[n + 1][n + 1];

        for (int i = 0; i < n + 1; ++i)
            for (int j = 0; j < n + 1; ++j)
                this.matrice[i][j] = Infinit;
    }

    int getSize()
    {
        return this.n;
    }

    void addArc(int v, int w, int cost)
    {
        this.matrice[v][w] = cost;
    }

    boolean isArc(int v, int w)
    {
        return this.matrice[v][w] != Infinit;
    }

    public String toString()
    {
        StringBuffer ans = new StringBuffer("mat = ");

        for (int i = 1; i <= this.n; ++i)
        {
            for (int j = 1; j <= this.n; ++j)
            {
                ans.append(this.matrice[i][j]);
                ans.append(" ");
            }

            ans.append("\n");
        }

        return ans.toString();
    }

    public int[][] floydWarshall()
    {
        int[][] result;
        result = new int[this.n+1][this.n+1];
        int k, i, j;
        for(i = 1; i <= this.n; i++) {
            for(j = 1; j <= this.n; j++)
                if(i == j)
                    result[i][j] = 0;
                 else if(isArc(i, j))
                    result[i][j] = this.matrice[i][j];
                 else
                    result[i][j] = this.Infinit;
        }

        for(k = 1; k <= this.n; k++) {
            for(i = 1; i <= this.n; i++)
                for(j = 1; j <= this.n; j++)
                {
                    int dist;
                    dist = result[i][k] + result[k][j];
                    if(result[i][j] > dist)
                        result[i][j] = dist;

                }
        }
        return result;
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addArc(1, 3, 2);
        g.addArc(1, 2, 3);
        g.addArc(2, 4, 6);
        g.addArc(2, 3, 2);
        System.out.println(g);
        System.out.println("Floyd-Warshall");
        int [][] my_matrix = g.floydWarshall();
        System.out.println("distanta minima dintre nodurile 1 si 4 este "+ my_matrix[1][4]); // rezultat - 9
    }
}