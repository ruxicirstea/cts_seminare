package ro.ase.cts.observer.main;

import ro.ase.cts.observer.Client;
import ro.ase.cts.observer.Restaurant;

public class Main {
    public static void main(String []args)
    {
        Restaurant restaurant =new Restaurant("Restaurant","Bucuresti");
        Client client=new Client("Gigel");
        Client client1=new Client("Ion");
        Client client2=new Client("Roxana");
        restaurant.adaugaObserver(client);
        restaurant.adaugaObserver(client2);

        restaurant.realizareOfertaPret();

        restaurant.stergeObserver(client2);
        restaurant.adaugaObserver(client1);

    }
}
