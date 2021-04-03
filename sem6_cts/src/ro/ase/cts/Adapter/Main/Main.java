package ro.ase.cts.Adapter.Main;

import ro.ase.cts.Adapter.Bilet;
import ro.ase.cts.Adapter.BiletAdapter;
import ro.ase.cts.Adapter.BiletOnline;

public class Main {
    public static void rezervaSiVindeBiletLaCasa(Bilet bilet)
    {
        bilet.rezerva();
        bilet.vinde();
    }

    public static void rezervaSiVindeBiletePePlatforma(BiletOnline biletOnline)
    {
        biletOnline.rezervaBiletOnline();
        biletOnline.vindeBiletOnline();
    }
    public static void main(String[]  args){
        Bilet bilet =new Bilet(20);
        rezervaSiVindeBiletLaCasa(bilet);

        BiletAdapter biletAdapter =new BiletAdapter(30);
        rezervaSiVindeBiletePePlatforma(biletAdapter);

    }





}
