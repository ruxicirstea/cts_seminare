package spital.builder.classes;

public class PacientBuilderV2 implements AbstractBuilder{
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCamera;
    private boolean areHalatPentruInterior;

    public PacientBuilderV2(String nume) {
        this.nume = nume;
    }

    public PacientBuilderV2 setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public PacientBuilderV2 setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilderV2 setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    public PacientBuilderV2 setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
        return this;
    }

    public PacientBuilderV2 setAreHalatPentruInterior(boolean areHalatPentruInterior) {
        this.areHalatPentruInterior = areHalatPentruInterior;
        return this;
    }

    @Override
    public Pacient build() {
        return new Pacient(nume,arePatRabatabil,areMicDejun,arePapuciDeCamera,areHalatPentruInterior);
    }
}
