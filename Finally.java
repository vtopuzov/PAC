
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		boolean Condition = false;
		boolean Condition2 = true;
		int switchvalue = 2;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter difficulty 1-3");
		int difficulty = input.nextInt();
		
		System.out.println("Enter operand 1-3");
		String Operand = input.nextLine();
		
		switch (difficulty) {
		case 3: System.out.println("How bad");
		break;
		
		case 2: int randomness = (int) (Math.random()*10);
		break;
		
		
		}
		
		System.out.println ("Before");
		if (Condition)
			System.out.println("Inside");
		else if (Condition2)
			System.out.println("Outside");
		System.out.println("Goodbye");
		
		switch (switchvalue) {
		case 2:
			System.out.println ("I'm a zero");
		break;
		}	
		
		int counter = 0;
		while (counter <=10) {
			counter++;
			System.out.println("I'm inside "+ counter);
		}
		
	}

}
