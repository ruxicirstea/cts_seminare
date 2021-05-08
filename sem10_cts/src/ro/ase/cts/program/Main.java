package ro.ase.cts.program;

import ro.ase.cts.command.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ManagerComenzi managerComenzi=new ManagerComenzi();
        ContBancar cont=new ContBancar("RO1837839",0);
        managerComenzi.invoca(new ComandaConstituire(cont,1000));
        managerComenzi.invoca(new ComandaDepunere(cont,200));
        managerComenzi.executaComanda();
        managerComenzi.invoca(new ComandaRetragere(cont, 200));
        managerComenzi.invoca(new ComandaRetragere(cont,2000));
        managerComenzi.executaComenzi();

    }
}
