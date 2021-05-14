package spital.builder.classes;

public class PacientBuilder implements  AbstractBuilder{
   private Pacient pacient;

    public PacientBuilder(String nume) {
        this.pacient =new Pacient(nume);
    }
    public PacientBuilder setNume(String nume)
    {
        this.pacient.setNume(nume);
        return this;
    }
    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil)
    {
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }
    public PacientBuilder setAreMicDejun(boolean areMicDejun)
    {
        this.pacient.setAreMicDejun(areMicDejun);
        return  this;
    }
    public PacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera)
    {
        this.pacient.setArePapuciDeCamera(arePapuciDeCamera);
        return this;
    }
    public PacientBuilder setAreHalatPentruInterior(boolean areHalatPentruInterior)
    {
        this.pacient.setAreHalatPentruInterior(areHalatPentruInterior);
        return this;
    }


    @Override
    public Pacient build() {
        return this.pacient;
    }
}
