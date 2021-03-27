package ro.ase.cts.Prototype.main;

import ro.ase.cts.Prototype.Bilet;
import ro.ase.cts.Prototype.Client;

public class Main {
    public static void main(String []args)
    {
        Client client1=new Client("Marcel",23);
        Client client2= (Client) client1.copiaza();
        //avem 2 instante diferite
        System.out.println(client1.toString());
        System.out.println(client2.toString());

        Bilet bilet= new Bilet(23,"echipa1","echipa2","14:00");
        Bilet bilet1= (Bilet) bilet.copiaza();
        bilet1.setCod(21);
        Bilet bilet2= (Bilet) bilet.copiaza();
        bilet2.setCod(2);
        System.out.println(bilet1);
        System.out.println(bilet2);


    }
}
