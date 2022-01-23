package week6FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<Card>(fillDeck());
	//fills the deck with 52 cards looping through each suit 14 times
	private List<Card> fillDeck(){
		List<Card> newDeck = new ArrayList<Card>();
		String[] cardSuits = {"Hearts" , "Spades" , "Diamonds" , "Clubs"};
		for(int i = 0; i < 4; i++) {                                  
			for(int j = 2; j <= 14; j++) {                                											  	
					Card temp = new Card(j, cardSuits[i]);
					newDeck.add(temp);
			}
		}	
		return newDeck;
	}	
	//shuffles deck using built in java method
	public void shuffle() {
	Collections.shuffle(cards);
	}
	//returns the top card in the deck and deletes it from the deck
	public Card draw() {
	return cards.remove(0);
	}


}