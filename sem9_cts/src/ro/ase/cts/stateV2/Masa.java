package ro.ase.cts.stateV2;

public class Masa {
    private Stare stare;
    private int cod;

    public Masa(int cod) {
        this.cod = cod;
        this.stare=new StareLibera();
    }

    public Stare getStare() {
        return stare;
    }

     void setStare(Stare stare) {
        this.stare = stare;
    }

    public int getCod() {
        return cod;
    }

    public void rezervaMasa()
    {
        StareRezervata stareRezervata=new StareRezervata();
        stareRezervata.modificaStare(this);
    }
    public void ocupaMasa(){
        StareOcupata stareOcupata=new StareOcupata();
        stareOcupata.modificaStare(this);

    }

    public void elibereazaMasa(){
        StareLibera stareLibera=new StareLibera();
        stareLibera.modificaStare(this);

    }

    public void ridicaRezervare()
    {
        ocupaMasa();
    }

}
