
public class TestProgram {

	public static void main(String[] args) {
		

		 int NumProducers=2;
		EnergyProducer[] producers= new EnergyProducer[NumProducers];
		producers[0]= new WindFarm(2345, 10000, 2.5);
		producers[1]= new SolarArray(25657, 4.5, 0.5);
		
		
		
		double totalenergy=0;
		for(int i=0; i<producers.length; i++) {
			totalenergy= totalenergy + producers[i].Energy();
		}
		System.out.println("the total energy produced is: " + totalenergy);
	}

}
