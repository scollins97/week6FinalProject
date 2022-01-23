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
//prints out the players name,score, and hand
public void describe() {
	System.out.println("Player name: " + name);
	System.out.println(score);
	for(int i = 0; i < hand.size(); i++) {
		hand.get(i).describe();
	}
}
//takes the first value in the players hand and returns it while deleleting from the hand
public Card flip() {
	return hand.remove(0);
}
//draws a card from a deck and adds it to the players hand
public void draw(Deck deck) {
	this.hand.add(deck.draw());
}
//adds one point to the players score
public void incrementScore() {
score++;	
}
//gets the players current score
public int getScore() {
	return score;
}
public String getName() {
	return name;
}
//prints the players current score
public void printScore() {
	System.out.println(name + ": " + score);
}
}
