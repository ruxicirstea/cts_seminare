package ro.ase.cts.template;

public abstract  class TemplateOcupareMasa {
    protected int codMasa;

    public TemplateOcupareMasa(int codMasa) {
        this.codMasa = codMasa;
    }

    abstract void curataMasa();
    abstract void aseazaServetele();
    abstract void aseazaTacamuri();
    abstract void invitaPersoane();

    public final void ocupaMasa() {
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaPersoane();
    }
}
