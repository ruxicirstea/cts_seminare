package ro.ase.cts.memento.main;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;
import ro.ase.cts.memento.clase.Memento;

public class Main {
    public static void main(String[] args) {
        MeciJucat meciJucat=new MeciJucat("Dinamo","Steaua",20,100,15);
        Memento memento=meciJucat.creareMemento();
        ManagerMemento managerMemento = new ManagerMemento();
        managerMemento.adaugaMemento(memento);
        System.out.println(meciJucat.toString());
        meciJucat.setNumarSpectatori(2000);
        meciJucat.setNumarBilete(2000);
        meciJucat.setNumeEchipaOaspeti("REAL");
        managerMemento.adaugaMemento(meciJucat.creareMemento());
        System.out.println(meciJucat.toString());
        meciJucat.setMemento(managerMemento.getLastMemento());
        System.out.println(meciJucat.toString());



    }
}
