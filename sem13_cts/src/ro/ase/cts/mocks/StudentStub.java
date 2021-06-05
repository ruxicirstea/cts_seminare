package ro.ase.cts.mocks;

import ro.ase.cts.classes.IStudent;

import java.util.List;

public class StudentStub implements IStudent {
    @Override
    public String getNume() {
        return "A";
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 5;
    }

    @Override
    public int getNota(int index) {
        return 5;
    }

    @Override
    public boolean areRestante() {
        return true;
    }
}
