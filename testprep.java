import java.util.Scanner;

public class testprep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter square side length");
		int sidelength = input.nextInt();
		printmultiplicationtable(sidelength);
		

		
	}



public static void printmultiplicationtable(int sidelength) {
	System.out.print("  |");
	for(int i=1; i<sidelength; i++) {
		System.out.print(" "+ i + " |");
	}
	System.out.println();
	for(int i=1; i<sidelength; i++) {
		System.out.print("____");
	}
	System.out.println();
	for(int i=1; i<sidelength; i++) {
		System.out.print(i + " | ");
		
		for (int j = 1; j<sidelength; j++) {
		int Results=i*j;
		if(Results<10) {
		System.out.print(Results + " | ");
		}
		else System.out.print(Results + "| ");
		}
System.out.println();
		}
	}


}

