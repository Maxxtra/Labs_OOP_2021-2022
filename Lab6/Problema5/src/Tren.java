import java.util.*;

public class Tren implements Comparable {
    private Vector<Vagon> vagoane;

    public Tren() {
        this(new Vector<Vagon>());
    }

    public Tren(Vector<Vagon> vagoane) {
        this.vagoane = vagoane;
    }

    public Vector<Vagon> getVagoane() {
        return vagoane;
    }

    public void setVagoane(Vector<Vagon> vagoane) {
        this.vagoane = vagoane;
    }

    public void addVagon(Vagon vagon) {
        this.vagoane.add(vagon);
    }

    public int sumOfColete() {
        int sum = 0;

        for (Vagon vagon : this.vagoane) {
            sum += vagon.getCapacitate();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();

        ans.append("Tren: \n");

        for (Vagon vagon: this.vagoane) {
            ans.append("Vagon: ");
            if (vagon instanceof CalatoriB) {
                ans.append("CalatoriB ");
            } else if (vagon instanceof  CalatoriA) {
                ans.append("CalatoriA ");
            } else if (vagon instanceof Marfa) {
                ans.append("Marfa ");
            }

            ans.append(vagon.getPersoane()).append(" ").append(vagon.getCapacitate()).append('\n');
        }

        ans.append(this.sumOfColete()).append('\n');

        return ans.toString();
    }

    @Override
    public int compareTo(Object o) {
        Tren tr = (Tren) o;

        return (tr.sumOfColete() - this.sumOfColete());
    }
}