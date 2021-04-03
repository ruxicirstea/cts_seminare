package ro.ase.cts.Builder.program;

import ro.ase.cts.Builder.Rezervare;

public class RezervareBuilder implements AbstractBuilder{
  private  Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare();
    }
    public RezervareBuilder setCod(int cod)
    {
        this.rezervare.setCod(cod);
        return this;
    }
    public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa)
    {
        this.rezervare.setAreMancareInclusa(areMancareInclusa);
        return this;
    }
    public RezervareBuilder setAreBauturaInclusa(boolean areBauturaInclusa)
    {
        this.rezervare.setAreBauturaInclusa(areBauturaInclusa);
        return this;
    }
    public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic)
    {
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala)
    {
        this.rezervare.setAreMancareInclusa(areMuzicaAmbientala);
        return this;
    }
    public RezervareBuilder setGenMuzica(String genMuzica)

    {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
