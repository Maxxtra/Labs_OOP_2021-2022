public class ThirtyStrategy implements Stragety {
    @Override
    public double calcul(int aniVechime, float salariu) {
        return 1.0 * aniVechime / 30 * salariu;
    }
}
