public class Pensionar {
    public float salariu;
    public int aniVechime;
    public Stragety stragety;

    public Pensionar(float salariu, int aniVechime, Stragety stragety) {
        this.salariu = salariu;
        this.aniVechime = aniVechime;
        this.stragety = stragety;
    }

    public float getPensie() {
        return (float) stragety.calcul(aniVechime, salariu);
    }
}
