package week6FinalProject;

public class Card {
private int value;
private String name;
//every card will have a value from 2 to 14 and a suit name 
public Card(int value, String name) {
	this.value = value;
	this.name = name;
}
//if a card calls the describe method it will describe it this way. 
public void describe() {
	switch(value) {
	case 2: 
		System.out.println("Two of " + name);
		break;
	case 3: 
		System.out.println("Three of " + name);
		break;
	case 4:
		System.out.println("Four of " + name);
		break;
	case 5:
		System.out.println("Five of " + name);
		break;
	case 6:
		System.out.println("Six of " + name);
		break;
	case 7:
		System.out.println("Seven of " + name);
		break;
	case 8:
		System.out.println("Eight of " + name);
		break;
	case 9:
		System.out.println("Nine of " + name);
		break;
	case 10:
		System.out.println("Ten of " + name);
		break;
	case 11:
		System.out.println("Jack of " + name);
		break;
	case 12:
		System.out.println("Queen of " + name);
		break;
	case 13:
		System.out.println("King of " + name);
		break;
	case 14:
		System.out.println("Ace of " + name);
		break;
	}
}
	
//gets the value of a card
public int getValue() {
	return value;
}

}
