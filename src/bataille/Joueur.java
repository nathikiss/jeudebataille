package bataille;
import java.util.ArrayList;
public class Joueur {
	//ATTRIBUTS
	private ArrayList<Carte> paquetJoueur;
	private int points;
	private String name;
	//CONSTRUCTEUR
	public Joueur(String name) {
		this.points=0;
		this.name=name;
	}
	public Carte tireCarte() {
		Carte carteTiree= this.paquetJoueur.get(paquetJoueur.size()-1);//CarteTirée=dernière carte du paquet
		paquetJoueur.remove(paquetJoueur.get(paquetJoueur.size() - 1));//On retire du paquet la carte tirée
		return carteTiree;
	}
	//Methode le joueur gagne et prend les deux cartes
	public void gagnePrend(Carte carteTiree, Carte carteEnJeu)
	    {
	        System.out.print(name+" gagne");
	        this.paquetJoueur.add(carteTiree);
	        this.paquetJoueur.add(carteEnJeu);
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
	
}
