
public abstract class EnergyProducer {

	protected int serial;
	
	public EnergyProducer(){
		
	}
	
	public EnergyProducer(int serial) {
		setSerialNumber(this.serial);
	}
	
	public void setSerialNumber(int serial) {
		this.serial=serial;
		if(serial<=0) {this.serial=-1;}
	}
	
	
	
	public final int getSerialNumber() {
		return serial;
	}
	
	public abstract double Energy();
		
}
	
	

