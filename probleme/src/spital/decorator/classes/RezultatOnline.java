package spital.decorator.classes;

public class RezultatOnline extends RezultatOnlineAbstract{
    public RezultatOnline(Rezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void afiseazaRezultateOnline() {
        System.out.println("S-au afisat rezultatele online pentru " +super.getRezultat().getNumePacient());
    }
}
