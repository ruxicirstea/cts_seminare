package ro.ase.cts.decorator;

public class Card implements  CardAbstract{
    private  String titular;
    private int sold;

    public Card(String titular, int sold) {
        this.titular = titular;
        this.sold = sold;
    }

    public String getTitular() {
        return titular;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    @Override
    public void platesteOnline(int suma) {

        if(sold> suma)
        {
            sold-=suma;
            System.out.println("S-a realizat plata online suma "+suma);
        }

    }

    @Override
    public void platesteNormalCuCardul(int suma) {
        if(sold> suma)
        {
            sold-=suma;
            System.out.println("S-a realizat plata normala cu suma "+suma);
        }
    }
}
