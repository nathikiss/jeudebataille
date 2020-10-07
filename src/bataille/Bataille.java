package bataille;

import java.util.Random;

public class Bataille {

	public static void main(String[] args) {
		String [] color = {"pique","carreau","trèfle","coeur"} ;
		int [] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Random rand = new Random();
		int chiffreAleatoire = rand.nextInt(value.length);
		System.out.println(value[chiffreAleatoire]);
			
	}

}
