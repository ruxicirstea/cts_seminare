package ro.ase.cts.Program;

import ro.ase.cts.Proxy.OperatorRezervari;
import ro.ase.cts.Proxy.ProxyOperatorRezervari;

public class Main {

    public static  void main(String[] args)
    {
        OperatorRezervari operatorRezervari=new OperatorRezervari();
        operatorRezervari.realizeazaRezervare("Andrei",1);

        ProxyOperatorRezervari proxyOperatorRezervari =new ProxyOperatorRezervari(operatorRezervari,4);
        proxyOperatorRezervari.realizeazaRezervare("Ion",1);
        proxyOperatorRezervari.realizeazaRezervare("Gigel",5);
    }
}
