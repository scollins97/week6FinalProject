package week6FinalProject;

public class Card {
private int value;
private String name;

public Card(int value, String name) {
	this.value = value;
	this.name = name;
}

public void describe() {
	if(value == 2) {
		System.out.println("Two of " + name);
	}
	if(value == 3) {
		System.out.println("Three of " + name);
	}
	if(value == 4) {
		System.out.println("Four of " + name);
	}
	if(value == 5) {
		System.out.println("Five of " + name);
	}
	if(value == 6) {
		System.out.println("Six of " + name);
	}
	if(value == 7) {
		System.out.println("Seven of " + name);
	}
	if(value == 8) {
		System.out.println("Eight of " + name);
	}
	if(value == 9) {
		System.out.println("Nine of " + name);
	}
	if(value == 10) {
		System.out.println("Ten of " + name);
	}
	if(value == 11) {
		System.out.println("Jack of " + name);
	}
	if(value == 12) {
		System.out.println("Queen of " + name);
	}
	if(value == 13) {
		System.out.println("King of " + name);
	}
	if(value == 14) {
		System.out.println("Ace of " + name);
	}
}
/*
 * the method above not only describes the Card but also represents the value as a word instead of a 
 * number, this is nice because there is no 11,12,13 or 14 card in standard playing cards
 */
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
