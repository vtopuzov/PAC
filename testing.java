
public class testing {

	public static void main(String[] args) {
	int[] Numbers= new int[10];
	
	for(int i=0; i<Numbers.length; i++) {
		Numbers[i]= (int) (Math.random()*10);
	}
	
	for(int e: Numbers) {
		System.out.print(e+ " ");
	}
	
	System.out.println(Search(Numbers,12));
	
	int [] DistinctNumbers = new int[Numbers.length];
	int index=0;
	for(int e: Numbers) {
		if(Search(DistinctNumbers,e)==-1) {
			DistinctNumbers[index]=e;
			index++;
		}
	}
	
	System.out.println(index);
		for(int i=0; i<index; i++) {
			System.out.print(DistinctNumbers[i] + " ");
		}
	}
	public static int Search (int[] List, int key) {
		for(int i=0; i<List.length; i++) {
			if(key==List[i]) 
				return i;
			}
			
	return -1;
	
		}
		
}
