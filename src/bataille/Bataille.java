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
		System.out.print("Joueur 1 :"+Joueur1.getName()+ "\n"+
				"Joueur 2 :"+Joueur2.getName()+ "\n"+"Voulez Vous faire une partie de Bataille ?"+
				"\n"+ "OUI : o NON : n \n");
		String reponseJoueur= scanner.next();
		
		while(!reponseJoueur.equals("o") && !reponseJoueur.equals("n") ) {
			System.out.print("Je n'ai pas compris Voulez Vous faire une partie de Bataille ?"+
					"\n"+ "OUI : o NON : n \n");
			reponseJoueur= scanner.next();
		}
		if(!reponseJoueur.equals("n")) {//SI LA REPONSE DU JOUEUR EST NEGATIVE ON NE JOUE PAS
			while (reponseJoueur.equals("o") && Joueur1.getPaquetJoueur().size()>0 || Joueur2.getPaquetJoueur().size()>0 ) //Tant que le joueur1 à encore des cartes
			{	
				//Tant que la reponse du jour est positive
				//Et que le paquet du joueur1 n'est pas vide
				//ou que le paquet du joueur1 n'est pas vide
				
				/* JEU BATAILLE*/
					Carte carteJ1=Joueur1.tireCarte();
					Carte carteJ2=Joueur2.tireCarte();
					if(carteJ1.getValue()>carteJ2.getValue())
					{
						Joueur1.gagnePrend(carteJ1, carteJ2);
						Joueur1.augmentePoints();
					}
					else if(carteJ2.getValue()>carteJ1.getValue()) 
					{
						Joueur2.gagnePrend(carteJ1, carteJ2);
						Joueur2.augmentePoints();
					}
					else {//Si égalité les deux joueurs récup leurs cartes et mélangent leurs paquets
						Joueur1.egalite(carteJ1);
						Joueur2.egalite(carteJ2);
						System.out.print("Egalité, VOS Paquets sont re-mélangé \n");
					
					}
					System.out.print("Voulez Vous refaire une partie de Bataille ?"+
							"\n"+ "OUI : o NON : n \n");
					reponseJoueur= scanner.next();
					if (!reponseJoueur.equals("o")) {//SI LA reponse est différente de o alors on termine le jeu
						break;
					}
					
			}	
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
		Joueur1+""+Joueur2+"\n");

		/*System.out.print(Joueur1+"\n");
		System.out.print(Joueur2+"\n");*/
		/*TEST!!!!
		System.out.print(paquet.get(0).getValue()+"\n");///SELECTIONNE UNIQUEMENT LE CHIFFRE
		System.out.print("Voici notre paquet: " + paquet+"\n");
		System.out.print(paquetJoueur1.size()+" : "+paquetJoueur1+"\n");//AFFICHE LE PAQUET ET LE NOMBRE DE CARTE DU J1
		System.out.print(paquetJoueur2.size()+" : "+paquetJoueur2+"\n");//AFFICHE LE PAQUET ET LE NOMBRE DE CARTE DU J2
		System.out.print(paquet.size()+"\n");//AFFICHE LA TAILLE DU PAQUET

		//Pour recuperer le chiffre il faut couper la chaine de caractere 
		//PEUT ETRE UTILISER LORS DE LA SEPARATION DU PAQUET AU DEUX JOUEURS
		
		/*
		for(int x=0; x<paquet.size();x++) {
			int nbChiffre=1;
			int positionEspace = paquet.get(x).indexOf(" ");
			if (positionEspace==2) {
				System.out.print(Integer.parseInt(paquet.get(x)
					.substring(0,nbChiffre+1))+"\n");
			}
			else
				System.out.print(Integer.parseInt(paquet.get(x)
						.substring(0,nbChiffre))+"\n");
			
		}	*/	

	}

}
