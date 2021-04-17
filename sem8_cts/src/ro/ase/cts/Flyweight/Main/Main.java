package ro.ase.cts.Flyweight.Main;

import ro.ase.cts.Flyweight.Client;
import ro.ase.cts.Flyweight.FlyweightFactory;
import ro.ase.cts.Flyweight.Rezervare;

public class Main {
    public static  void main(String[] args)
    {
        Rezervare rezervare1=new Rezervare(1,3,"12:00");
        Rezervare rezervare2=new Rezervare(2,4,"13:00");
        Rezervare rezervare3=new Rezervare(3,6,"12:00");

        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Client client1 =flyweightFactory.getClient("0723892973");
        client1.printeazaRezervare(rezervare1);
        //In memorie vom avea doar 2 obiecte de tip client
        flyweightFactory.getClient("0928379833").printeazaRezervare(rezervare2);
        flyweightFactory.getClient("0723892973").printeazaRezervare(rezervare3);

    }
}
