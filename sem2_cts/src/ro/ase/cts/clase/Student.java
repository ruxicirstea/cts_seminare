package ro.ase.cts.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantata=20;

	public Student() {
		super();
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumiriProiect);
		this.facultate = facultate;
		this.anStudii = an_studii;
	}

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder= new StringBuilder("Angajat: ");
		stringBuilder.append(super.toString())
		.append("Facultate= ").append(this.facultate).append(" An Studii ").append(this.anStudii);
		return stringBuilder.toString();
	}

	@Override
	public void afisareSumaFinantata() {
		System.out.println(super.compunereStringPentruSumaFinantata(sumaFinantata, "Studentul"));
	}
}
