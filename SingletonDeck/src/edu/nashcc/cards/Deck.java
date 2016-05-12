package edu.nashcc.cards;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Deck {
	private static Deck uniqueDeck;
	private String[] deckOfCards = { "ACE-Heart", "KING-Heart", "QUEEN-Heart",
			"JACK-Heart", "10-Heart", "9-Heart", "8-Heart", "7-Heart",
			"6-Heart", "5-Heart", "4-Heart", "3-Heart", "2-Heart", "ACE-Spade",
			"KING-Spade", "QUEEN-Spade", "JACK-Spade", "10-Spade", "9-Spade",
			"8-Spade", "7-Spade", "6-Spade", "5-Spade", "4-Spade", "3-Spade",
			"2-Spade", "ACE-Club", "KING-Club", "QUEEN-Club", "JACK-Club",
			"10-Club", "9-Club", "8-Club", "7-Club", "6-Club", "5-Club",
			"4-Club", "3-Club", "2-Club", "ACE-Diamond Ace", "KING-Diamond",
			"QUEEN-Diamond", "JACK-Diamond", "10-Diamond", "9-Diamond",
			"8-Diamond", "7-Diamond", "6-Diamond", "5-Diamond", "4-Diamond",
			"3-Diamond", "2-Diamond" };
	private LinkedList<String> cardList = new LinkedList<String>(
			Arrays.asList(deckOfCards));

	private Deck(){
	}
	public static Deck getDeck(){
		if(uniqueDeck == null){
			System.out.println("Opening a new pack of cards...");
			uniqueDeck = new Deck();
		}
		System.out.println("Deck of cards open.");
		return uniqueDeck;
	}
	public static int getID(Deck deck){
		return System.identityHashCode(deck);
	}
    public LinkedList<String> getCardsOfDeck() {
        return uniqueDeck.cardList;
    }
    public String displayDeck(){
    	StringBuilder sb = new StringBuilder();
    	Iterator<String> i = cardList.iterator();
    	for(int count = 0; count <= cardList.size(); count++){
    			while(i.hasNext()){
    				sb.append(i.next());
    				sb.append(", ");
    			}
    	}
    	return sb.toString();
    }
    public void shuffle(){
     	System.out.println("Shuffling cards...");
    	Collections.shuffle(cardList);
    }
    public String drawCard(){
    	return cardList.getFirst();
    }
    public /*LinkedList<String>*/ String drawHand(int numOfCards){
    	LinkedList<String> hand = new LinkedList<String>();
     	for(int i = 0; i < numOfCards; i++){
    		String newCard = drawCard();
    		cardList.remove(0);
    		hand.add(newCard);
    	}
     	return hand.toString();
    }
}
