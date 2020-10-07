package bataille;
import java.util.ArrayList;
import java.util.Random;

public class Carte {
	//attributs d'une Carte
	private String [] color = {"pique","carreau","trèfle","coeur"} ;
	private int [] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	
	//Random rand = new Random();
	//int randVal = rand.nextInt(value.length);
	//int randColor = rand.nextInt(value.length);
	
	//constructeur
	public Carte(String [] color, int [] value ){
		this.color = color;
		this.value = value;
		
	}
	
}
