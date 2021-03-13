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
	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(super.fileName));
		scanner.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Student student =new Student();
			super.readAplicant(student, scanner);
			int anStudii= scanner.nextInt();
			String facultate = (scanner.next()).toString();
			student.setAnStudii(anStudii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		scanner.close();
		return studenti;
	}
}
