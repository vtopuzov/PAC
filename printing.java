
public class printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printSquare();
		printTriangle(); 

		
	}

	public static void printSquare() {
		for( int i = 0; i<5; i++) {
			for (int j = 0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//counting at 0 and need new line to form square
	}
	public static void printTriangle() {
		for( int i = 0; i<5; i++) {
			for (int j = 0; j<i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//counting at 0 and need new line to form square
	}


}
