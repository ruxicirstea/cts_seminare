package ro.ase.cts.state;

public class Masa {
    private int cod;
    private Stare stare;

    public Masa(int cod) {
        this.cod = cod;
        this.stare =new StareLibera();
    }

   public void rezervaMasa()
    {
        if(this.stare instanceof StareLibera)
        {
            System.out.println("Masa cu codul " +this.cod+ " este rezervata");
            this.stare=new StareRezervata();
        }
        else {
            System.out.println("Masa nu poate fi rezervata!");
        }
    }
   public void ridicaRezervare()
    {
        if(this.stare instanceof StareRezervata)
        {
            System.out.println("Masa cu codul "+this.cod + "este ocupata");
            this.stare=new StareOcupata();
        }
        else{
            System.out.println("Ne pare rau dar nu aveti o rezervare!");
        }
    }
    private void ocupaMasaFaraRezervare()
    {
        if(this.stare instanceof StareLibera)
        {
            System.out.println("Masa cu codul "+this.cod + "este ocupata");
            this.stare=new StareOcupata();
        }
        else{
            System.out.println("Ne pare rau dar nu aveti o rezervare!");
        }
    }

    public void elibereazaMasa()
    {
        if(!(this.stare instanceof StareLibera) )
        {
            System.out.println("Masa cu codul "+this.cod +" este eliberata");
            this.stare=new StareLibera();
        }
        else{
            System.out.println("Masa este deja libera");
        }
    }
}
