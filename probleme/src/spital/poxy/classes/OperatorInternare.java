package spital.poxy.classes;

public class OperatorInternare implements IOperatorInternare{
    @Override
    public void realizeazaInternare(String numePacient, boolean areAsigurareDeSanatate) {
        System.out.println("A fost realizata internarea pentru "+numePacient);
    }
}
