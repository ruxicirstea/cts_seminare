package ro.ase.cts.Strategy;

public class PlataCard implements ModPlata{
    @Override
    public void realizeazaPlata(int suma) {
        System.out.println("S-a realizat plata cu cardul in suma de "+suma);
    }
}
