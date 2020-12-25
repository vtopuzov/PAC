import java.util.Scanner;

public class CarArrays {

	public static void main(String[] args) {

		//First create 10 cars using arrays of length 10
		//Assign color and position randomly and set all ignitions to off
				char [] Colors= new char [10];
				for(int i=0; i<Colors.length; i++) {
					Colors[i]=assignColor();
					}
				int [] XCoordinates= new int [10];
				for(int i=0; i<XCoordinates.length; i++) {
					XCoordinates[i]=randomizePosition();
					}
				int [] YCoordinates= new int [10];
				for(int i=0; i<YCoordinates.length; i++) {
					YCoordinates[i]=randomizePosition();
					}
				boolean [] Ignitions= new boolean [10];
				for(int i=0; i<Ignitions.length; i++) {
					Ignitions[i]= false;
					}
				boolean  Exit = false; // Controls the flow of the program and allows the user to quit
				
				
				Scanner input = new Scanner (System.in);
				
				while(!Exit) {
					
					System.out.println("Which car would you like to use?\n"
							+ "Use a number from 1 to 10");
					System.out.print("Input: ");
					int CarInput = input.nextInt();
					int CarNumber= CarInput-1;
					//Get the Car Number and convert to the index in the arrays
					
					System.out.println("What would you like to do?\n" + 
						" 1: turn the ignition on/off\n" + 
						" 2: change the position of the car\n" + 
						" Q: quit this program ");
					System.out.print("Input: ");
					String Operator = input.next();
				   
					// Run the menu options based on user input
					// Call the relevant method to switch the ignition, 
					// move in either direction, and print out the car parameters and grid 
					
					if (Operator.equals("1")){
						Ignitions[CarNumber] = ignitionSwitch(Ignitions[CarNumber]);
						reportState(XCoordinates[CarNumber],YCoordinates[CarNumber],
								Colors[CarNumber],Ignitions[CarNumber], CarInput);
						}
					else if (Operator.equals("2")) {
						if(Ignitions[CarNumber]) {
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
							case "H": XCoordinates[CarNumber]= 
									moveHorizontally(XCoordinates[CarNumber], Distance);
							break;
					
							case "V": YCoordinates[CarNumber]= 
									moveVertically(YCoordinates[CarNumber], Distance);
							break;
							}
							reportState(XCoordinates[CarNumber],YCoordinates[CarNumber],
									Colors[CarNumber],Ignitions[CarNumber], CarInput);
							}
						}
						else {
							System.out.println("The Ignition is Off. Turn the ignition On first."); 
							//check for errors
							reportState(XCoordinates[CarNumber],YCoordinates[CarNumber],
							Colors[CarNumber],Ignitions[CarNumber], CarInput);		
						}
					}
					else if (Operator.equals("Q")) {
						System.out.println("Exiting Program");
						reportState(XCoordinates[CarNumber],YCoordinates[CarNumber],
								Colors[CarNumber],Ignitions[CarNumber], CarInput);	
						Exit=true; //exit the menu after printing the car characteristics
						}
					else { 
						System.out.println("Invalid input. Try again\n"); //check for errors
					reportState(XCoordinates[CarNumber],YCoordinates[CarNumber],
					Colors[CarNumber],Ignitions[CarNumber], CarInput);			
					}
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
			
			//Reports the current car parameters in English, including the car number
			//and prints the position on the grid
			public static void reportState(int XC, int YC, char COL, boolean IGN, int CI) {
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
				System.out.println("Car Number: "+ CI);
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


