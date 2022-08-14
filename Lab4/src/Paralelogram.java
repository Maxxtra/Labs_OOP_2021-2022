public class Paralelogram extends  Patrulater {
    public Paralelogram(int latura1, int latura2, double unghi1, double unghi2) {
        super(latura1, latura2, latura1, latura2, unghi1, unghi2, unghi1, unghi2);
    }

    public double arie() {
        return this.latura1 * this.latura2 * Math.sin(this.unghi1);
    }
}
