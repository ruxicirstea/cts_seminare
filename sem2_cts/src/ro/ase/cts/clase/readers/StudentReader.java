package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class StudentReader extends ReaderAplicanti {


	public StudentReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student student =new Student();
			super.readAplicant(student, input);
			int anStudii= input.nextInt();
			String facultate = (input.next()).toString();
			student.setAnStudii(anStudii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		input.close();
		return studenti;
		
	}

}
