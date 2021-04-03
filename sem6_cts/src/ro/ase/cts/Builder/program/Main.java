package ro.ase.cts.Builder.program;

import ro.ase.cts.Builder.Rezervare;

public class Main {

    public static void main(String[]args)
    {
        Rezervare r1= new Rezervare(1,true,false,false,true,"Jazz");
        Rezervare rezervare=new RezervareBuilder().setCod(15).setAreScaunErgonomic(true).build();
        Rezervare rezervare1=new RezervareBuilder().setCod(20).setAreBauturaInclusa(true).setGenMuzica("Electronica").build();
        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());

    }

}
