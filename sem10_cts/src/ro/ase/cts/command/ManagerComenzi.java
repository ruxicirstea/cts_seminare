package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    List<IComanda> comenzi;

    public ManagerComenzi() {
        comenzi=new ArrayList<IComanda>();
    }

    public void invoca(IComanda comanda)
    {
        comenzi.add(comanda);
    }

    public void executaComanda()
    {
        //este o coada si preluam elementul din capul cozii
        if(comenzi.size()>0) {
        comenzi.get(0).executa();
        comenzi.remove(0);
    }
        else{
            throw new IllegalArgumentException();
        }
    }
    public void executaComenzi()
    {
            for(IComanda comanda  :comenzi)
            {
                comanda.executa();
            }
            comenzi.clear();
    }

}
