package Arrays;
import java.security.SecureRandom;
public class DeckOfCards {
   private static final int Number_of_cards = 52;
   private static final SecureRandom randomNumbers = new SecureRandom();
   public Card[] deck;
   public int Current_card = 0 ;
   
   public DeckOfCards()
   {
	   String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", 
		         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
	   String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" }; 
	   
	   deck = new Card[Number_of_cards];
	   
	   for(int count = 0; count < deck.length ; count++)
	   {
		   deck[count] = new Card(faces[count % 13] , suits[count / 13]);
	   }
   }
   public void suffle()
   {
	   Current_card = 0;
	   for(int first = 0; first < deck.length ; first++)
	   {
		   int second = randomNumbers.nextInt(Number_of_cards);
		   
		   Card temp = deck[first];
		   deck[first] = deck[second];
		   deck[second] = temp;
	   }
   }
   public Card dealCard()
   {
	   if(Current_card < deck.length)
		   return deck[Current_card++];
	   else
		   	return null;
   }
}
