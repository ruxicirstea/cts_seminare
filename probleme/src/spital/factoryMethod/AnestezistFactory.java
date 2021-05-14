package spital.factoryMethod;

public class AnestezistFactory implements Factory {
    @Override
    public PersonalMedical creeazaPersonalMedical(String nume) {
        return new Anestezist(nume);
    }
}
