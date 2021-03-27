package ro.ase.cts.FactoryMethod;

public class Mijlocas extends Jucator {
    public Mijlocas(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mijlocas{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
