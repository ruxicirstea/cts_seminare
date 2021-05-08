package ro.ase.cts.command;

public class ComandaRetragere implements IComanda{
    private ContBancar contBancar;
    private float suma;

    public ComandaRetragere(ContBancar contBancar, float suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    @Override
    public void executa() {
        contBancar.retragere(suma);
    }
}
