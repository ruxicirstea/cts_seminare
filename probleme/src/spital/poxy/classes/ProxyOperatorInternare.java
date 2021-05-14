package spital.poxy.classes;

public class ProxyOperatorInternare implements IOperatorInternare {
    OperatorInternare operatorInternare;

    public ProxyOperatorInternare(OperatorInternare operatorInternare) {
        this.operatorInternare = operatorInternare;
    }

    @Override
    public void realizeazaInternare(String numePacient, boolean areAsigurareDeSanatate) {
        if(areAsigurareDeSanatate==true)
        {
            operatorInternare.realizeazaInternare(numePacient,areAsigurareDeSanatate);
        }
        else{
            System.out.println("Ne pare rau, dar nu va putem interna deoarece nu aveti asigurare");
        }
    }
}
