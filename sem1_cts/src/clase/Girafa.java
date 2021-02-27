package clase;

public class Girafa extends Animal{
	private int inaltime;

	public Girafa(String nume, int inaltime) {
		super(nume);
		this.inaltime = inaltime;
	}



	public Girafa(String nume) {
		super(nume);
	}



	public int getInaltime() {
		return inaltime;
	}

	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}
	
	

}
