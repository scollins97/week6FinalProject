package week6FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<Card>(fillDeck());

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
	public void shuffle() {
	Collections.shuffle(cards);
	}
	public Card draw() {//takes the first value of the deck, stores it in temp, then deletes from cards. returns that card
	return cards.remove(0);
	}


}