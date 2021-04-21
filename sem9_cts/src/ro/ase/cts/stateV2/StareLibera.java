package ro.ase.cts.stateV2;

public class StareLibera implements Stare{



    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera)
        {
            System.out.println("Masa cu numarul "+ masa.getCod() +" este libera");
            masa.setStare(this);

        }
        else{
            System.out.println("Masa a fost eliberata!");
        }

    }
}
