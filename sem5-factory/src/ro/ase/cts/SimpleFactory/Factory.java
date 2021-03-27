package ro.ase.cts.SimpleFactory;

public class Factory {
    public Jucator getJucatori(TipJucator tipJucator,String nume)
    {
        switch (tipJucator)
        {
            case Portar:
            {
                return new Portar(nume);
            }
            case Fundas:
            {
                return new Fundas(nume);
            }
            case Atacant:{
                return  new Atacant(nume);
            }
            default:
            {
                throw new IllegalArgumentException();
            }
        }
    }
}
