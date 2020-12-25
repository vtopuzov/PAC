import java.util.Scanner;

public class MilTime {

	public static void main(String[] args) {
		
		
		System.out.print("Enter first time: ");
		Scanner input = new Scanner (System.in);
		int FirstTime = input.nextInt();
		
		int MINSEC = 60; // Number of seconds in a minute
		int HRSEC = 3600; // Number of seconds in an hour
		
		// Convert First Military Time input into seconds
		int Hours = FirstTime / 10000;
		int Minutes = (FirstTime % 10000)/100;
		int Seconds = FirstTime % 100;
		int HourSeconds = Hours * HRSEC;
		int MinutesSeconds = Minutes * MINSEC;
		int SecondsTime = HourSeconds + MinutesSeconds + Seconds;
		
				
		System.out.print("Enter second time time: ");
		int SecondTime = input.nextInt();
		
		// Convert Second Military Time input into seconds
		int Hours2 = SecondTime / 10000;
		int Minutes2 = (SecondTime % 10000)/100;
		int Seconds2 = SecondTime % 100;
		int HourSeconds2 = Hours2 * HRSEC;
		int MinutesSeconds2 = Minutes2 * MINSEC;
		int SecondsTime2 = HourSeconds2 + MinutesSeconds2 + Seconds2;
		int Difference = SecondsTime - SecondsTime2;
		
		//Convert the difference in seconds into hours, minutes and seconds
		int Hours3 = Difference / HRSEC;
		int Minutes3 = Difference / MINSEC - Hours3*MINSEC;
		int Seconds3 = Difference % MINSEC;
		
		//Break down into digits to display the time difference in military time 
		int Digit1 = Hours3/10;
		int Digit2 = Hours3%10;
		int Digit3 = Minutes3/10;
		int Digit4 = Minutes3%10;
		int Digit5 = Seconds3/10;
		int Digit6 = Seconds3%10;
		int TimeDifference = Digit1*100000 + Digit2*10000 + Digit3*1000 + 
				Digit4*100 + Digit5*10 + Digit6;
		
		
		System.out.println("Time difference: "+ TimeDifference);

	}

}
