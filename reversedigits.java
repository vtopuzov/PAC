
public class reversedigits {
public static void main (String[] args) {
	int NewNumber = 2;
	for(int i=1;i<7;i++) {
		for(int j=7;  j>i;  j--) {
			System.out.print(" ");
		}
		for(int j=1; j<i+1; j++) {
		System.out.print(j*NewNumber+ " ");
		}	
		for(int k=i+1; k>0; k--) {
			System.out.print(k*NewNumber+ " ");
				}
		
		System.out.println();
	}
	}
	

}
