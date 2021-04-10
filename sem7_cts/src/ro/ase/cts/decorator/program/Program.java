package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.DecoratorConcret;
import ro.ase.cts.decorator.DecoratorContactlessTelefon;

public class Program {

    public static void main(String []args)
    {
        Card card=new Card("Ion", 3000);
        card.platesteNormalCuCardul(200);
        card.platesteOnline(100);
        DecoratorConcret decoratorConcret=new DecoratorConcret(card);
        decoratorConcret.platesteContactless(400);
        System.out.println("Soldul este: " + card.getSold());

        DecoratorContactlessTelefon decoratorContactlessTelefon =new DecoratorContactlessTelefon(card);
        decoratorContactlessTelefon.platesteContactless(300);

    }

}
