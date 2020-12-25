import java.util.Scanner;

public class ExpressionTreeHW {
	

		public static void main (String[] args) {
			boolean Exit=false;
			while(!Exit) 
				{
				
				Scanner input = new Scanner (System.in);
				System.out.println("Please input expression: \n"
					+ "Enter Q to quit program");
				String Expression = input.next();
				if(Expression.equals("Q")) {System.exit(0);}
			
				convert converter = new convert(Expression);
				System.out.println("The input in postfix is: ");
				System.out.println(converter.toPostFix());
				
				char[] postfix = converter.toPostFix().toCharArray();
				
				ExpressionTree.convert(postfix);

				}
		
		}
	}
