package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements  CardAbstract{
    private Card card;

    public DecoratorAbstract(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    @Override
    public void platesteOnline(int suma) {
        card.platesteOnline(suma);
    }

    @Override
    public void platesteNormalCuCardul(int suma) {
        card.platesteNormalCuCardul(suma);
    }
     abstract void platesteContactless(int suna);
}
