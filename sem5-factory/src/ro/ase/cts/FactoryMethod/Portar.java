package ro.ase.cts.FactoryMethod;

import ro.ase.cts.FactoryMethod.Jucator;

public class Portar extends Jucator {
    public Portar(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
