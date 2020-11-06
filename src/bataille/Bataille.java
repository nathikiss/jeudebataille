package bataille;

import java.util.Random;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Bataille {

	public static void main(String[] args) {
		
		int NB_CARTE_TOTAL=52;
		ArrayList<Carte> paquet = new ArrayList<Carte>();
//TANT QUE 2(carte plus petite valeur) est inférieur ou egale à 14 on l'incrémente et on creer notre paquet
		for(int i=2;i<=14;i++) {
			String[] colors= {"PIQUE","TREFLE","COEUR","CARREAU"};
			for(String color : colors) {	
				paquet.add(new Carte(color,i));
			}
		}
		System.out.print(paquet.size()+"\n");
		Collections.shuffle(paquet);
		List<Carte> paquetJoueur1 = new ArrayList<>(paquet.subList(0,(paquet.size()/2)));//PREMIERE MOITIE DU PAQUET 
		//new ARRAYLIST obligatoire CaR sublist n'accepte pas la restructuration de la liste
		List<Carte> paquetJoueur2 = new ArrayList<>(paquet.subList(paquet.size()/2,paquet.size()));//DEUXIEME MOITIE
		Joueur Joueur1= new Joueur("Joshua",paquetJoueur1);
		Joueur Joueur2= new Joueur("Binocle",paquetJoueur2);
		while (paquetJoueur1.size()>0) //Tant que le joueur1 à encore des cartes
		{
			if(paquetJoueur2.size()==0) {//Si le joueur 2 n'a plus de cartes on s'arrete 
				break;
			}
			else if(Joueur1.getPoints()==52 || Joueur2.getPoints()==52) {
				break;
			}
			else 
			{
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
					System.out.print("Egalité \n");
				
				}
			}
		}
		System.out.print(Joueur1+"\n");
		System.out.print(Joueur2+"\n");

		/*System.out.print(Joueur1+"\n");
		System.out.print(Joueur2+"\n");*/
		/*TEST!!!!
		System.out.print(paquet.get(0).getValue()+"\n");///SELECTIONNE UNIQUEMENT LE CHIFFRE
		System.out.print("Voici notre paquet: " + paquet+"\n");
		System.out.print(paquetJoueur1.size()+" : "+paquetJoueur1+"\n");//AFFICHE LE PAQUET ET LE NOMBRE DE CARTE DU J1
		System.out.print(paquetJoueur2.size()+" : "+paquetJoueur2+"\n");//AFFICHE LE PAQUET ET LE NOMBRE DE CARTE DU J2
		
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
