package gameOfWar;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public void describe(String name) {
		System.out.println(name);
		for (Card card : hand) {
			card.describe();
		}
	

	}
	
		public Card flip() {
		return hand.remove(0);
}
		
		public List<Card> draw(Deck deck) {
		hand.add(deck.draw());
		return hand;
			
		}
		
		public int incrementScore() {
			return score++;
		}
		
		
}
	
	
	
	

