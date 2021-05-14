package spital.composite.main;

import spital.composite.classes.Departament;
import spital.composite.classes.Sectie;

public class Main {
    public static void main(String[] args) throws Exception {
        Departament departament =new Departament("Boli Interne");
        Departament d2=new Departament("Endocrinologie");

        Sectie sectie =new Sectie("sectie 1");
        Sectie sectie2=new Sectie("sectie2");
        d2.adaugaDiviziune(sectie);
        d2.descriere();
        departament.adaugaDiviziune(d2);

        departament.adaugaDiviziune(sectie2);
        departament.descriere();
        sectie.adaugaDiviziune(d2);

    }
}
