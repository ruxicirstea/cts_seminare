package spital.simpleFactory.main;

import spital.simpleFactory.Factory;
import spital.simpleFactory.PersonalMedical;
import spital.simpleFactory.TipPersonalMedical;

public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        PersonalMedical medic =factory.creeazaPeronal(TipPersonalMedical.Medic,"Gigel");
        System.out.println(medic);
        PersonalMedical asistent =factory.creeazaPeronal(TipPersonalMedical.Asistent,"Ioana");
        PersonalMedical brancardier=factory.creeazaPeronal(TipPersonalMedical.Brancardier,"Ion");
        System.out.println(asistent.toString());
        System.out.println(brancardier.toString());

    }
}
