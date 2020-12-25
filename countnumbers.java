
public class countnumbers {

	public static void main(String[] args) {
		int[] numbers = {2,2,4,5,7,9,19,19};
		for(int i=0; i< numbers.length; i++) {
			if(linearsearch(numbers,numbers[i])%2!=0) {System.out.println(i);}
		}

	}

	
	public static int linearsearch(int[] a, int key) {
		int result=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]==key) {
				result++;
			}
		}
		return result;
	}
}
