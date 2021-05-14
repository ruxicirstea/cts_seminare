package spital.factoryMethod;

public class BrancardierFactory implements Factory{
    @Override
    public PersonalMedical creeazaPersonalMedical(String nume) {
        return new Brancardier(nume);
    }
}
