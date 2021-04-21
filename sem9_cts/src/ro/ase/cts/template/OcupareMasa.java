package ro.ase.cts.template;

public class OcupareMasa extends TemplateOcupareMasa {
    public OcupareMasa(int codMasa) {
        super(codMasa);
    }

    @Override
    void curataMasa() {
        System.out.println("Masa " +this.codMasa+"a fost curatata");
    }

    @Override
    void aseazaServetele() {
        System.out.println(" Pe Masa " +this.codMasa+"s-au asezat servetele");
    }

    @Override
    void aseazaTacamuri() {

        System.out.println("Pe masa " + this.codMasa + "au fost asezate servetele");
    }

    @Override
    void invitaPersoane() {
        System.out.println("Au fost invitate persoanele la masa "+this.codMasa  );

    }
}
