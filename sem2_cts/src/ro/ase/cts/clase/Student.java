package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static int sumaFinantata=20;
	
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return an_studii;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder= new StringBuilder("Angajat: ");
		stringBuilder.append(super.toString())
		.append("Facultate= ").append(this.facultate).append(" An Studii ").append(this.an_studii);
		return stringBuilder.toString();
	}
	@Override
	public void afisareSumaFinantata() {
		// TODO Auto-generated method stub
		
			System.out.println(super.compunereStringPentruSumaFinantata(sumaFinantata, "Studentul"));
			
		
		
	}
	
	
	
	
}
