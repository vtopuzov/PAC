
public class BinarysearchTree {
	
	 
		public BinarysearchTree( )
		{
			root = null;
		}

		
		public void insert( Comparable x )
		{
			root = insert( x, root );
		}

		public void insertBad( Comparable x )
		{
			root = insertBad( x, root );
		}

	
		public void remove( Comparable x )
		{
			root = remove( x, root );
		}

	 
		public Comparable findMin( )
		{
			return elementAt( findMin( root ) );
		}

		
	
		public Comparable findMax( )
		{
			return elementAt( findMax( root ) );
		}

		
		public Comparable find( Comparable x )
		{
			return elementAt( find( x, root ) );
		}

	
		public void makeEmpty( )
		{
			root = null;
		}

		
		public boolean isEmpty( )
		{
			return root == null;
		}

	 
		
		public void printTree( )
		{
			if( isEmpty( ) )
				System.out.println( "Empty tree" );
			else
				printTree( root );
		}

		private Comparable elementAt( BinaryNode t )
		{
			return t == null ? null : t.element;
		}

	
		private BinaryNode insert( Comparable x, BinaryNode t ) {
			if (t==null) {t= new BinaryNode(x, null, null);}
			
			else if(x.compareTo(t)<0) {
				
				t.left= insert(x, t.left);}
			else if(x.compareTo(t)>0) {
				t.right= insert(x, t.right);}
			
				
			
			
			return t;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		{
//	/* 1*/	  if( t == null )
//	/* 2*/		  t = new BinaryNode( x, null, null );
//	/* 3*/	  else if( x.compareTo( t.element ) < 0 )
//	/* 4*/		  t.left = insert( x, t.left );
//	/* 5*/	  else if( x.compareTo( t.element ) > 0 )
//	/* 6*/		  t.right = insert( x, t.right );
//	/* 7*/	  else
//	/* 8*/		  ;  // Duplicate; do nothing
//	/* 9*/	  return t;
//		}

	 	private BinaryNode insertBad ( Comparable x, BinaryNode t )
		{
		  if( t == null )
			  t = new BinaryNode( x, null, null );
		  else
			  t.left = insert( x, t.left );
		  return t;
		}

	 	private BinaryNode remove( Comparable x, BinaryNode t ) {
	 		if (t==null) {return t;}
	 		
	 		else if(x.compareTo(t)<0) {
	 			t.left=remove(x, t.left);}
	 		
	 		else if(x.compareTo(t)>0) {
	 			t.right=remove(x, t.right);}
	 		else if(t.left!=null && t.right!=null) {
	 			t.element=findMin(t.right).element;
	 			t.right=remove(t.element, t.right);
	 		}
	 		
	 	
	 	else  t= (t.left!= null ) ? t.left : t.right;
	 	return t;
	 		
	 	}

	 	public boolean checktree() {
	 		if (root==null)
			{return false;}
		
	 		return checktree(root.left, root.element, null) && checktree(root.right, null, root.element)  ;	
	 	}
		private boolean checktree ( BinaryNode t, Comparable max, Comparable min) {
	 	
	 	if (t==null) {return true;}
		
	 	boolean current;
	 	if(max==null) {
	 		current = t.element.compareTo(min)>0;
	 	}
	 	if(min==null) {
	 		current = t.element.compareTo(max)<0;
	 	}
		
		else {current = t.element.compareTo(max)<0 && t.element.compareTo(min)>0 ;}
	 	
		return current && checktree(t.left, t.element, min) && checktree(t.right, max, t.element);
		}
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
//	 	
//		private BinaryNode remove( Comparable x, BinaryNode t )
//		{
//			if( t == null )
//				return t;   // Item not found; do nothing
//			if( x.compareTo( t.element ) < 0 )
//				t.left = remove( x, t.left );
//			else if( x.compareTo( t.element ) > 0 )
//				t.right = remove( x, t.right );
//			else if( t.left != null && t.right != null ) // Two children
//			{
//				t.element = findMin( t.right ).element;
//				t.right = remove( t.element, t.right );
//			}
//			else
//				t = ( t.left != null ) ? t.left : t.right;
//			return t;
//		}

		
		private BinaryNode findMin( BinaryNode t )
		{
			if( t == null )
				return null;
			else if( t.left == null )
				return t;
			return findMin( t.left );
		}

	
		private BinaryNode findMax( BinaryNode t )
		{
			if( t != null )
				while( t.right != null )
					t = t.right;

			return t;
		}
	 

		
		private BinaryNode find( Comparable x, BinaryNode t )
		{
			if( t == null )
				return null;
			if( x.compareTo( t.element ) < 0 )
				return find( x, t.left );
			else if( x.compareTo( t.element ) > 0 )
				return find( x, t.right );
			else
				return t;	// Match
		}

		
		private void printTree( BinaryNode t )
		{
			if( t != null )
			{
				printTree( t.left );
				System.out.println( t.element );
				printTree( t.right );
			}
		}

		  /** The tree root. */
		private BinaryNode root;
		
		public boolean equals (Object o) {
			if (!(o instanceof BinarysearchTree))
				{return false;}
		
		BinarysearchTree test= (BinarysearchTree) o;	
			return equals(this.root, test.root);   //why is it this?
		}		
		
		
		private boolean equals (BinaryNode original, BinaryNode test) {
			if(original==null && test==null) {return true;}
			else 
				if(original==null||test==null) {return false;}
				else if(!original.element.equals(test.element)) {return false;}
				else {return 
					equals(original.left, test.left) && equals (original.right, test.right);}
			
		
		}	
		
		
//
//		public boolean equals (Object o)
//		{
//			if (!(o instanceof BinarysearchTree))
//				return false;
//			
//			BinarysearchTree other = (BinarysearchTree) o;
//			
//			return equals (this.root, other.root);
//		}
//		
//		private static boolean equals (BinaryNode th, BinaryNode other)
//		{
//			if ((th == null) && (other == null))
//				return true;
//	                else if ((th == null) || (other == null))
//	                        return false;
//	 		else if (!(th.element.equals (other.element)))
//				return false;
//			else 
//				return (equals (th.left, other.left)  && 
//					   equals (th.right, other.right));
//			
//		}
//	 
//	 	public boolean testTreeProperty ()
//	 	{
//	 		if (root == null)
//	 			return true;
//	 		return (testTreeProperty (root.left, null, root.element)
//	 				&& testTreeProperty (root.right, root.element, null));
//	 	}
//
//	 	private boolean testTreeProperty (BinaryNode t, Comparable lowLimit, Comparable highLimit)
//	 	{ 			
//	 		if (t == null)
//	 			return true;
//	 		boolean current;
//	 		if (lowLimit == null) 
//	 			current = (t.element.compareTo (highLimit) < 0);
//	 		else if (highLimit == null) 
//	 			current = (t.element.compareTo (lowLimit) > 0);
//			else
//				current = (t.element.compareTo (lowLimit) > 0) &&
//						  (t.element.compareTo (highLimit) < 0);
//				
//			return	(current && 
//					testTreeProperty (t.left, lowLimit, t.element) &&
//					testTreeProperty (t.right, t.element, highLimit));
//	 	}
	 	
	 
	 	public BinarysearchTree copytree() {
	 		BinarysearchTree result = new BinarysearchTree();
	 		result.root=copytree(this.root);
	 		
	 		
	 		return result;
	 		
	 	}
	 	
	 	
	 	private BinaryNode copytree(BinaryNode t) {
	 		
	 		if(t==null) {return null;}
	 		BinaryNode left = copytree(t.left);
	 		BinaryNode right = copytree(t.right);
	 		BinaryNode newtree= new BinaryNode(t.element, t.left, t.right);
	 		return newtree;
	 		
	 	}
	 	
	 	
	 	
	 	
	 	
	 	public boolean isSimilar (BinarysearchTree o) {
	 		if (o==null)
	 			return false;
	 		return isSimilar(this.root, o.root);
	 	}
	 	
	 	private static boolean isSimilar(BinaryNode vasil, BinaryNode vasco) {
	 	    if(vasil==null&& vasco==null){return true;}
	 	    else
	 	    if(vasil.element==null) {return false;}
	 	    else
	 		if(vasco.element==null) {return false;}
	 		
	 		else return isSimilar(vasil.left, vasco.left) && isSimilar(vasil.right, vasco.right);
	 		
	 		
	 	}
	 	
	 	
	 	
	 	
	 	
//		public boolean isSimilar (BinarysearchTree o)
//		{
//			if (o == null)
//				return false;
//			return isSimilar (this.root, o.root);
//		}
//		
//		private static boolean isSimilar (BinaryNode th, BinaryNode other)
//		{
//			if ((th == null) && (other == null))
//				return true;
//			else if ((th == null) || (other == null))
//				return false;
//			else 
//				return (isSimilar (th.left, other.left)  && 
//					   isSimilar (th.right, other.right));
//			
//		}	

			// Test program
		public static void main( String [ ] args )
		{
			BinarysearchTree t1 = new BinarysearchTree( );
			BinarysearchTree t2;
			
			for( int i = 1; i <= 100; i++ )
			{
				int element = (int) (Math.random () * 1000);
				t1.insert (new Integer ( element) );
			}
			t2 = t1.copytree();
			System.out.println("before bad insertion");		
			System.out.println(t1.equals(t2));
			System.out.println(t1.isSimilar(t2));
			//System.out.println(t1.testTreeProperty());

			System.out.println("------------------------------------------------");
			System.out.println("after bad insertion");		
			t1.insertBad(new Integer(10000));
			System.out.println(t1.equals(t2));
			System.out.println(t1.isSimilar(t2));
			//System.out.println(t1.testTreeProperty());		
		}
	}

	class BinaryNode
	{
			// Constructors
		BinaryNode( Comparable theElement )
		{
			this( theElement, null, null );
		}

		BinaryNode( Comparable theElement, BinaryNode lt, BinaryNode rt )
		{
			element  = theElement;
			left	 = lt;
			right	= rt;
		}

			// Friendly data; accessible by other package routines
		Comparable element;	  // The data in the node
		BinaryNode left;		 // Left child
		BinaryNode right;		// Right child
	}


