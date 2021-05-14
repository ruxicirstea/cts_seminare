package spital.simpleFactory;

public class Factory {
    public PersonalMedical creeazaPeronal(TipPersonalMedical personalMedical,String nume)
    {
        switch (personalMedical)
        {
            case Brancardier:
                return new Brancardier(nume);

            case Asistent:
                return new Asistent(nume);

            case Medic:
                return new Medic(nume);

            default:
                throw new IllegalArgumentException();
        }
    }
}
