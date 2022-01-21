package week6FinalProject;

public class App {

	public static void main(String[] args) {
		//instantiates a new deck that comes with 52 of the standard playing cards
		Deck deck = new Deck();
		//instantiates two players that have empty hands and zero points
		Player p1 = new Player("Player 1");
		Player p2 = new Player("Player 2");
		//shuffles the deck
		deck.shuffle();
		//loops 54 times, each player gets a new card from the deck every other iteration
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
			p1.draw(deck);
			}else {
			p2.draw(deck);
			}
		}
		//both players are dealing a card from their hand for 26 iterations. 
		//whichever player has the card with the higher value gets a point
		for(int i = 0; i < 26; i++) {
			Card player1Card = p1.flip();
			Card player2Card = p2.flip();
			if(player1Card.getValue() > player2Card.getValue()) {
				p1.incrementScore();
			}
			if(player1Card.getValue() < player2Card.getValue()) {
				p2.incrementScore();
			}	
		}
		//printing each players final score using method built into Player
		p1.printScore();
		p2.printScore();
		//decides who wins based on whoever has the higher score. if both players have the same score its a draw
		if(p1.getScore() > p2.getScore()) {
			System.out.println(p1.getName() + " Wins!");
		}else if(p1.getScore() < p2.getScore()) {
			System.out.println(p2.getName() + " Wins!");
		}else {
			System.out.println("It's a Draw");
		}
	}

}
