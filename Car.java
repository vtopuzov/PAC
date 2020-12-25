import java.util.Scanner;


public class Car {

	public static void main(String[] args) {
		
		//The main method builds the initial configuration and runs the program
		//allowing the user access to the menu of options
		
		//1st Build the car using randomized methods before asking for user input
		char Color= assignColor();
		int XCoordinate= randomizePosition ();
		int YCoordinate= randomizePosition ();
		boolean Ignition= false;
		boolean Exit = false; // Controls the flow of the program and allows the user to quit
		Scanner input = new Scanner (System.in);
		
		while(!Exit) {
			
		
			System.out.println("What would you like to do?\n" + 
				" 1: turn the ignition on/off\n" + 
				" 2: change the position of car\n" + 
				" Q: quit this program ");
			System.out.print("Input: ");
			String Operator = input.next();
		   
			// Run the menu options based on user input
			// Call the relevant method to switch the ignition, 
			// move in either direction, and print out the car parameters and grid 
			
			if (Operator.equals("1")){
				Ignition = ignitionSwitch(Ignition);
				reportState(XCoordinate,YCoordinate,Color,Ignition);	
				}
			else if (Operator.equals("2")) {
				if(Ignition) {
				System.out.println("In which direction do you want to move the car?\n"+
								" H: Horizontal\n"+
								" V: Vertical");
				String Direction = input.next();
				if(!Direction.equals("H") && !Direction.equals("V")) {
					System.out.println("Invalid input. Try again\n");
					}
				else {
					System.out.println("What distance?");
					int Distance = input.nextInt();
					switch(Direction) {
					case "H": XCoordinate= moveHorizontally(XCoordinate, Distance);
					break;
			
					case "V": YCoordinate= moveVertically(YCoordinate, Distance);
					break;
					}
					
				}
				}
				else {
					System.out.println("The Ignition is Off. Turn the ignition On first."); 
					//check for errors
				}
				reportState(XCoordinate,YCoordinate,Color,Ignition);
				}
			else if (Operator.equals("Q")) {
				System.out.println("ExitProgram");
				reportState(XCoordinate,YCoordinate,Color,Ignition);
				Exit=true; //exit the menu
				}
			else System.out.println("Invalid input. Try again\n"); //check for errors
		
		}
	}

	//Assign a random starting position on the grid
	//Used to get X and Y coordinate between 1 and 20 independently
	public static int randomizePosition () {
	return (int) (Math.random()*20) + 1;
	}
	
	//Switches the ignition variable
	public static boolean ignitionSwitch (boolean Switch) {
	if (Switch) {

		return false;
	}
	return true;	
	}
	
	//Assigns a random color to the car
	public static char assignColor () {
		int colorchoice = (int) (Math.random()*5);
		char Color = 'u';
		switch(colorchoice) {
		case 0: Color='W';
		break;
		case 1: Color='R';
		break;
		case 2: Color='G';
		break;
		case 3: Color='B';
		break;
		case 4: Color='S';
		}
		return Color;
		}
		
	//Moves the car horizontally with bounds 1 to 20
	public static int moveHorizontally(int x, int y) {
		int NewCoordinate = x + y;
		if ((NewCoordinate<=20)&(NewCoordinate>0)) {
			return NewCoordinate;
		}
		else System.out.println("Cannot change position. Out of bounds");
			return x;
		}
	//Moves the car vertically with bounds 1 to 20
	public static int moveVertically(int x, int y) {
		int NewCoordinate = x + y;
		if ((NewCoordinate<=20)&(NewCoordinate>0)) {
			return NewCoordinate;
		}
		else System.out.println("Cannot change position. Out of bounds");
			return x;
	}
	
	//Reports the current car parameters in English
	//and prints the position on the grid
	public static void reportState(int XC, int YC, char COL, boolean IGN) {
		System.out.println("Car Information");
		String ColorInfo="";
		switch(COL) {
		case 'W': ColorInfo="White";
		break;
		case 'R': ColorInfo="Red";
		break;
		case 'B': ColorInfo="Blue";
		break;
		case 'G': ColorInfo="Green";
		break;
		case 'S': ColorInfo="Slate";
		}
		String IgnitionIndicator;
		if(IGN) {
			IgnitionIndicator="On";
		}
		else IgnitionIndicator="Off";
		System.out.println("Color: "+ ColorInfo);
		System.out.println("Ignition "+ IgnitionIndicator);
		
		System.out.println("Location: "+ XC + " , "+ YC);
		
		
		for( int y = 0; y<20; y++) {
			for (int x = 0; x<20; x++) {
				if(YC==y+1) { 
					if (XC==x+1) {
						System.out.print(COL);	
				}
					else System.out.print("-");
				}
				else System.out.print("-");
			}
			System.out.println();
	}
	}

}


