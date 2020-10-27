package bataille;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collection;
public class Carte {
	
	//attributs d'une Carte
	private String [] color ;
	private int [] value ;
	
	//constructeur
	public Carte(){
		String [] color = {"pique","carreau","trèfle","coeur"} ;
		int [] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		this.color=color;
		this.setValue(value);
	}
	public String getColor(int y) {
		return color[y];
	}
	public int getValue(int i) {
		return value[i];
	}
/*
	public int getValue() {
		return value;
	}
	*/
	
	
	public String toString(int i , int y){
		return "La carte est un "+value[i] +" de "+color[y];
		
	}

	public int [] getValue() {
		return value;
	}

	public void setValue(int [] value) {
		this.value = value;
	}

	public String [] getColor() {
		return color;
	}
}
