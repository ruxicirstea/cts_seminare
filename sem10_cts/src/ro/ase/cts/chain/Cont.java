package ro.ase.cts.chain;

public abstract class Cont {
    private Cont succesor;
    private float sold;
    private String iban;

    public Cont(float sold, String iban) {
        this.sold = sold;
        this.iban = iban;
        succesor=null;
    }

    public void setSuccesor(Cont succesor) {
        this.succesor = succesor;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public Cont getSuccesor() {
        return succesor;
    }

    public float getSold() {
        return sold;
    }

    public abstract void plateste(float suma);

}
