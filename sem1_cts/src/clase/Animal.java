package clase;

import interfaces.Mers;

public abstract class Animal implements Mers{
	private String nume;
	

	public Animal(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Animal [nume=" + nume + "]";
	}

	
	
	

}
