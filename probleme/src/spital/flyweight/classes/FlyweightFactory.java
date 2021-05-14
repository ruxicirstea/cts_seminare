package spital.flyweight.classes;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Pacient> listaPacienti;

    public FlyweightFactory() {
        this.listaPacienti = new HashMap<>();
    }

    public void addPacient(Pacient pacient) {
        this.listaPacienti.put(pacient.getNrTelefon(), pacient);
    }

    public Pacient getPacient(String nrTelefon) {
        return listaPacienti.get(nrTelefon);
    }
}
