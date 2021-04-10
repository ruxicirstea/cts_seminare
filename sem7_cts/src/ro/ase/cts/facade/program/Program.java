package ro.ase.cts.facade.program;

import ro.ase.cts.facade.BirouDeCredite;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;
import ro.ase.cts.facade.VerificatorPersoana;

public class Program {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Gigel", "2991121793935");
        if (persoana.getVarsta() > 18) {
            if (!Politie.esteUrmarit(persoana)) {
                BirouDeCredite birouDeCredite = new BirouDeCredite();
                if (!birouDeCredite.areCredite(persoana)) {
                    System.out.println("S-a creat contul");
                }
            }
        }

        Persoana persoana1=new Persoana("Gigica","2950205451253");
        if(VerificatorPersoana.verificaPeroana(persoana1)) {
            System.out.println("S-a creat contul!");
        }
        else {
            System.out.println("ne pare rau!");
        }
    }
}