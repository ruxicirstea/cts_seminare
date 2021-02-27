package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> animale;
	
	public Zoo()
	{
		this.zookeeper=new Zookeeper("George");
		this.animale=new ArrayList<Animal>();
	}
	public Zoo(Zookeeper zookeper, List<Animal> animale) {
		super();
		this.zookeeper = zookeper;
		this.animale = animale;
	}
	
	public void adaugareAnimal(Animal a)
	{
		this.animale.add(a);
	}
	
	public void hranesteAnimale()
	{
		for(Animal a : animale)
		{
			zookeeper.feed(a);
		}
	}
	
	
	
	

}
