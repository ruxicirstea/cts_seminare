package ro.ase.cts.SimpleFactory.main;

import ro.ase.cts.SimpleFactory.Factory;
import ro.ase.cts.SimpleFactory.Jucator;
import ro.ase.cts.SimpleFactory.TipJucator;

public class Main {
    public static void main(String[] args)
    {
        Factory factory =new Factory();
        Jucator portar = factory.getJucatori(TipJucator.Portar,"Gigel");
        Jucator fundas =factory.getJucatori(TipJucator.Fundas,"Bogdan");
        System.out.println( portar.toString());
        System.out.println( fundas.toString());
    }
}
