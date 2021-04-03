package ro.ase.cts.Builder.program;

import ro.ase.cts.Builder.Rezervare;
import ro.ase.cts.Builder.RezervareBuilder;
import ro.ase.cts.Builder.RezervareBuilderV2;

public class Main {

    public static void main(String[]args)
    {
        Rezervare r1= new Rezervare(1,true,false,false,true,"Jazz");
        Rezervare rezervare=new RezervareBuilder().setCod(15).setAreScaunErgonomic(true).build();
        Rezervare rezervare1=new RezervareBuilder(123).setAreBauturaInclusa(true).setGenMuzica("Electronica").build();
        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());

        RezervareBuilder rezervareBuilder =new RezervareBuilder();
        //shallow copy
        Rezervare r3=rezervareBuilder.setCod(22).setAreBauturaInclusa(true).build();
        Rezervare r4=rezervareBuilder.setCod(24).setAreBauturaInclusa(true).build();
        //returneaza aceeasi instanta
        System.out.println(r3);
        System.out.println(r4);

        RezervareBuilderV2 rezervareBuilderV2=new RezervareBuilderV2();
        rezervareBuilderV2.setAreBauturaInclusa(true).setAreBauturaInclusa(true);
        Rezervare rezervare2 =rezervareBuilderV2.setCod(40).build();
        System.out.println(rezervare2.toString());

    }

}
