package bataille;
public class Carte {
	
	//attributs d'une Carte
	private String color ;
	private int value ;
	
	//constructeur
	public Carte(String color, int value){
		this.color=color;
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
		
	public String getColor() {
		return color;
	}
		
	public String toString(){
		return value +" de "+color;
		
	}
}
