package ro.ase.cts.command;

public class ContBancar {
    //executant
    private String iban;
    private float sold;

    public ContBancar(String iban, float sold) {
        this.iban = iban;
        this.sold = sold;
    }

    public void constituire(float sumaInitiala)
    {
        this.sold=sumaInitiala;
        System.out.println("S-a constituit constul cu suma "+sold);
    }

    public void retragere(float sumaRetrasa)
    {
        if(sold>=sumaRetrasa)
        {
            sold-=sumaRetrasa;
            System.out.println("s-a retrat suma " +sumaRetrasa);
        }
        else
        {
            System.out.println("Fonduri insuficiente");
        }
    }
    public void depunere(float suma)
    {
        this.sold+=suma;
        System.out.println("S-a depus "+suma);
    }

}
