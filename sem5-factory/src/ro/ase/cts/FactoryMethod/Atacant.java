package ro.ase.cts.FactoryMethod;

import ro.ase.cts.FactoryMethod.Jucator;

public class Atacant extends Jucator {
    public Atacant(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append('}');
        return sb.toString();
    }
}
