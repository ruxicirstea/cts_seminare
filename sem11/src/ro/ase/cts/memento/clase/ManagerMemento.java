package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<Memento> mementoList;

    public ManagerMemento() {
        this.mementoList=new ArrayList<>();
    }

    public void adaugaMemento(Memento memento)
    {
        mementoList.add(memento);
    }

    public Memento getMemento(int pozitie)
    {
        if(mementoList!=null && pozitie>=0 && pozitie <mementoList.size())
        {
            return mementoList.get(pozitie);
        }
        else{
            throw  new IndexOutOfBoundsException();
        }
    }

    public Memento getLastMemento()
    {
        if(mementoList.size()>0)
        {
            return mementoList.get(mementoList.size()-1);
        }
        else{
            throw new IllegalArgumentException();
        }
    }



}
