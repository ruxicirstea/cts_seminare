package ro.ase.cts.mocks;

import ro.ase.cts.classes.IStudent;

import java.util.List;

public class StudentFake implements IStudent {
    private String valNume;
    private List<Integer> valListaNote;
    private float valMedie;
    private int valGetNota;
    private  boolean valAreRestante;

    public void setValNume(String valNume) {
        this.valNume = valNume;
    }

    public void setValListaNote(List<Integer> valListaNote) {
        this.valListaNote = valListaNote;
    }

    public void setValMedie(float valMedie) {
        this.valMedie = valMedie;
    }

    public void setValGetNota(int valGetNota) {
        this.valGetNota = valGetNota;
    }

    public void setValAreRestante(boolean valAreRestante) {
        this.valAreRestante = valAreRestante;
    }

    @Override
    public String getNume() {
        return valNume;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return valListaNote;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return valMedie;
    }

    @Override
    public int getNota(int index) {
        return valGetNota;
    }

    @Override
    public boolean areRestante() {
        return valAreRestante;
    }
}
