package ro.ase.cts.chain.main;

import ro.ase.cts.chain.Cont;
import ro.ase.cts.chain.ContCredit;
import ro.ase.cts.chain.ContCurent;
import ro.ase.cts.chain.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contEconomii =new ContEconomii(1000,"RO189233");
        Cont contCredit=new ContCredit(200,"2938444");
        Cont contCurent=new ContCurent(600,"RO828933");

        contCurent.setSuccesor(contEconomii);
        contEconomii.setSuccesor(contCredit);

        contCurent.plateste(200);
        contCurent.plateste(400);
        contCurent.plateste(600);
        contCredit.plateste(200);
        contCredit.plateste(200);
    }
}
