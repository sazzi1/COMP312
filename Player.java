/**
 * for the player's hand and options
 * @author saahil
 *
 */
public class Player {
	
	private String name;
	
	//how many cards the player can draw in one hand
	private Card[] hand = new Card[10];
	
	private int numCards;
	
	public Player (String aName) {
		
		this.name = aName;
		
		this.emptyHand();
	
		
	}
	
	//resets hand
	public void emptyHand() {
		for (int c=0; c<10;c++) {
			this.hand[c] = null;
		}
		this.numCards = 0;
	}
	
	//add cards to the hand
	
	public boolean addCard(Card aCard) {
		
		//print error if cards exceed the limit of 10
		if (this.numCards == 10) {
			System.err.printf("%s's hand already has the max amount of cards; " + "cannot add another\n", this.name);
			System.exit(1);
		}
		
		
	//adding a new card
		this.hand[this.numCards]= aCard;
		this.numCards++;
		return(this.getHandSum() <= 21);
		
	}
	
	public int getHandSum() {
		
		int handSum = 0;
		int cardNum;
		int numAces = 0;
		
		
		for (int c=0; c<this.numCards;c++) {
			cardNum = this.hand[c].getNumber();
			
			//for aces
			if(cardNum == 1) {
				numAces++;
				handSum += 11;
				//for faces cards
			} else if (cardNum > 10) {
				handSum += 10;
				//for the regular 1-9 numbers
			}else {
				handSum += cardNum;
			}
		}
		
		//switch for ace to determine for 11 or 1 depending on what current hand is showing
		while (handSum > 21 && numAces > 0) {
			handSum -= 10;
			numAces--;
		}
		
		return handSum;
	}
	
	public void printHand(boolean showFirstCard) {
		
		System.out.printf("%s's cards:\n", this.name);
		for(int c = 0; c<this.numCards; c++) {
			if(c==0 && !showFirstCard) {
				System.out.println(" [hidden]");
			}else {
				System.out.printf(" %s\n", this.hand[c].toString());
			}
		}
	}
	
	

}
