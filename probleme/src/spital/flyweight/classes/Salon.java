package spital.flyweight.classes;

public class Salon {
    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;

    public Salon(int nrSalon, int nrPat, int nrZileSpitalizare) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salon{");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", nrZileSpitalizare=").append(nrZileSpitalizare);
        sb.append('}');
        return sb.toString();
    }
}
