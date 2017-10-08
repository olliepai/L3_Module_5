package data_structures;

import java.util.Random;

public class Randomness {
	public static boolean randomBool() {
		int rand = new Random().nextInt(1);
		if (rand == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int randomInt() {
		int rand = new Random().nextInt(9) + 1;
		return rand;
	}
}
