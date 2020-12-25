import java.util.Scanner;

public class linearsearch {
	

	
     public static void main(String[] args) {
    	Scanner input = new Scanner (System.in);
    System.out.println("Please enter two integers and a character");
    	int One = input.nextInt();
    int Two = input.nextInt();
    String Source = input.next();
    char c = Source.charAt(0);
    Printbox(One, Two, c);
    	 
    	 
     }
     public static void Printbox(int x, int y, char c) {
    	 for(int i=0; i<x; i++) {
    		 for(int j=0; j<y; j++) {
    			 System.out.print(c);
    		 }
    		 System.out.println();
    	 }
    	 
    	 
     }
     
}



