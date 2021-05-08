package ro.ase.cts.command;

public class ComandaDepunere implements IComanda {
    private ContBancar cont;
    private float sumaDepusa;

    public ComandaDepunere(ContBancar cont, float sumaDepusa) {
        this.cont = cont;
        this.sumaDepusa = sumaDepusa;
    }

    @Override
    public void executa() {
        cont.depunere(sumaDepusa);
    }
}
