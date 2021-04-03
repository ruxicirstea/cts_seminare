package ro.ase.cts.Builder;

public class Rezervare {
    private int cod;
    private boolean areMancareInclusa;
    private boolean areBauturaInclusa;
    private boolean areScaunErgonomic;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    public Rezervare(int cod, boolean areMancareInclusa, boolean areBauturaInclusa, boolean areScaunErgonomic, boolean areMuzicaAmbientala, String genMuzica) {
        this.cod = cod;
        this.areMancareInclusa = areMancareInclusa;
        this.areBauturaInclusa = areBauturaInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public void setAreBauturaInclusa(boolean areBauturaInclusa) {
        this.areBauturaInclusa = areBauturaInclusa;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }
}
