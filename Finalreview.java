
public class Finalreview {
 public static void main (String [] args) {
	 
	 System.out.println(Fibonnacci(10));
	 DoublyLinkedList<Integer> Circular= new DoublyLinkedList<Integer>();
	 Circular.addFirst(5);
	 Circular.addFirst(7);
	 Circular.addFirst(9);
	 System.out.println(Circular.size());
	 
	 DoublyLinkedList<Integer> temp= new DoublyLinkedList<Integer>();
	 temp=Circular;
	// System.out.println(temp.removeLast());
	 
	 
	 int counter=0;
	 while(temp.last()!=null) {
		 System.out.println(temp.last());
		 temp.removeLast();
		 counter++;
	 }
	 System.out.println("the size is " + counter);

	 
 }
	 public static int Fibonnacci (int n) {
		 //base case
		 
		 if (n==0 || n==1) {
			 return n;
		 }
		 //last steo means tail recursion
		 
		 return Fibonnacci ( n-1) + Fibonnacci (n-2);
		 
	 }
	 
	 public static int Factorial (int n)
	 {
		 if (n==1) {
			 return 1;
			 
		 }
	 return n*Factorial(n-1);
	 
	 }
	 
	
	 
	 
 }

