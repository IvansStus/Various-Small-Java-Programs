/**
 *  Program #1d
 *  Get 5 random #'s and transition them into a poker hand.
 *  CS108-2
 *  1/30/18
 *  @author Ivan Stus
*/
import java.util.Arrays;
import java.util.Random;
public class FiveCards {
	
	public static void main(String[] args) {
		int deckSize = 52;
		int handSize = 5;
		long randomGeneratorSeed = 1111;
		int[] hand = initHand(deckSize, handSize, randomGeneratorSeed);
		showHand(hand);	
		sameSuit(hand);			
	}
	public static int[] initHand(int deckSize, int handSize, long randomGeneratorSeed) {
		int[] hand = new int[handSize];
		Random rand = new Random(randomGeneratorSeed);
		for (int i = 0; i < handSize; i++) {
			hand[i] = rand.nextInt(deckSize);
		}
		return hand;
	}
	public static void showHand(int[] hand) {
		getCardValue(hand[0]);
		getCardValue(hand[1]);
		getCardValue(hand[2]);
		getCardValue(hand[3]);
		getCardValue(hand[4]);
	}
	public static void sameSuit(int[] hand) {
		Arrays.sort(hand);
		int clubCount = 0;
		int diamondCount = 0;
		int heartCount = 0;
		int spadeCount = 0;
		for (int i = 0; i < hand.length; i++) {			
			if (hand[i] >= 0 && hand[i] <= 12) {
				clubCount++;
			}
			else if (i >= 13 && i <= 25) {
				diamondCount++;
			}
			else if (i >= 26 && i <= 38) {
				heartCount++;
			}
			else if (i >= 39 && i <= 51) {
				spadeCount++;
			}
			else if (clubCount > 1) {
				System.out.println(getCardValue(hand[i]));
			}
			else if (diamondCount > 1) {
				System.out.println(getCardValue(hand[i]));
			}
			else if (heartCount > 1) {
				System.out.println(getCardValue(hand[i]));
			}
			else if (spadeCount > 1) {
				System.out.println(getCardValue(hand[i]));
			}
		}		
	}
	public static String getCardValue(int cardNumber) {
		System.out.println(getRank(cardNumber) + " of " + getSuit(cardNumber));
		return getRank(cardNumber) + " of " + getSuit(cardNumber);		
	}
	public static String getSuit(int cardNumber) {
		String suit = "";
		if (cardNumber >= 0 && cardNumber <= 12) {
			suit = "Clubs";
		}
		if (cardNumber >= 13 && cardNumber <= 25) {
			suit = "Diamonds";
		}
		if (cardNumber >= 26 && cardNumber <= 38) {
			suit = "Hearts";
		}
		if (cardNumber >= 39 && cardNumber <= 51) {
			suit = "Spades";
		}
		return suit;
	}
	public static String getRank(int cardNumber) {
		String rank = "";
		if (cardNumber % 13 == 0) {
			rank = "Ace";
		}
		if (cardNumber % 13 == 1) {
			rank = "Two";
		}
		if (cardNumber % 13 == 2) {
			rank = "Three";
		}
		if (cardNumber % 13 == 3) {
			rank = "Four";
		}
		if (cardNumber % 13 == 4) {
			rank = "Five";
		}
		if (cardNumber % 13 == 5) {
			rank = "Six";
		}
		if (cardNumber % 13 == 6) {
			rank = "Seven";
		}
		if (cardNumber % 13 == 7) {
			rank = "Eight";
		}
		if (cardNumber % 13 == 8) {
			rank = "Nine";
		}
		if (cardNumber % 13 == 9) {
			rank = "Ten";
		}
		if (cardNumber % 13 == 10) {
			rank = "Jack";
		}
		if (cardNumber % 13 == 11) {
			rank = "Queen";
		}
		if (cardNumber % 13 == 12) {
			rank = "King";
		}
		return rank;
	}
	public static String getIdentificationString() {
		return ("Program 1, Ivan Stus, csscxxxx");
	}

}
