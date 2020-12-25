
public class SolarArray extends EnergyProducer {
private double maxOutput;
private double intensity;
	
public SolarArray(int serial, double maxOutput, double intensity) {
this.serial=serial;
this.maxOutput=maxOutput;
this.intensity=intensity;
	
}

public void setIntensity(double intensity) {
	this.intensity=intensity;
	
}

public void setMaxOutput(double maxOutput) {
	this.maxOutput=maxOutput;
	
}

@Override
public double Energy() {
	return maxOutput*intensity;
}
	
}
