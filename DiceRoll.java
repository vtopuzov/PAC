
public class DiceRoll {

	public static void main(String[] args) {
		int result1= ((int)(Math.random()*6)) +1;
		int result2=((int)(Math.random()*6)) +1;
	if(result1+result2< 6) {
		System.out.println("Failure");
	}
	
	else if(result1+result2<= 9) {
		System.out.println("Partial success");
	}
	else {System.out.println("Success");}
	
	
	
	System.out.println("the dice is now" +result1+ result2);
	
	char c ='a';
	char b= (char) (c+13);
	System.out.println(b);
	String s= "abcdefghijklmnopqrstuvwxyz";
	char[] chars= s.toCharArray();
	System.out.println(Rot13(chars));
	
 
}
	
	public static char[] Rot13 (char[] chararray) {
		char[] newchararray = new char[chararray.length];
		
		for(int i=0; i<chararray.length; i++) {
			if(chararray[i]==' ') {newchararray[i]= ' ';}
		
				
				else if(chararray[i]>=110) {newchararray[i]=(char)(chararray[i]-13);}
				
				else {newchararray[i]= (char) ((chararray[i]+13));}
		}
		return newchararray;
	}
	
}