package spital.decorator.classes;

public class Rezultat implements IRezultat {
    private int cod;
    private String numePacient;

    public Rezultat(int cod, String numePacient) {
        this.cod = cod;
        this.numePacient = numePacient;
    }

    public int getCod() {
        return cod;
    }

    public String getNumePacient() {
        return numePacient;
    }

    @Override
    public void afiseazaRezultat() {
        System.out.println("S-a printat rezultatul pentru pacientul "+numePacient);
    }
}
