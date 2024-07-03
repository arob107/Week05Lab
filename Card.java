package lab05;

public class Card {

	private String name;
	private String suit;
	private int value;
	
	public Card(String name, String suit) {
		this.name = name;
		this.suit = suit;
		
		// use a switch case to determine the value of the card based on the NAME of the card.
		// use toLowerCase to make sure there is a match
		switch(name.toLowerCase()) {
		case("two"):
			this.value = 2;
			break;
		case("three"):
			this.value = 3;
			break;
		case("four"):
			this.value = 4;
			break;
		case("five"):
			this.value = 5;
			break;
		case("six"):
			this.value = 6;
			break;
		case("seven"):
			this.value = 7;
			break;
		case("eight"):
			this.value = 8;
			break;
		case("nine"):
			this.value = 9;
			break;
		case("ten"):
			this.value = 10;
			break;
		case("jack"):
			this.value = 11;
			break;
		case("queen"):
			this.value = 12;
			break;
		case("king"):
			this.value = 13;
			break;
		case("ace"):
			this.value = 14;
			break;
		}	
				
	}
	
	public void describe() {
		System.out.println("Name: " + name + "\tSuit: " + suit + "\tValue: " + value);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
