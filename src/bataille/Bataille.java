package bataille;

import java.util.Random;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bataille {

	public static void main(String[] args) {
		
		int NB_CARTE_TOTAL=52;
		ArrayList<Carte> paquet = new ArrayList<Carte>();//TANT QUE 2(carte plus petite valeur) est inférieur ou egale à 14 on l'incrémente et on creer notre paquet
		for(int i=2;i<=14;i++) {
			String[] colors= {"PIQUE","TREFLE","COEUR","CARREAU"};
			for(String color : colors) {//Pour chaque couleur parmi les 4couleurs
				paquet.add(new Carte(color,i));//on creer 13 cartes
			}
		}
		Collections.shuffle(paquet);
		List<Carte> paquetJoueur1 = new ArrayList<>(paquet.subList(0,(paquet.size()/2)));//PREMIERE MOITIE DU PAQUET 
		//new ARRAYLIST obligatoire CaR sublist n'accepte pas la restructuration de la liste
		List<Carte> paquetJoueur2 = new ArrayList<>(paquet.subList(paquet.size()/2,paquet.size()));//DEUXIEME MOITIE
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrer le nom du joueur 1 :");
		String nomJoueur1= scanner.nextLine();
		System.out.print("Entrer le nom du joueur 2 :");
		String nomJoueur2= scanner.nextLine();
		/*INITIALISATION DES JOUEURS*/
		Joueur Joueur1= new Joueur(nomJoueur1,paquetJoueur1);
		Joueur Joueur2= new Joueur(nomJoueur2,paquetJoueur2);
		int nbParties=0;
		int egalite=0;
		while(Joueur1.getPaquetJoueur().size()>0 && Joueur2.getPaquetJoueur().size()>0  ) //Tant que le joueur1 à encore des cartes
		{	
			//Tant que la reponse du jour est positive
			//Et que le paquet du joueur1 n'est pas vide
			//ou que le paquet du joueur1 n'est pas vide
			
			/* JEU BATAILLE*/
				
				if(nbParties>=100) {
					break;
				}
				
				Carte carteJ1=Joueur1.tireCarte();
				Carte carteJ2=Joueur2.tireCarte();
				if(carteJ1.getValue()>carteJ2.getValue())
				{
					Joueur1.gagnePrend(carteJ1, carteJ2);
					Joueur1.augmentePoints();
					System.out.print(Joueur1.getName()+" gagne \n");
					
				}
				else if(carteJ2.getValue()>carteJ1.getValue()) 
				{
					Joueur2.gagnePrend(carteJ1, carteJ2);
					Joueur2.augmentePoints();
					System.out.print(Joueur2.getName()+" gagne \n");
				}
				else {
					//Si égalité les deux joueurs récup leurs cartes et mélangent leurs paquets
					Joueur1.egalite(carteJ1);
					Joueur2.egalite(carteJ2);
					System.out.print("EGALITE \n"); 
					egalite++;
				}
				System.out.print("score "+Joueur1.getName()+" :"+Joueur1.getPoints()+"\n"+
						"score "+Joueur2.getName()+" :"+Joueur2.getPoints()+"\n");
				nbParties++;
				
				
		}	
		scanner.close();
		String vainqueur = "personne";
		if(Joueur1.getPoints()>Joueur2.getPoints()) {
			vainqueur=Joueur1.getName();
		}
		else if(Joueur2.getPoints()>Joueur1.getPoints()) {
			vainqueur=Joueur2.getName();
		}
		System.out.print("PARTIE TERMINEE \n"+"Le vainqueur est "+vainqueur+"\n"+
		Joueur1+""+Joueur2+"nombre de partie:"+nbParties+"\n"+"Nombre d'égalité: "+egalite);
	}

}
