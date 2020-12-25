
public class Card {

	protected String suit;
	protected int rank;
	
	public Card(){
		
	}
	
	public Card(String suit, int rank) {
	
		this.suit=suit;
		this.rank=rank;
		
				
		
	}
	
	public void draw() {
		System.out.println("The  " + rank +  " of " + suit);
	}
	
	
	
}
