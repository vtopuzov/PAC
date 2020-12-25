
public class Algorithms {

	public static void main(String[] args) {
		int[] Numbers= new int[10];
		for(int i=0; i<Numbers.length; i++) {
			Numbers[i]= (int) (Math.random()*20);
			System.out.print(Numbers[i]+" ");
			
			}
		System.out.println();
		int temp=0;
		
		for (int i=0; i < Numbers.length; i++) {
			int currentmax = Numbers[i];
			int currentMaxindex= i;
			
			for(int j=i+1; j<Numbers.length; j++) {
				if(currentmax<Numbers[j]) {
					currentmax=Numbers[j];
					currentMaxindex=j;
				}
			}
			if(currentMaxindex!=i) {
				temp=Numbers[i];
				Numbers[i]=Numbers[currentMaxindex];
				Numbers[currentMaxindex]=temp;
				currentMaxindex=i;
			}
			
			System.out.print(Numbers[i] + " ");
		}
		System.out.println();
		Shuffle(Numbers);
		for(int i=0; i<Numbers.length;i++) {
			System.out.print(Numbers[i]+ " ");
			
		}
		}

	public static int[] Shuffle (int[] List) {
		int[] ShuffledArray = new int[List.length];
		for(int i=0; i<List.length;i++) {
			int newindex= (int) (Math.random()*List.length);
			int temp=List[i];
			List[i]=List[newindex];
			List[newindex]=temp;
		}
		return List;
	}
	
	
}
