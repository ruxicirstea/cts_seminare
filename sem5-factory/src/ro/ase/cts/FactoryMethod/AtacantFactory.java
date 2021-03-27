package ro.ase.cts.FactoryMethod;

public class AtacantFactory implements Factory{
    @Override
    public Jucator getJucator(String nume) {
        return new Atacant(nume);
    }
}
