package ro.ase.cts.singletonEager;

public class DirectorLiceu {
    private String nume;
    private int varsta;
    private int vechime;
    private final static DirectorLiceu instanta= new DirectorLiceu("Popescu Maria",45,15);

    private DirectorLiceu(String nume, int varsta, int vechime) {
        this.nume = nume;
        this.varsta = varsta;
        this.vechime = vechime;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    public static DirectorLiceu getInstanta() {
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DirectorLiceu{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
