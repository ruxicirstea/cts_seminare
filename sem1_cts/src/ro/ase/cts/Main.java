package ro.ase.cts;

import clase.Animal;
import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoo zoo=new Zoo();
		
		Animal z1=new Zebra("Monica");
		Animal z2=new Zebra("Costel");
		zoo.adaugareAnimal(z1);
		zoo.adaugareAnimal(z2);
		System.out.println("Hranire zebre!");
		zoo.hranesteAnimale();
		Animal g1=new Girafa("Girafa 1");
		Animal g2=new Girafa("Girafa 2",500);
		zoo.adaugareAnimal(g1);
		zoo.adaugareAnimal(g2);
		System.out.println("Hranire toate animalele!");
		zoo.hranesteAnimale();
		

	}

}
