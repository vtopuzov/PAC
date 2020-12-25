
public class TarotCard extends Card {
	
	private String arcana;
	private boolean isReversed;
	
	public TarotCard(){
		;
		
	}
	
	
	public TarotCard( int rank){
		super("", rank);
		setArcana("Major");
	}
		
	public TarotCard(String suit, int rank){
		super(suit, rank);
		setArcana("Minor");
	}

	public String getArcana() {
		return arcana;
	}
	
	public void setArcana(String arcana) {
		this.arcana=arcana;
	}
	
	@Override
	public void draw() {
		
		double flip = Math.random();
		
		if(flip>=0.5) {
		this.isReversed=true;}
		
		if(arcana=="Minor" && isReversed==true) {
			System.out.println(arcana + "Arcana" + rank +  " of " + suit+ "in reverse");
		}
		
		else if(arcana=="Minor" && isReversed==false) {
			System.out.println(arcana + "Arcana" + rank +  " of " + suit);
		}
		else if(arcana=="Major" && isReversed==true) {
			System.out.println(arcana + "Arcana" + rank +  "in reverse");
		}
		else {
			System.out.println(arcana + "Arcana" + rank);}
		
	
	}
	
}
