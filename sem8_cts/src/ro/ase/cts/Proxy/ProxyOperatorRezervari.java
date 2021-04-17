package ro.ase.cts.Proxy;

public class ProxyOperatorRezervari implements IOperatorRezervari{
  private  OperatorRezervari operatorRezervari;
  private int nrMinPersoane;


    public ProxyOperatorRezervari(OperatorRezervari operatorRezervari, int nrMinPersoane) {
        this.operatorRezervari = operatorRezervari;
        this.nrMinPersoane = nrMinPersoane;
    }

    @Override
    public void realizeazaRezervare(String numeClient, int nrPersoane) {
        if(nrPersoane >= this.nrMinPersoane)
        {
            operatorRezervari.realizeazaRezervare(numeClient,nrPersoane);
        }
        else{
            System.out.println("Va rugam veniti fara rezervare!");
        }
    }
}
