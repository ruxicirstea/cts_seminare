package ro.ase.cts.facade;

public class VerificatorPersoana {
    public static boolean verificaPeroana(Persoana persoana) {
        if (persoana.getVarsta() >= 18) {
            if (!Politie.esteUrmarit(persoana)) {
                BirouDeCredite birouDeCredite = new BirouDeCredite();
                if (!birouDeCredite.areCredite(persoana)) {
                    return true;
                }
            }

        }
        return false;

    }
}
