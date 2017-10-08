package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class Plane {
	int numberOfPassengers;
	
	public static void main(String[] args) {
		ArrayList<Snake> snakes = new ArrayList<Snake>();
		
		for (int i = 0; i < 100; i++) {
			int viciousness = new Random().nextInt(9) + 1;
			int rand = new Random().nextInt(1);
			boolean venomous;
			if (rand == 0) {
				venomous = true;
			}
			else {
				venomous = false;
			}
			Snake snake = new Snake(viciousness, venomous);
			snakes.add(snake);
		}
	}
}
