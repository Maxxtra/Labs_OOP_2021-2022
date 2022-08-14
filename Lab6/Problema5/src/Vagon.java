public abstract class Vagon {
    private int persoane;
    private int capacitate;

    public Vagon(int persoane, int capacitate) {
        this.persoane = persoane;
        this.capacitate = capacitate;
    }

    public int getPersoane() { return persoane;}

    public void setPersoane(int persoane) {
        this.persoane = persoane;
    }

    public int getCapacitate() { return capacitate;}

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public abstract void deschidereUsiAutomat();
    public abstract void inchidereUsiAutomat();
    public abstract void blocareGeamuri();
}