
public class Raisetopower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char k= 'a';
char [] randomchars= new char[45];
print20chars(k, randomchars);
countletters(randomchars);

	}
 public static char[] print20chars (char k, char[] List) {
	 for(int i=0; i<45; i++) {
		 int n= (int)((int)k + (Math.random()*((int)'z'- (int)k + 1)));
		 List[i] = Character.toUpperCase((char) n);
		 if(i%5==0) System.out.println();
		 System.out.print(List[i]);
		
	 }
	 return List;
}
 
 public static int countletters (char[] List) { 
 int counter=0;
	 for(int i=0; i<List.length; i++) {
		 for(int j=0; j<List.length; j++) {
			 if(List[i]!=List[j]) {
			 List[i]='*';
		 }
		 }
		 if(i%5==0) System.out.println();
		 System.out.print(List[i]);
		 counter++;
 }
	 
	return counter;

 }
 }
