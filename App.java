package gameOfWar;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		
		deck.shuffle();
		
		for (int i = 1; i <= 52; i++) {
			if (i % 2 == 0) {
			player1.draw(deck);
			} else {
			player2.draw(deck);
			}
			
			
		}
		
		for (int i = 1; i <= 26; i++) {
			System.out.println("----------");
			System.out.println("Round " + i);
			System.out.println("----------");
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			card1.describe();
			card2.describe();
			
			if (card1.value > card2.value) {
				player1.incrementScore();
				System.out.println("Player 1 wins!");
				System.out.println("--------------");
			} else  if (card2.value > card1.value){
				player2.incrementScore();
				System.out.println("Player 2 wins!");
				System.out.println("--------------");
			} else {
				System.out.println("It's a draw!");
				System.out.println("------------");
			}
			
			System.out.println("Player 1 score: " + player1.score);
			System.out.println("Player 2 score: " + player2.score);
			System.out.println("-----------------------");
		}
		
		if (player1.score > player2.score) {
			System.out.println("Player 1 wins, " + player1.score + " to " +  player2.score + ".");
		} else if (player2.score > player1.score) {
			System.out.println("Player 2 wins, " + player2.score + " to " +  player1.score + ".");
		} else {
			System.out.println("It's a draw! " + player1.score + " to " + player2.score + " !");
		}
		
	}

}
