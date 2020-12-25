import java.util.Scanner;


public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card card = new TarotCard("spades", 3);
		TarotCard card2 = new TarotCard("spades", 3);
		card.draw();
		card2.draw();
		System.out.println(card.equals(card2));
		
		System.out.print( card == card ? "poing " : card2);
		
		System.out.print( card.equals(card2) ? "poing " : card2);
	
		System.out.println("What card would you like to create?");
	    Scanner s = new Scanner(System.in);
	    String cardinput= s.next();
	    char[] cards= cardinput.toCharArray();
	   
	    
	
		}
	
	

	}
