package ro.ase.cts.threadSafe;

import ro.ase.cts.lazy.DirectorLiceuLazy;
import ro.ase.cts.lazy.ReceptieHotelLazy;

public class DirectorLiceuThread {

    private String nume;
    private int varsta;
    private int vechime;
    private static DirectorLiceuThread instanta=null;

    private DirectorLiceuThread(String nume, int varsta, int vechime) {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DirectorLiceuThread{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }

    public synchronized static DirectorLiceuThread getInstanta(String nume, int varsta, int vechime) {
        if(instanta==null)
        {
            instanta=new DirectorLiceuThread(nume,varsta,vechime);
        }
        return instanta;
    }

}
