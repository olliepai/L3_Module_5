import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {
	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest
	 * chip. (In England, french fries are called "chips".) * Find the Beatle with
	 * the longest chip. You may not edit the Chip or Beatle classes. Make sure to
	 * initialize The Beatles before you start your search. *
	 **/
	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");
		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}
	
	private void findLongestChip() {
		initializeBeatles();
		ArrayList<Chip> chips = new ArrayList<Chip>();
		String longestChipOwner = "";
		for (int i = 0; i < theBeatles.size(); i++) {
			chips = theBeatles.get(i).getChips();
			for (int j = 0; j < chips.size() - 1; j++) {
				if (chips.get(j).getLength() < chips.get(j + 1).getLength() && j != 0) {
					longestChipOwner = theBeatles.get(i).getName();
				}
				else {
					longestChipOwner = theBeatles.get(i).getName();
				}
			}
		}
		System.out.println(longestChipOwner);
	}
	
	public static void main (String[] args) {
		LongChipCompetition competition = new LongChipCompetition();
		competition.findLongestChip();
		
		
		
	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
			if (this.name.contains("in"))
				chips.add(new Chip(10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}
}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}