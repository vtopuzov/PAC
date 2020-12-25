
public class WindFarm extends EnergyProducer {

	private int numberOfAcres;
	private double MWperAcre;
	
	public WindFarm(int serial, int numberOfAcres, double MWperAcre) {
	this.serial=serial;
	this.numberOfAcres=numberOfAcres;
	this.MWperAcre=MWperAcre;
		
	}
	
	
	public void setAcres(int acres) {
		this.numberOfAcres=acres;
	}
	
	public void setMWperAcre(double MWperAcre) {
		this.MWperAcre=MWperAcre;
	}
	
	@Override
	public double Energy() {
		return numberOfAcres*MWperAcre;
		
		
	}
}
