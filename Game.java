
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Deck theDeck = new Deck(1, true);
		
		Player me = new Player("Saahil");
		Player dealer = new Player ("House");
		
		me.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		me.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		
		//display the first 2 cards for house and the player
		
		System.out.println("Cards are dealt\n");
		me.printHand(true);
		dealer.printHand(false);
		System.out.println("\n");
		
		
		boolean meDone = false;
		boolean dealerDone = false;
		String ans;
		
		while (!meDone || !dealerDone) {
			
			if (!meDone) {
				System.out.print("Hit or Stay? (Enter H or S for your decision)");
				ans = sc.next();
				System.out.println();
				
			//if H is made
				if(ans.compareToIgnoreCase("H")==0) {
					
					meDone = !me.addCard(theDeck.dealNextCard());
					me.printHand(true);
					
				}else {
					meDone = true;
				}
			}
			
			if (!dealerDone) {
				if(dealer.getHandSum() < 17) {
					System.out.println("The Dealer hits\n");
					dealerDone = !dealer.addCard(theDeck.dealNextCard());
					dealer.printHand(false);
				}else {
					System.out.println("The dealer stays\n");
					dealerDone = true;
				}
			}
			System.out.println();
		}
		
		//Close the scanner
		sc.close();
		
		me.printHand(true);
		dealer.printHand(true);
		
		int mySum = me.getHandSum();
		int dealerSum = dealer.getHandSum();
		
		if(mySum > dealerSum && mySum <= 21 || dealerSum > 21) {
			System.out.println("Player wins");
		}else {
			System.out.println("The dealer wins, of couse");
		}

	}

}
