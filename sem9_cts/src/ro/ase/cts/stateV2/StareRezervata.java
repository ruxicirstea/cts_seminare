package ro.ase.cts.stateV2;

public class StareRezervata implements Stare{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera)
        {
            System.out.println("Masa cu numarul "+masa.getCod() +" a fost rezervata");
            masa.setStare(this);
        }
        else{
            System.out.println("Masa nu poate fi rezervata");
        }
    }
}
