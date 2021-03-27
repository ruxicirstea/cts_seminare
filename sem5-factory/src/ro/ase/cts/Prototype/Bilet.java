package ro.ase.cts.Prototype;

public class Bilet implements Copiator{
    private int cod;
    private String echipaA;
    private String echipaB;
    private String ora;

    public Bilet(int cod, String echipaA, String echipaB, String ora) {
        super();
        this.cod = cod;
        this.echipaA = echipaA;
        this.echipaB = echipaB;
        this.ora = ora;
    }

    public Bilet() {
    }

    public void setCod(int cod)
    {
        this.cod=cod;
    }

    @Override
    public Copiator copiaza() {
        Bilet bilet=new Bilet();
        bilet.cod=this.cod;
        bilet.echipaA=this.echipaA;
        bilet.echipaB=this.echipaB;
        bilet.ora=this.ora;
        return bilet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("cod=").append(cod);
        sb.append(", echipaA='").append(echipaA).append('\'');
        sb.append(", echipaB='").append(echipaB).append('\'');
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
