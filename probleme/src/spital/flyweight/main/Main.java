package spital.flyweight.main;

import spital.flyweight.classes.Flyweight;
import spital.flyweight.classes.FlyweightFactory;
import spital.flyweight.classes.Pacient;
import spital.flyweight.classes.Salon;

public class Main {
    public static void main(String[] args) {
        Salon salon=new Salon(12,2,7);
        Salon salon1=new Salon(11,34,3);
        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Pacient pacient1 = new Pacient("Gigel", "0724589563", "Bucuresti");
        pacient1.realizeazaInternare(salon1);
        flyweightFactory.addPacient(pacient1);
        System.out.println( flyweightFactory.getPacient("0724589563").toString());
        flyweightFactory.getPacient("0724589563").realizeazaInternare(salon);
    }
}
