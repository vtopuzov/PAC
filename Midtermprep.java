import java.util.Scanner;

public class Midtermprep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] passwords = new String [2];
		System.out.println("A valid password must\n"
				+ "be at least 8 charachters long\n"
				+ "and have at least one capital letter\n"
				+ "and must consist entirely of letters and numbers\n");
		System.out.println("Please enter a password");
		passwords [0] = input.next();
		
		while (!isValidPassword(passwords [0])) {
		System.out.println("Not a valid password");	
		System.out.println("Please enter a password");
		passwords [0] = input.next();
		
		}
		{ 
			
		do
		{System.out.println("Please enter password again");
		passwords[1]= input.next();
		}
		while (!isValidPassword(passwords[1]));
		if(!isPasswordSame(passwords)) {
			System.out.println("Passwords do not match");
			}
			
		else {
			System.out.println("Success! Your password has been changed.");
		}
		}
	}
	
public static boolean isValidPassword (String password) {
	if (password.length() <8) {
		return false;
	}
	
	int Capitals=0;
	for (int i = 0; i< password.length(); i++){
		char c = password.charAt(i);
		if (Character.isUpperCase(c)) {
			Capitals++;
		}
	
		if (!Character.isLetter(c)& !Character.isDigit(c)) {
			return false;
		}
	}
		if(Capitals<1) {
			return false;
		}
	
	return true;

	
}

public static boolean isPasswordSame (String [] passwords) {
	int Same = 0;
	if (passwords[0].length() == passwords[1].length()) {
			for(int i = 0; i<passwords[1].length(); i++) {
			if ((passwords[1].charAt(i)==passwords[0].charAt(i))) {
			Same++;
			System.out.println(Same);
			}
			}		
		if (Same<passwords[1].length()) {
			return false;	
		}
		else return true;
		}
		else return false;
}
}

	
