package ro.ase.cts.Strategy.Program;

import ro.ase.cts.Strategy.Client;
import ro.ase.cts.Strategy.PlataCard;
import ro.ase.cts.Strategy.PlataCash;

public class Main {
    public static void main(String []args)
    {
        Client client = new Client("Gigel",new PlataCard());
        client.platesteNota(200);
        client.setModPlata(new PlataCash());
        client.platesteNota(20);
    }
}
