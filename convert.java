import java.util.ArrayList;
import java.util.List;

	public class convert {

		private String inputString;
		
		
		public convert (String infix) {
			this.inputString= infix;	
			}
		
		
		public String toPostFix() {
			
			//generate char array from infix string
			char[] infix = new char[this.inputString.length()];
			for (int i = 0; i < inputString.length(); i++) { 
		      infix[i] = inputString.charAt(i); 
		    }

			//use the parse method to generate a string list from infix 
			List <String> ParsedList=parse(infix);

			String PostFix="";
			//use a linked stack
			LinkedStack<String> Fixit = new LinkedStack<String>();
			
			for ( int i=0; i<ParsedList.size(); i++ ) {
				//check if we encounter an operator
				if (   ParsedList.get(i).equals("-")||ParsedList.get(i).equals("+")
					|| ParsedList.get(i).equals("*")|| ParsedList.get(i).equals("/")
					|| ParsedList.get(i).equals("^") ) 
					{
					//if stack is empty, push the operator onto the stack		
					if ( Fixit.isEmpty() ) { 
						Fixit.push(ParsedList.get(i));
					} else {
						//if stack is not empty, check for precedence
						//pop operators from the stack until we get to lower precedence,
						//or until stack is empty
						int number = getPrecedence(ParsedList.get(i));
						int stacknumber = getPrecedence( Fixit.top());   
						while ( (number<stacknumber)  && (!Fixit.isEmpty()) ) {
							PostFix=PostFix + " "+ Fixit.pop();
						}
						Fixit.push(ParsedList.get(i));
					}
				} else if (ParsedList.get(i).equals("(")) {
					//push open brackets onto the stack
					Fixit.push(ParsedList.get(i));
				} else if (ParsedList.get(i).equals(")")) {
					// when we find the closed bracket,	pop operators onto the string and
					//pop the matching bracket off the stack
					while ( !Fixit.top().equals("("))  {
						PostFix=PostFix + " "+ Fixit.pop();
					}
					Fixit.pop();
				} else {
					// When we encounter a number, add it to the postfix string
					PostFix=PostFix+" "+ ParsedList.get(i);
				}
			}
			//Pop all remaining operands off the stack
			while ( !Fixit.isEmpty() )
				
				{PostFix=PostFix + " "+ Fixit.pop();}
			
			return PostFix;
		}
			
		
		public static int getPrecedence (String operator) {
			int precedence=0;
			if 		(operator.equals("+") || operator.equals("-") )  { precedence=1; }
			else if ( operator.equals("*") || operator.equals("/") ) { precedence=2; }
			else if ( operator.equals("^") ) 						 { precedence=3; }	

			return precedence;	
			}
				
		
		 public static List <String> parse(char[] input) {
			    List<String> parsed = new ArrayList<String>();
			    for (int i = 0; i < input.length; ++i) {
			        char c = input[i];
			        if (Character.isDigit(c)) {
			            String number = input[i] + "";
			            for (int j = i + 1; j < input.length; ++j) {
			                if (Character.isDigit(input[j])) {
			                    number += input[j];
			                    i = j;
			                } else {
			                    break;
			                }
			            }
			            parsed.add(number);
			        } else if (c == '*' || c == '/' || 
			                   c == '+' || c == '^' || 
			                   c == '-' || c == '(' || c == ')') {
			            parsed.add(c + "");
			        }
			    }
			    return parsed;
			}
		
	}

