package spital.facade.classes;

public class Medic {

    public static boolean confirmareInternare(Pacient pacient)
    {
        if(pacient.verificareStare())
        {
            return true;
        }
            return false;

    }
}
