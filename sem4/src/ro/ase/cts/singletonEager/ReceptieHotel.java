package ro.ase.cts.singletonEager;

public class ReceptieHotel {

    private String numeReceptioner;
    private int etaj;
    private String numeHotel;
    public static final ReceptieHotel instanta=new ReceptieHotel("Gigel",3,"Meridian");

    private ReceptieHotel(String numeReceptioner, int etaj, String numeHotel) {
        super();
        this.numeReceptioner = numeReceptioner;
        this.etaj = etaj;
        this.numeHotel = numeHotel;
    }

    public void setNumeReceptioner(String numeReceptioner) {
        this.numeReceptioner = numeReceptioner;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public void setNumeHotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }

    public static ReceptieHotel getInstanta() {
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ReceptieHotel{");
        sb.append("numeReceptioner='").append(numeReceptioner).append('\'');
        sb.append(", etaj=").append(etaj);
        sb.append(", numeHotel='").append(numeHotel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
