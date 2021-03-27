package ro.ase.cts.FactoryMethod;

public class MijlocasFactory implements Factory {
    @Override
    public Jucator getJucator(String nume) {
        return new Mijlocas(nume);
    }
}
