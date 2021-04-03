package ro.ase.cts.Adapter;

public class Bilet {
    private int pret;

    public Bilet(int pret) {
        this.pret = pret;
    }

    public void vinde()
    {
        System.out.println("S-a vandut biletul cu pretul "+this.pret);
    }

    public void rezerva()
    {
        System.out.println("S-a reservat biletul cu pretul "+this.pret);
    }
}
