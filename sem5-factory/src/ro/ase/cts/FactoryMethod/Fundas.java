package ro.ase.cts.FactoryMethod;

import ro.ase.cts.FactoryMethod.Jucator;

public class Fundas extends Jucator {
    public Fundas(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
