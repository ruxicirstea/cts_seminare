package spital.adapter;

public class MedicamentSpital {
    String numeMedicament;

    public MedicamentSpital(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void achizitioneazaMedicament()
    {
        prezintaReteta();
        System.out.println("Medicamentul " +this.numeMedicament+ " a fost achizitionat dupa verificarea retetei!");
    }

    public void prezintaReteta()
    {
        System.out.println("A fost prezentata reteta!");
    }

}
