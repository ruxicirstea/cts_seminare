package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {
	protected String fileName;	

	public ReaderAplicanti(String fileName) {
		super();
		this.fileName = fileName;
	}

	public abstract	List<Aplicant> readAplicanti() throws FileNotFoundException;
    
    public void readAplicant(Aplicant aplicant, Scanner input) {
    	String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vectorDenumiriProiecte = new String[5];
		for (int i = 0; i < nr; i++)
			vectorDenumiriProiecte[i] = input.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumireProiect(vectorDenumiriProiecte,nr);
    }

}
