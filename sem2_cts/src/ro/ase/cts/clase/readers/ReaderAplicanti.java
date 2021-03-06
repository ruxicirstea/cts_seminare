package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {
	protected String fileName;	
	
    public ReaderAplicanti(String fileName) {
		super();
		this.fileName = fileName;
	}

	public abstract	List<Aplicant> readAplicanti() throws FileNotFoundException;
    
    

}
