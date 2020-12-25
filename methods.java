
public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	printHello();
	System.out.println("I'm in main");
	printHello();
	printHelloxtimes(5);
	int general=5;
	int sum= Add2Numbers(general);
	System.out.println(general+" "+sum);
	System.out.println(GlobalSum);
	addtoglobalsum(35);
	System.out.println(GlobalSum);
	
	
	}

	public static int GlobalSum = 0;
	
	
	public static void printHello() {
		System.out.println("Hello");
		
	}
	
	public static void printHelloxtimes(int x) {
	for(int i=0; i<x; i++) {
	System.out.println("Hello");
	}
	}

	public static int Add2Numbers(int x) {
		x = x + x;
		return x;
		
	}

	public static void addtoglobalsum(int x) {
		GlobalSum += x;
	}
}
