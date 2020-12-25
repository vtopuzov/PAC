import java.util.Scanner;

public class fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter grade: ");
		int grade = input.nextInt();
		int counter = 0;
		double total = grade + grade;
		while (grade!= -1) {
		;
			counter++;
		}
		double average = total / counter;
		System.out.println(average);
				

	}

}
