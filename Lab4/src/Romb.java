public class Romb extends Paralelogram {
    private double diag1, diag2;

    public Romb(int latura1, double unghi1, double unghi2) {
        super(latura1, latura1, unghi1, unghi2);
        this.diag1 = Math.sqrt(2 * latura1 * latura1 - 2 * latura1 * latura1 * Math.cos(unghi1));
        this.diag2 = Math.sqrt(2 * latura1 * latura1 - 2 * latura1 * latura1 * Math.cos(unghi2));;
    }

    public double getDiag1() {
        return diag1;
    }

    public void setDiag1(double diag1) {
        this.diag1 = diag1;
    }

    public double getDiag2() {
        return diag2;
    }

    public void setDiag2(double diag2) {
        this.diag2 = diag2;
    }

    @Override
    public double arie() {
        return this.diag1 * this.diag2;
    }
}