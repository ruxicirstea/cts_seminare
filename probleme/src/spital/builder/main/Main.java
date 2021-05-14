package spital.builder.main;

import spital.builder.classes.Pacient;
import spital.builder.classes.PacientBuilder;
import spital.builder.classes.PacientBuilderV2;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new PacientBuilder("Ioana").build();
        System.out.println(pacient.toString());
        Pacient pacient1=new PacientBuilder("Gigel").setAreHalatPentruInterior(true).setArePatRabatabil(true).build();
        System.out.println(pacient1.toString());

        PacientBuilderV2 pacientBuilder=new PacientBuilderV2("Gigica");
        Pacient pacient2=pacientBuilder.setAreMicDejun(true).setArePapuciDeCamera(true).setArePatRabatabil(true).build();
        System.out.println(pacient2.toString());
    }
}
