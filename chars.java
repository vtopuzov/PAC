import java.util.Scanner;
public class chars {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter superman size");
		int Size= input.nextInt();
		
		int newint= 1;
		char c= (char) newint;
		System.out.println(c+"");
		
		
		Horizontales(Size);
		System.out.println();
		Verticales(Size,1);
		Horizontales(Size);
		System.out.println();
		Verticales(Size,Size);
		Horizontales(Size);

    }

	
	public static void Horizontales(int x) {
		for (int i=1; i<=x; i++) {
			System.out.print("S");
		}
	}


	public static void Verticales(int x, int column) {
		switch(column) {
		case 1:
		for (int i=1; i<x/2; i++) {
			System.out.println("S");
		}
		break;
		default:
	
		for(int i=1; i<x/2; i++) {
		for(int j=0; j<x-1; j++) {
			System.out.print(" ");
		}
		System.out.println("S");
		}
	}	
	
	}

	
}
