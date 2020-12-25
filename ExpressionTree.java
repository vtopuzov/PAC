
public class ExpressionTree {
	
		// Node for a binary expression tree
		
			public Object element;
			public ExpressionTree leftChild;
			public ExpressionTree rightChild;
			
			public ExpressionTree (Object o) {
				this(o, null, null);
				
			}
			
			public ExpressionTree (Object o, ExpressionTree l, ExpressionTree r) {
				element=o;
				leftChild=l;
				rightChild=r;
				
			}
			
			public String toString() {
				return element.toString();
			}
			
			public static void convert(char[] postfix) {
			
				LinkedStack<ExpressionTree> ConverterStack = 
						new LinkedStack<ExpressionTree>();
				String NumberToAdd="";
			
				for(int i=1; i< postfix.length; i++) {
					char c = postfix[i];
						if (Character.isDigit(c)) {
								NumberToAdd=NumberToAdd + c ; }
						else if ((c==' ') && Character.isDigit(postfix[i-1]))
						{
							ExpressionTree Number = 
							new ExpressionTree(Integer.parseInt(NumberToAdd));
							ConverterStack.push(Number);
							NumberToAdd="";
						}
				else if   (c == '*' || c == '/' || 
		                   c == '+' || c == '^' || 
		                   c == '-') {
					
					ExpressionTree operand2= ConverterStack.pop();
					ExpressionTree operand1= ConverterStack.pop();
					ExpressionTree NewTree = new ExpressionTree (c, operand1, operand2);
					ConverterStack.push(NewTree);
					
					// create a new operator expression. Pop two
					//expressions off the top of the stack, and set them as children of this new
					//node. Then push the node onto the stack
					}
				}
				ExpressionTree result = ConverterStack.pop();
			
				System.out.println("Expression tree- prefix traversal:");
				result.prefix(result);
				System.out.println();
				System.out.println("Expression tree- postfix traversal:");
				result.postfix(result);
				System.out.println();
				System.out.println("Expression tree- infix traversal:");
				result.infix(result);
				System.out.println();
			
			}
			
			public static void prefix( ExpressionTree t ){
				if( t != null )
				{
					System.out.print( t+ " " );
					prefix( t.leftChild );
					prefix( t.rightChild );
				}
			}
			
			public static void postfix( ExpressionTree t ) {
					if( t != null )
				{
					postfix( t.leftChild );
					postfix( t.rightChild );
					System.out.print( t +" " );
				}
			}	
			public static void infix( ExpressionTree t ) {
					
				if( t != null ) {
					
				if(isLeaf(t)) {System.out.print(t);}
				
				else {
						
					System.out.print( "(" );
						infix( t.leftChild );
						System.out.print( t );
						infix( t.rightChild);
						System.out.print( ")" );
					}
				}
						
				}
			
			public static boolean isLeaf(ExpressionTree t) {
			if((t.leftChild==null)&&(t.rightChild==null)){
						return true;
					}
			else {return false;}
			}
		
	}


