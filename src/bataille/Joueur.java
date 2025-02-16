package bataille;
import java.util.Collections;
import java.util.List;
public class Joueur {
	//ATTRIBUTS
	private int points;
	private String name = "ORDI";
	private List<Carte> paquetJoueur;
	//CONSTRUCTEURS
	public Joueur(String name,List<Carte> paquetJoueur) {
		this.points=0;
		this.name=name;
		this.paquetJoueur=paquetJoueur;
	}
	
	/*LES METHODES*/
	public Carte tireCarte() {
		if (paquetJoueur.size()>0) {
			Carte carteTiree= this.paquetJoueur.get(paquetJoueur.size()-1);//CarteTir�e=derni�re carte du paquet
		
			paquetJoueur.remove(paquetJoueur.get(paquetJoueur.size() - 1));
			return carteTiree;//System.out.print(name+" joue "+carteTiree+"\n"); //AFFICHE LA CARTE JOUE PAR LE JOUEUR
			}
		return null;
	}
	
	/*public String toutRetirer() {
		//Carte carteTiree= this.paquetJoueur.get(paquetJoueur.size()-1);//CarteTir�e=derni�re carte du paquet
		while(!paquetJoueur.isEmpty()) {//tant que le paquet contient qlq chose
			paquetJoueur.remove(paquetJoueur.get(paquetJoueur.size() - 1));
			System.out.print(paquetJoueur);
		}
		//System.out.print(name+" joue "+carteTiree+"\n"); //AFFICHE LA CARTE JOUE PAR LE JOUEUR
		return "Le paquet est vide"+paquetJoueur;
	}*/
	
	//Le joueur gagne et prend les deux cartes
	public void gagnePrend(Carte carteJ1, Carte carteJ2)
	    {
	        //System.out.print(name+" gagne \n");
	        this.paquetJoueur.add(carteJ1);
	        this.paquetJoueur.add(carteJ2);
	    }
	//SI il y'a Egalit� les joueurs reprennent leurs cartes, leurs paquets sont � re-m�lang�
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
