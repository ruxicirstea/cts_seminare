package ro.ase.cts.Proxy;

public class OperatorRezervari implements IOperatorRezervari {
    @Override
    public void realizeazaRezervare(String numeClient, int nrPersoane) {
        System.out.println("A fost realizata rezervarea pentru "+numeClient +" cu "+nrPersoane +" persoane");
    }
}
