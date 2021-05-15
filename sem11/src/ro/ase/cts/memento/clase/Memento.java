package ro.ase.cts.memento.clase;

public class Memento {
    private String numeEchipaGazda;
    private String numeEchipaOaspeti;
    private int numarSpectatori;

    public Memento(String numeEchipaGazda, String numeEchipaOaspeti, int numarSpectatori) {
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
        this.numarSpectatori = numarSpectatori;
    }

    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }

    public String getNumeEchipaOaspeti() {
        return numeEchipaOaspeti;
    }

    public int getNumarSpectatori() {
        return numarSpectatori;
    }
}
