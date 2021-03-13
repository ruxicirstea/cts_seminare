package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}

	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	public String[] getDenumireProiect() {
		return denumireProiect;
	}
	public void setDenumireProiect(String[] denumireProiect, int nrProiecte) {
		this.denumireProiect = denumireProiect;
		this.nrProiecte=nrProiecte;
	}

	public void afiseazaStatusPeProiect(Proiect proiect){
		StringBuilder stringBuilder =new StringBuilder();
		stringBuilder.append("Aplicantul ").append(this.nume).append(" ").append(this.prenume);
		stringBuilder.append(punctaj >proiect.getPragAcceptare() ? " a fost acceptat" : " nu a fost acceptat");
		System.out.println(stringBuilder.toString());
		
	}

	
	public abstract void afisareSumaFinantata();
	public String compunereStringPentruSumaFinantata(int suma, String tipAplicant)
	{
		StringBuilder stringBuilder=new StringBuilder(); 
		// TODO Auto-generated method stub
		stringBuilder.append(tipAplicant).append(" ");
		stringBuilder.append(getNume());
		stringBuilder.append(" ");
		stringBuilder.append(getPrenume());
		stringBuilder.append(" primeste ");
		stringBuilder.append(suma);
		stringBuilder.append(" Euro/zi in proiect.");
		return stringBuilder.toString();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aplicant [nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", nr_proiecte=");
		builder.append(nrProiecte);
		builder.append(", denumireProiect=");
		builder.append(Arrays.toString(denumireProiect));
		builder.append("]");
		return builder.toString();
	}

}
