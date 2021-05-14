package spital.decorator.classes;

public abstract class RezultatOnlineAbstract implements IRezultat{
    private Rezultat rezultat;

    public RezultatOnlineAbstract(Rezultat rezultat) {
        this.rezultat = rezultat;
    }

    public Rezultat getRezultat() {
        return rezultat;
    }

    @Override
    public void afiseazaRezultat() {
        rezultat.afiseazaRezultat();
    }

    public abstract void afiseazaRezultateOnline();
}
