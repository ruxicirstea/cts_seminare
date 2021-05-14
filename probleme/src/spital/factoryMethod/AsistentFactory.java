package spital.factoryMethod;

public class AsistentFactory implements Factory{
    @Override
    public PersonalMedical creeazaPersonalMedical(String nume) {
        return new Asistent(nume);
    }
}
