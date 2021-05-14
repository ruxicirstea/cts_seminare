package spital.adapter;

public class MedicamentAdapter extends MedicamentSpital implements MedicamentFarmacie
{
    public MedicamentAdapter(String numeMedicament) {
        super(numeMedicament);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
