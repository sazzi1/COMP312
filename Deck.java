
import java.util.Random;

/**
 * for the deck of cards and able to randomize to shuffle the deck
 * @author saahil
 *
 */
public class Deck {
	
	/**
	 * array of cards
	 */
	private Card[] myCards;

	
	/**
	 * the cards that are still in the deck
	 */
	private int numCards;
	
	/**
	 * default deck without shuffling
	 */
	public Deck() {
		//defining first deck w/o shuffling
		//overloaded deck method
		this(1, false);
	}
	
	/**
	 * playing with multiple decks instead of just one and whether it will be shuffled
	 * @param numDeck 
	 * @param shuffle randomize/shuffle the cards
	 */
	public Deck(int numDecks, boolean shuffle) {

		
		
		this.numCards = numDecks * 52;
		this.myCards = new Card[this.numCards];
		
		//initial card
		int c = 0;
		
		// for each deck
		for (int d = 0; d < numDecks; d++) {
			
			//each suit
			for(int s = 0; s < 4; s++) {
				
				//each number
				for(int n = 1; n <= 13; n++) {
					
					//adding a new card to the deck
					this.myCards[c] = new Card(Suit.values()[s], n);
					c++;
					
				}
			}
		}
		
		//shuffle
		if(shuffle) {
			this.shuffle();
		}
			
		}
		
		public void shuffle() {
			
			//generate random number genertaor
			Random rng = new Random();
			
			//temporary variable
			Card temp;
			
			int j;
			for(int i = 0; i < this.numCards; i++) {
				
				//get a random card as a swapper, j for i
				
				j = rng.nextInt(this.numCards);
				
				//perform swap
				temp = this.myCards[i];
				this.myCards[i] = this.myCards[j];
				this.myCards[j] = temp;
			}
			}
		
		public Card dealNextCard() {
			
			//get topcard
			Card top = this.myCards[0];
			
			for (int c = 1; c < this.numCards; c++){
				this.myCards[c-1] = this.myCards[c];
			}
			this.myCards[this.numCards-1] = null;
			
			//take out cards in deck
			
			this.numCards--;
			
			return top;
		}
		
		
		/**
		 * print top cards of deck	
		 */
		
		public void printDeck(int numToPrint) {
			
			for (int c = 0; c < numToPrint; c++) {
				System.out.printf("% 3d/%d %s\n", c+1, this.numCards, this.myCards[c].toString());
			}
			System.out.printf("\t[%d other]\n", this.numCards - numToPrint);
			
		}
		
		
	}
	


