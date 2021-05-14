package spital.factoryMethod.main;

import spital.builder.classes.PacientBuilder;
import spital.factoryMethod.*;

public class Main {
    public static void main(String[] args) {
        Factory factoryMedic =new MedicFactory();
        PersonalMedical medic = factoryMedic.creeazaPersonalMedical("Gogel");
        PersonalMedical asistent = new AsistentFactory().creeazaPersonalMedical("Ion");
        PersonalMedical anestezist =new AnestezistFactory().creeazaPersonalMedical("Gigica");
        System.out.println(medic.toString());
        System.out.println(asistent.toString());
        System.out.println(anestezist.toString());
    }
}
