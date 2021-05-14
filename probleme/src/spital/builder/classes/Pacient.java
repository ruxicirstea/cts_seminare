package spital.builder.classes;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCamera;
    private boolean areHalatPentruInterior;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public Pacient(String nume, boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciDeCamera, boolean areHalatPentruInterior) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalatPentruInterior = areHalatPentruInterior;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    public void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    public void setAreHalatPentruInterior(boolean areHalatPentruInterior) {
        this.areHalatPentruInterior = areHalatPentruInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejun=").append(areMicDejun);
        sb.append(", arePapuciDeCamera=").append(arePapuciDeCamera);
        sb.append(", areHalatPentruInterior=").append(areHalatPentruInterior);
        sb.append('}');
        return sb.toString();
    }
}
