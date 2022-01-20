package week6FinalProject;

public class App {

	public static void main(String[] args) {
		//Deck deck = new Deck();
		//deck.shuffle();
		//Card temp = deck.draw();			//delete all of this before submitting 
		//temp.describe();
		Deck deck = new Deck();
		Player p1 = new Player("Player 1");
		Player p2 = new Player("Player 2");
		deck.shuffle();
		for(int i = 0; i < 26; i++) {
			p1.draw(deck);
			p2.draw(deck);
		}//the assignment asks for 52 loops for each player... that doesn't make sense so i changed it to 26
		for(int i = 0; i < 26; i++) {
			Card player1Card = p1.flip();
			Card player2Card = p2.flip();
			if(player1Card.getValue() > player2Card.getValue()) {
				p1.incrementScore();
			}
			if(player1Card.getValue() < player2Card.getValue()) {
				p2.incrementScore();
			}//i'd like to add an option for when both players draw a card with the same value	
		}
		System.out.println("Player 1: " + p1.getScore());
		System.out.println("Player 2: " + p2.getScore());
		if(p1.getScore() > p2.getScore()) {
			System.out.println("Player 1 Wins!");
		}else if(p1.getScore() < p2.getScore()) {
			System.out.println("Player 2 Wins!");
		}else {
			System.out.println("It's a Draw");
		}
	}

}
