package ro.ase.cts.FactoryMethod.main;

import ro.ase.cts.FactoryMethod.*;

public class Main {
    private static void afiseazaJucator(Factory factory,String numeJucator)
    {
        Jucator jucator=factory.getJucator(numeJucator);
        System.out.println(jucator.toString());
    }
    public static void main(String[] args) {
        afiseazaJucator(new PortarFactory(),"Mihai");
        afiseazaJucator(new FundasFactory(),"George");
        afiseazaJucator(new MijlocasFactory(),"Ion");
    }

}
