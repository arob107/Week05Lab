package lab05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	
	// create a list that will hold all of the cards in the deck
	public List<Card> cards = new ArrayList<Card>();
	
	public Deck() {		
		List<String> cardNames = new ArrayList<String>();	// create a list to hold the card names
		List<String> suits = new ArrayList<String>();	// create a list to hold the suits

		cardNames.add("Two");
		cardNames.add("Three");
		cardNames.add("Four");
		cardNames.add("Five");
		cardNames.add("Six");
		cardNames.add("Seven");
		cardNames.add("Eight");
		cardNames.add("Nine");
		cardNames.add("Ten");
		cardNames.add("Jack");
		cardNames.add("Queen");
		cardNames.add("King");
		cardNames.add("Ace");

		suits.add("Spades");
		suits.add("Hearts");
		suits.add("Diamonds");
		suits.add("Clubs");
		
		for (String name : cardNames) {		// loop through the card names
			for (String suit : suits) {		// loop through the card suits
				cards.add(new Card(name, suit));		// add the new cards to the cards list using the Card class
				// the Card method will add the value on it's own
			}
		}
	}
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	// add a describe method that loops through all of the cards
	// the describe method is defined in Card.java
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
	// add a shuffle method
	// Collections.shuffle with do the shuffle for you
	public void shuffle() {
		Collections.shuffle(cards);
		
	}
	
	// add a draw method
	// this will return a Card and remove it from the list of cards
	public Card draw() {
		// instantiate the card variable as a Card and pull the first card from the deck
		Card card = this.cards.remove(0); 
		return card;
	}
	
		
	

}
