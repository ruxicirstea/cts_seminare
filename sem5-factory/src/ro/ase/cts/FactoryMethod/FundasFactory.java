package ro.ase.cts.FactoryMethod;

public class FundasFactory implements Factory{
    @Override
    public Jucator getJucator(String nume) {
        return new Fundas(nume);
    }
}
