package bataille;

import java.util.Random;

public class Bataille {

	public static void main(String[] args) {
		//ON PEUT SUREMENT CREER UN AUTRE TABLEAU QUI RECUPERE LES CARTES CREER ET LES METS DANS UN JEU DE CARTE
		/*Random rand = new Random();
		int randVal = rand.nextInt();
		int randColor = rand.nextInt(lesColors.length);
		*/
		for(int i=0;i<=12;i++) {
			for(int y=0; y<=3;y++) {
				Carte ciy = new Carte();
				System.out.println(ciy.toString(i,y));
			}	
		}
		
	}

}
