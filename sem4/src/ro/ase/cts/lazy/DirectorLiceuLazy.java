package ro.ase.cts.lazy;

import ro.ase.cts.singletonEager.DirectorLiceu;

public class DirectorLiceuLazy {
    private String nume;
    private int varsta;
    private int vechime;
    private static DirectorLiceuLazy instanta=null;

    private DirectorLiceuLazy(String nume, int varsta, int vechime) {
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

    public static DirectorLiceuLazy getInstanta(String nume,int varsta,int vechime) {
        if(instanta==null)
        {
            instanta=new DirectorLiceuLazy(nume,varsta,vechime);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DirectorLiceuLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
