package spital.composite.classes;

public class Sectie implements Diviziune {
    String denumire;

    public Sectie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void descriere() {
        System.out.println("Sectia "+ this.denumire);
    }

    @Override
    public void adaugaDiviziune(Diviziune diviziune) throws Exception {
        throw  new Exception("Sectia nu poate avea alte divixuni");
    }

    @Override
    public void stergeDiiviune(Diviziune diviziune) throws Exception {
        throw  new Exception("Sectia nu poate avea alte divixuni. Nu se poate sterge!");
    }

    @Override
    public Diviziune getDiviziune(int pozitie) throws Exception {
        return null;
    }
}
