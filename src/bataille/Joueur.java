package bataille;
import java.util.Collections;
import java.util.List;
public class Joueur {
	//ATTRIBUTS
	private int points;
	private String name = "ORDI";
	private List<Carte> paquetJoueur;
	//CONSTRUCTEUR
	public Joueur(String name,List<Carte> paquetJoueur) {
		this.points=0;
		this.name=name;
		this.paquetJoueur=paquetJoueur;
	}
	public Carte tireCarte() {
		Carte carteTiree= this.paquetJoueur.get(paquetJoueur.size()-1);//CarteTirée=dernière carte du paquet
		paquetJoueur.remove(paquetJoueur.get(paquetJoueur.size() - 1));//On retire du paquet la carte tirée
		System.out.print(name+" joue "+carteTiree+"\n");
		return carteTiree;
	}
	//Methode le joueur gagne et prend les deux cartes
	public void gagnePrend(Carte carteJ1, Carte carteJ2)
	    {
	        System.out.print(name+" gagne \n");
	        this.paquetJoueur.add(carteJ1);
	        this.paquetJoueur.add(carteJ2);
	    }
	//SI il y'a égalité les joueurs reprennent leurs cartes, leurs paquet est à nouveau mélangé
	public void egalite(Carte carteJoueur) {
		this.paquetJoueur.add(carteJoueur);
		Collections.shuffle(this.paquetJoueur);
	}
	public void augmentePoints()
	{
		this.points++;
	        }
	
	public int getPoints() {
		return points;
	}
	public String getName() {
		return name;
	}
	public List<Carte> getPaquetJoueur(){
		return paquetJoueur;
	}
	public String toString() {
		return  name
				+" a "+points+" points \n"
				;
	}
	
}
