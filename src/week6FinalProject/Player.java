package week6FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
private List<Card> hand = new ArrayList<Card>();
private int score = 0;
private String name;
public Player(String name) {
	this.name = name;
}

public void describe() {
	System.out.println("Player name: " + name);
	for(int i = 0; i < hand.size(); i++) {
		hand.get(i).describe();
	}
}
public Card flip() {//takes the first value in the players hand and returns it while deleleting from the hand
	return hand.remove(0);
}
public void draw(Deck deck) {//draws a card from a deck and adds it to the players hand
	this.hand.add(deck.draw());
}
public void incrementScore() {
score++;	
}
public int getScore() {
	return score;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void printScore() {
	System.out.println(name + ": " + score);
}
}
