package spital.facade.classes;

public class Pacient {
    private String nume;
    private int gravitateaStarii;

    public Pacient(String nume, int gravitateaStarii) {
        this.nume = nume;
        this.gravitateaStarii = gravitateaStarii;
    }

    public boolean verificareStare()
    {
        if(this.gravitateaStarii>5)
        {
            return true;
        }
        else{
            return false;
        }
    }


    public String getNume() {
        return nume;
    }

    public int getGravitateaStarii() {
        return gravitateaStarii;
    }
}
