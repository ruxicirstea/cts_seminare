package spital.factoryMethod;

public class MedicFactory implements Factory{
    @Override
    public PersonalMedical creeazaPersonalMedical(String nume) {
        return new Medic(nume);
    }
}
