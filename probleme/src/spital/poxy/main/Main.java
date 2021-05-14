package spital.poxy.main;

import spital.poxy.classes.IOperatorInternare;
import spital.poxy.classes.OperatorInternare;
import spital.poxy.classes.ProxyOperatorInternare;

public class Main {
    public static void main(String[] args) {
        OperatorInternare operatorInternare=new OperatorInternare();
        operatorInternare.realizeazaInternare("Gigel",false);

        ProxyOperatorInternare operatorInternare1 =new ProxyOperatorInternare(operatorInternare);
        operatorInternare1.realizeazaInternare("Maria", false);
        operatorInternare1.realizeazaInternare("Ioana", true);

    }
}
