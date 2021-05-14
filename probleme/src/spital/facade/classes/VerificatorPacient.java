package spital.facade.classes;

public class VerificatorPacient {
    public static boolean verificaPacient(Pacient pacient, Salon salon) {
     if(pacient.verificareStare())
     {
         if(Medic.confirmareInternare(pacient))
         {
             if(salon.getListaPaturiLibere()!=null){
                 return true;
             }
         }
     }
     return false;
    }
}
