package spital.facade.main;

import spital.facade.classes.Pacient;
import spital.facade.classes.Salon;
import spital.facade.classes.VerificatorPacient;

public class Main {
    public static void verificaPacient(Pacient pacient, Salon salon)
    {
        if(VerificatorPacient.verificaPacient(pacient,salon))
        {
            System.out.println("Pacientul "+pacient.getNume() +" a fost internat");
            salon.ocuparePat(1);
        }
        else{
            System.out.println("Nu se poate reaiza internarea pentru "+pacient.getNume());
        }
    }

    public static void main(String[] args) {

        Pacient pacient=new Pacient("Gigel",7);
        Pacient pacient2=new Pacient("Maricica",3);

        Salon salon = new Salon();
        salon.ocuparePat(1);
        verificaPacient(pacient,salon);
        verificaPacient(pacient2,salon);


    }
}
