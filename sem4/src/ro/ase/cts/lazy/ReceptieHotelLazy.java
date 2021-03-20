package ro.ase.cts.lazy;

public class ReceptieHotelLazy {
    private String numeReceptioner;
    private int etaj;
    private String numeHotel;

    private static  ReceptieHotelLazy instanta = null;

    private ReceptieHotelLazy(String numeReceptioner, int etaj, String numeHotel) {
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

    public static ReceptieHotelLazy getInstanta(String numeReceptioner,int etaj,String numeHotel) {
        if(instanta ==null)
        {
            instanta=new ReceptieHotelLazy(numeReceptioner,etaj,numeHotel);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReceptieHotelLazy{");
        sb.append("numeReceptioner='").append(numeReceptioner).append('\'');
        sb.append(", etaj=").append(etaj);
        sb.append(", numeHotel='").append(numeHotel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
