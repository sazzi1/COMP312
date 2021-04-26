
public class Card {
	private Suit mySuit;
	
	/**
	 * this represents the value of each card for aces & face cards
	 */
	private int myNumber;
	
	
	public Card(Suit aSuit, int aNumber) {
		
		this.mySuit = aSuit;
		this.myNumber = aNumber;
		
		
		if (aNumber >= 1 && aNumber <= 13) {
		this.myNumber = aNumber;
		} else {
			System.err.println(aNumber + " is not a valid Card number");
			System.exit(1);
		}
		
	}
	
	/**
	 * provides the return of the number of the card
	 * @return
	 */
	
	public int getNumber() {
		return myNumber;
		
	}
	
	public String toString() {
		
		
		String numStr = "Error";
		
		switch(this.myNumber) {
		
		
		case 2:
			numStr = "Two";
			break;
			
		case 3:
			numStr = "Three";
			break;
			
		case 4:
			numStr = "Four";
			break;
			
		case 5:
			numStr = "Five";
			break;
			
		case 6:
			numStr = "Six";
			break;
			
		case 7:
			numStr = "Seven";
			break;
			
		case 8:
			numStr = "Eight";
			break;
			
		case 9:
			numStr = "Nine";
			break;
			
		case 10:
			numStr = "Ten";
			break;
			
		case 11:
			numStr = "Jack";
			break;
			
		case 12:
			numStr = "Queen";
			break;
			
		case 13:
			numStr = "King";
			break;
			
		case 1:
			numStr = "Ace";
			break;
			
			
		}
		
		return numStr + " of " + mySuit.toString();
	}

}

