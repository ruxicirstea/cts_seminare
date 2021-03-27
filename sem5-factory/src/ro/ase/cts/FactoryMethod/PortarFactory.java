package ro.ase.cts.FactoryMethod;

public class PortarFactory implements Factory {
    @Override
    public Jucator getJucator(String nume) {
        return new Portar(nume);
    }
}
