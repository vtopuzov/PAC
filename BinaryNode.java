






public class BinaryNode
{
//Constructors
BinaryNode( Comparable theElement )
{
this( theElement, null, null );
}
BinaryNode( Comparable theElement, BinaryNode lt, BinaryNode rt )
{
element = theElement;
left = lt;
right = rt;
}
Comparable element; // The data in the node
BinaryNode left; // Left child
BinaryNode right; // Right child
}

public class BinarySearchTree
{
/**
* Construct the tree.
*/
public BinarySearchTree( )
{
root = null;
}
/**
* Insert into the tree; duplicates are ignored.
* @param x the item to insert.
*/
public void insert( Comparable x )
{
root = insert( x, root );
}
/**
* Remove from the tree. Nothing is done if x is not found.
* @param x the item to remove.
*/
public void remove( Comparable x )
{
root = remove( x, root );
}
/**
* Find the smallest item in the tree.
* @return smallest item or null if empty.
*/
public Comparable findMin( )
{
return elementAt( findMin( root ) );
}
/**
* Find the largest item in the tree.
* @return the largest item of null if empty.
*/
public Comparable findMax( )
{
return elementAt( findMax( root ) );
}

/**
* Find an item in the tree.
* @param x the item to search for.
* @return the matching item or null if not found.
*/
public Comparable find( Comparable x )
{
return elementAt( find( x, root ) );
}
/**
* Make the tree logically empty.
*/
public void makeEmpty( )
{
root = null;
}
/**
* Test if the tree is logically empty.
* @return true if empty, false otherwise.
*/
public boolean isEmpty( )
{
return root == null;
}
/**
* Internal method to get element field.
* @param t the node.
* @return the element field or null if t is null.
*/
private Comparable elementAt( BinaryNode t )
{
return t == null ? null : t.element;
}
/**
* Internal method to insert into a subtree.
* @param x the item to insert.
* @param t the node that roots the tree.
* @return the new root.
*/
private BinaryNode insert( Comparable x, BinaryNode t )
{
/* 1*/ if( t == null )
/* 2*/ t = new BinaryNode( x, null, null );
/* 3*/ else if( x.compareTo( t.element ) < 0 )
/* 4*/ t.left = insert( x, t.left );
/* 5*/ else if( x.compareTo( t.element ) > 0 )
/* 6*/ t.right = insert( x, t.right );
/* 7*/ else
/* 8*/ ; // Duplicate; do nothing
/* 9*/ return t;
}
/**
* Internal method to remove from a subtree.
* @param x the item to remove.
* @param t the node that roots the tree.
* @return the new root.
*/
private BinaryNode remove( Comparable x, BinaryNode t )
{
if( t == null )
return t; // Item not found; do nothing
if( x.compareTo( t.element ) < 0 )
t.left = remove( x, t.left );
else if( x.compareTo( t.element ) > 0 )
t.right = remove( x, t.right );
else if( t.left != null && t.right != null ) // Two children
{
t.element = findMin( t.right ).element;
t.right = remove( t.element, t.right );
}
else
t = ( t.left != null ) ? t.left : t.right;
return t;
}


public boolean equals (Object o) {
	if (!(o instanceof BinarysearchTree))
		{return false;}

BinarysearchTree test= (BinarysearchTree) o;	
	buildqueues(this.root, test.root);   
	
	return comparequeues(OriginalTreeMembers, OtherTreemembers);
}		


private void buildqueues (BinaryNode original, BinaryNode test) {
	LinkedQueue<Comparable> OriginalTreeMembers = new LinkedQueue<Comparable>();
	LinkedQueue<Comparable> OtherTreeMembers = new LinkedQueue<Comparable>();
	
	
	
	if(original.element!=null) {
	buildqueue (original.left);
	OriginalTreeMembers.enqueue(original.element)
	buildqueue (original.right);
	}
	
	if(test.element!=null) {
		buildqueue (test.left);
		OtherTreeMembers.enqueue(test.element)
		buildqueue (test.right);
		
	}
	
	
}

private boolean comparequeues (Queue original, Queue test) {
	while(!isEmpty(original)) {
		Comparable x= original.dequeue();
		Comparable y= test.dequeue();
		if(x.compareTo(y)!=0) { return false;}
	
	}

	if(isEmpty(test)) {return true;}
	else {return false;}
}

/**
* Internal method to find the smallest item in a subtree.
* @param t the node that roots the tree.
* @return node containing the smallest item.
*/
private BinaryNode findMin( BinaryNode t )
{
if( t == null )
return null;
else if( t.left == null )
return t;
return findMin( t.left );
}
/**
* Internal method to find the largest item in a subtree.
* @param t the node that roots the tree.
* @return node containing the largest item.
*/
private BinaryNode findMax( BinaryNode t )
{
if( t != null )
while( t.right != null )
t = t.right;
return t;
}
/**
* Internal method to find an item in a subtree.
* @param x is item to search for.
* @param t the node that roots the tree.
* @return node containing the matched item.
*/
private BinaryNode find( Comparable x, BinaryNode t )
{
if( t == null )
return null;
if( x.compareTo( t.element ) < 0 )
return find( x, t.left );
else if( x.compareTo( t.element ) > 0 )
return find( x, t.right );
else
return t; // Match
}
 /** The tree root. */
private BinaryNode root;
}


