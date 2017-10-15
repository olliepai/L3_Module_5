package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class Plane extends Randomness {

	
	public static void main(String[] args) {
		ArrayList<Snake> snakes = new ArrayList<Snake>();
		int numberOfPassengers = 123;
		
		int totalVenom = 0; 
		
		for (int i = 0; i < 100; i++) {
			int viciousness = randomInt();
			boolean venomous = randomBool();
			Snake snake = new Snake(viciousness, venomous);
			snakes.add(snake);
			totalVenom += snake.getViciousness();
		}
		double probabilityOfDeath = (totalVenom * 10) / numberOfPassengers;
		
		System.out.println("The probability of death is " + probabilityOfDeath);
	}
}
