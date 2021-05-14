package spital.facade.classes;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    public List<Integer> listaPaturiOcupate;
    public List<Integer> listaPaturiLibere;

    public Salon() {
        this.listaPaturiOcupate = new ArrayList<Integer>();
        this.listaPaturiLibere = new ArrayList<Integer>();
        listaPaturiLibere.add(2);
        listaPaturiLibere.add(3);
        listaPaturiLibere.add(5);
    }

    public List<Integer> getListaPaturiOcupate() {
        return listaPaturiOcupate;
    }

    public List<Integer> getListaPaturiLibere() {
        return listaPaturiLibere;
    }

    public void ocuparePat(int numar)
    {
        listaPaturiLibere.remove(numar);
        listaPaturiOcupate.add(numar);
    }
   public void eliberarePat(int numar)
    {
        listaPaturiLibere.add(numar);
        listaPaturiOcupate.remove(numar);
    }



}
