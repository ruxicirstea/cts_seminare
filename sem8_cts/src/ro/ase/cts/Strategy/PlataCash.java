package ro.ase.cts.Strategy;

public class PlataCash implements ModPlata {
    @Override
    public void realizeazaPlata(int suma) {
        System.out.println("S-a realizat plata cash in valoare de "+suma);
    }
}
