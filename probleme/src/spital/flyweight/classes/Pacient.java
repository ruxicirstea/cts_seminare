package spital.flyweight.classes;

public class Pacient implements Flyweight {
    private  String nume;
    private String nrTelefon;
    private String adresa;

    public Pacient(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void realizeazaInternare(Salon salon) {
        System.out.println("Pacientul "+this.toString() + "s-a internat in salonul "+salon.toString());
    }
}
