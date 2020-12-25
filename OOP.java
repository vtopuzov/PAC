
public class OOP {

	public static void main(String[] args) {
	int[] Numbers= new int[10];
	for(int i=0; i<Numbers.length; i++) {
		Numbers[i]= (int) (Math.random()*20);
		System.out.print(Numbers[i]+" ");
		
		}
	System.out.println();
	int[] newNumbers= new int[Numbers.length];
	int j=0;
	for(int i=0; i<Numbers.length; i++) {
		if(LinearSearch(newNumbers, Numbers[i])==-1) {
		newNumbers[j]=Numbers[i];
		j++;
		}
		}
	for(int i=0; i<newNumbers.length; i++) {
		System.out.print(newNumbers[i] + " ");
	}
	
	System.out.print(Numbers);
	
	}
	public static int LinearSearch(int[] List, int key) {
	for(int i=0; i<List.length; i++) {
		if(List[i]==key) return i;
	}
	
		return -1;
	}
}	
