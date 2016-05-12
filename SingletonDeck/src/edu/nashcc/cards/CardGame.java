package edu.nashcc.cards;

public class CardGame {

	public static void main(String[] args) {
		Deck deck = Deck.getDeck();
		print("Deck ID: " + deck.getID(deck));
		deck.shuffle();
		print("Player one draws a hand of seven cards:");
		print("\t" + deck.drawHand(7));
		print("Player two draws a hand of seven cards:");
		print("\t" + deck.drawHand(7));
		print("");
		print("Cards left:");
		print(deck.displayDeck());
		
/* testing purposes		
		print(deck.displayDeck());
		print("Top card drawn: " + deck.drawCard());
		print("");
		deck.shuffle();
		print(deck.displayDeck());
		print("");
		print("Top card drawn: " + deck.drawCard());
		print(deck.drawHand(37)); 
		print(deck.displayDeck());
*/
	}
	private static void print(String output){
		System.out.println(output);
	}
}
