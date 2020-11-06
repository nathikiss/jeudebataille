package bataille;

import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Bataille {

	public static void main(String[] args) {
		
		int NB_CARTE_TOTAL=52;
		ArrayList<Carte> paquet = new ArrayList<Carte>();
		//2=premiere chiffre et 15 parce qu'il y'a 13 cartes entre 2 et 15;on a besoin de13 carte
		for(int i=2;i<=14;i++) {
			String[] colors= {"PIQUE","TREFLES","COEUR","CARREAU"};
			for(String color : colors) {	
				paquet.add(new Carte(color,i));
			}
		}
		System.out.print(paquet.size()+"\n");
		System.out.print("Voici notre paquet: " + paquet+"\n");
		Collections.shuffle(paquet);
		System.out.print("Voici notre paquet mélangé: " + paquet+"\n");
		System.out.print(paquet.get(0).getValue());///SELECTIONNE UNIQUEMENT LE CHIFFRE
		/*Séparons le paquet en deux
		
		
		
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
