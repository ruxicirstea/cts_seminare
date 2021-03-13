package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int sumaFinantata=10;

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();

	}
	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder= new StringBuilder("Angajat: ");
	    stringBuilder.append(super.toString()).append("Salariu= ")
	    .append(salariu).append(" Ocupatie= ").append(this.ocupatie);
	    return stringBuilder.toString();
	}
	
	@Override
	public void afisareSumaFinantata() {
		System.out.println(super.compunereStringPentruSumaFinantata(sumaFinantata, "Angajatul"));
		
	}
	
}
