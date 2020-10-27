package bataille;

import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Bataille {

	public static void main(String[] args) {
		//ON PEUT SUREMENT CREER UN AUTRE TABLEAU QUI RECUPERE LES CARTES CREER ET LES METS DANS UN JEU DE CARTE
		/*Random rand = new Random();
		int randVal = rand.nextInt();
		int randColor = rand.nextInt(lesColors.length);
		*/
		//creation d'un objet afin de recupérer la longueur des tableaux
		Carte n1 = new Carte();
		int nbVals= n1.getValue().length;
		int nbColors= n1.getColor().length;
		
		
		//Mettre le tout dans un PAQUET (une ArrayList)
		ArrayList<String> paquet = new ArrayList< String>();
		for(int i=0;i<nbVals;i++) {
			for(int y=0; y<nbColors;y++) {
				Carte ciy = new Carte();
				paquet.add(ciy.getValue(i)+" "+ciy.getColor(y));
				/*System.out.println(ciy.toString(i,y));*/
			
			
			}	
		}
		System.out.print(paquet.size()+"\n");
		System.out.print("Voici notre paquet: " + paquet+"\n");
		Collections.shuffle(paquet);
		System.out.print("Voici notre paquet mélangé: " + paquet+"\n");
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
