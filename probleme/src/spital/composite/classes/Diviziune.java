package spital.composite.classes;

public interface Diviziune {
    void descriere();
    void adaugaDiviziune(Diviziune  diviziune) throws Exception;
    void stergeDiiviune(Diviziune diviziune) throws Exception;
    Diviziune getDiviziune(int pozitie) throws Exception;
}
