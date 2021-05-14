package spital.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Diviziune {
    private String denumire;
    private List<Diviziune> diviziuni;

    public Departament(String denumire) {
        this.denumire = denumire;
        this.diviziuni = new ArrayList<>();
    }

    @Override
    public void descriere() {
        System.out.println("Departament "+this.denumire);
        for (Diviziune d: diviziuni) {
            d.descriere();
        }
    }

    @Override
    public void adaugaDiviziune(Diviziune diviziune) {
        diviziuni.add(diviziune);

    }

    @Override
    public void stergeDiiviune(Diviziune diviziune) {
        diviziuni.remove(diviziune);
    }

    @Override
    public Diviziune getDiviziune(int pozitie) throws Exception {
        return diviziuni.get(pozitie);
    }
}
