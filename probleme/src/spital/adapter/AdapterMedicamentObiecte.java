package spital.adapter;

public class AdapterMedicamentObiecte implements MedicamentFarmacie{
    MedicamentSpital medicamentSpital;
    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
