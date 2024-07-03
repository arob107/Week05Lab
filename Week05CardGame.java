package lab05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Week05CardGame {

	// This Lab will give you a basic look at creating an Object Oriented Card Game.
	// The idea here is to prepare you for your Week 6 Unit Final Project.
	// There are many ways to implement this Lab, please use the tools that you
	// know,and go from there.
	// These exercises are intended to be coded in order 1 through 5.

	public static void main(String[] args) {
		
		// A standard deck of playing cards has 52 cards as specified below
				// i. There are 4 suits: Clubs, Diamonds, Hearts, & Spades
				//
				// ii. Each suit has 13 cards: Two, Three, Four, Five, Six, Seven,
				// 		Eight, Nine, Ten, Jack, Queen, King & Ace
				
				// iii. Comparing Cards: When comparing two cards, Ace is high and Two is low.
						// to make this easy, a Two will have a value of 2, a
						// Three will have a value of 3, ... and an Ace will have a value of 14.
		
			// 1. Card Class:
				// Create a class called Card to represent a standard playing card.
				// Fields: The Card class should have the following fields:
					// a. name field
					// b. suit field
					// c. value field for comparing against other cards.
						
				// Methods: This class can have any useful method.
					// a. describe() to display the card information to the Console.
					// b. Getters & Setters
					
		System.out.println("\nQuestion 1: Card Class");
		// Add your code here to instantiate a Card
		Card c1 = new Card("Ace", "Spades");
		// Call the describe method on the newly instantiated card.
		c1.describe();
		
		// 2. Deck Class:
			//		Create a class called Deck.
			//		Fields:  This class should have a list of Card field called cards 
			//				 that will hold all the cards in the deck. 
			//			List<Card> cards = new ArrayList<Card>(); 
			//
			//		Constructor: The constructor for the Deck Class should
			// 			instantiate all 52 standard playing cards and add them to the cards list.
			//
			//		Methods:  
			//			a.  describe() to describe the deck to the Console -- 
			//					print out all of the cards in the deck.
			//
		System.out.println("\nQuestion 2: Deck Class");
		    // Add your code here to instantiate a Deck	
	    Deck deck1 = new Deck();
		    
		    // Call the describe method on the newly instantiated deck.
	    deck1.describe();
			    
	    // 3. Deck shuffle() Method:
			//		Add a shuffle method within the Deck Class
		System.out.println("\nQuestion 3: Deck shuffle() method");
			// Test your method here
		deck1.shuffle();			
			
			// Call the describe method on the newly shuffled deck.
		deck1.describe();
			
		// 4. Deck draw() Method:
			//		Add a draw method within the Deck Class
		System.out.println("\nQuestion 4: Deck draw() method");
			// Test your method here
		Card card = deck1.draw();
		card.describe();
		
		// 5. Create Game Board:
		//		Create and test a method that takes an int as a parameter (representing the
		// 			number of players for a game) and returns a Map<String, List<Card>>
		// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
		//			and their cards.
		//
		// 			The method should create a new instance of Deck, shuffle it,
		// 			and deal the cards out to the "players" in the Map.
		System.out.println("\nQuestion 5: Create Game");
		// Call your method here
		int numberOfPlayers = 8;
		Map<String, List<Card>> q5Game = createGame(numberOfPlayers);
		
		// loop through the players and display their hands
		for (int i = 0; i < numberOfPlayers; i++) {
			// get the player's name
			String playerName = "Player " + (i+1);
			System.out.println("\n" + playerName);
			
			// get the players hand from the map
			List<Card> playersHand = q5Game.get(playerName);
			
			// loop through the player's hand and display the cards
			for (Card playersCard : playersHand) {
				playersCard.describe();
			}
		}
		

	} // end of main
	
	// Method 5:
	private static Map<String, List<Card>> createGame(int numberOfPlayers) {
		Map<String, List<Card>> gameBoardMap = new HashMap<String, List<Card>>();
		
		// create a new deck using the Deck class
		Deck methodDeck = new Deck();

		// shuffle the deck
		methodDeck.shuffle();

		// use a loop to add players and an empty hand to the map
		for (int i = 0; i < numberOfPlayers; i++) {
			
			// create each new players name
			String playerName = "Player " + (i+1);
			
			// create each new players empty hand
			List<Card> playersHand = new ArrayList<>();
			
			// add each player and their empty hand to the map
			gameBoardMap.put(playerName, playersHand);
		}
		
		// use a loop to deal cards to the players
		// start by looping through each player
		for (int i = 0; i < numberOfPlayers; i++) {
			
			// deal a card, remove it from the deck, and store it with the player
			for (int j = 0; j < 52/numberOfPlayers; j++) {
				// look up each player
				String playerName = "Player " + (i+1);

				// get the players hand and deal them a card
				List<Card> playersHand = gameBoardMap.get(playerName);
				playersHand.add(methodDeck.draw());
				gameBoardMap.replace(playerName, playersHand);
			}
		}
		
		if (52 % numberOfPlayers != 0) {
			System.out.println("All players have been dealt equal hands. "
					+ "There are " + 52 % numberOfPlayers + " cards remaining in the deck.");
		} else {
			System.out.println("All cards have been dealt.");
		}
		return gameBoardMap;
		
	}

}
