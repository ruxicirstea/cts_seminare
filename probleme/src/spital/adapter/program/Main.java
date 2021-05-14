package spital.adapter.program;

import spital.adapter.MedicamentAdapter;
import spital.adapter.MedicamentFarmacie;
import spital.adapter.MedicamentSpital;



public class Main {
    public static void cumparaMedicamentReteta(MedicamentSpital medicamentSpital)
    {
        medicamentSpital.achizitioneazaMedicament();
    }

    public static void cumparaMedicamentDinFarmacie(MedicamentFarmacie medicamentFarmacie)
    {
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital=new MedicamentSpital("Zinnat");
        cumparaMedicamentReteta(medicamentSpital);
        MedicamentAdapter medicamentAdapter=new MedicamentAdapter("Paracetamol");
        cumparaMedicamentDinFarmacie(medicamentAdapter);

        //ADAPTER DE OBIECTE

    }
}
