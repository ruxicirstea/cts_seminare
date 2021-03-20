package ro.ase.cts.main;

import ro.ase.cts.lazy.ReceptieHotelLazy;
import ro.ase.cts.singletonEager.ReceptieHotel;

public class Main {

    public static void main(String[] args) {
        ReceptieHotel receptieHotel1 = ReceptieHotel.getInstanta();
        ReceptieHotel receptieHotel2 = ReceptieHotel.getInstanta();
        System.out.println(receptieHotel1.toString());
        System.out.println(receptieHotel2.toString());
//        receptieHotel1.setEtaj(5);
//        receptieHotel2.setNumeHotel("HOTEL");
        System.out.println(receptieHotel1.toString());
        System.out.println(receptieHotel2.toString());
        ro.ase.cts.lazy.ReceptieHotelLazy receptieHotel3 = ro.ase.cts.lazy.ReceptieHotelLazy.getInstanta("Ion", 2, "Hotel");
        System.out.println(receptieHotel3.toString());

        //Lazy


    }
}
