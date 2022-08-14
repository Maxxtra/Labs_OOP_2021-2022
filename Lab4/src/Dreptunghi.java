public class Dreptunghi extends Paralelogram {
    public Dreptunghi(int latura1, int latura2, double unghi1 ) {
        super(latura1, latura2, unghi1, unghi1);
    }

    @Override
    public double arie() {
        return this.latura1 * this.latura2;
    }
}