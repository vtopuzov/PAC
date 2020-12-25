
public class uniquenumbers {

	public static void main(String[] args) {
		int y=0;
		int[] Numbers = {1,2,3,4};
		for(int i=0; i<Numbers.length; i++) {
			for(int j=0; j<Numbers.length; j++){
				for(int k=0; k<Numbers.length; k++) {
		if((Numbers[i]!=Numbers[j])&& (Numbers[j]!=Numbers[k]) && (Numbers[i]!=Numbers[k])) {
		
		System.out.println( Numbers[i]*100 + Numbers[j]*10 + Numbers[k]);
		y++;
		}
		
		
			}
	}
	}
		System.out.println(y);
	}
}
