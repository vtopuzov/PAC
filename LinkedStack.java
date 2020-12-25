


	public class LinkedStack<E> implements Stack<E> {

	  /** The primary storage for elements of the stack */
	  private SinglyLinkedList<E> list = new SinglyLinkedList<>();   

	 
	  public LinkedStack() { }                  

	  
	  public int size() { return list.size(); }

	
	  public boolean isEmpty() { return list.isEmpty(); }

	  /**
	   * Inserts an element at the top of the stack.
	   * @param element   the element to be inserted
	   */
	  public void push(E element) { list.addFirst(element); }

	  /**
	   * Returns, but does not remove, the element at the top of the stack.
	   * @return top element in the stack (or null if empty)
	   */
	 
	  public E top() { return list.first(); }

	  /**
	   * Removes and returns the top element from the stack.
	   * @return element removed (or null if empty)
	   */
	  
	  public E pop() { return list.removeFirst(); }

	  /** Produces a string representation of the contents of the stack.
	   *  (ordered from top to bottom)
	   *
	   * This exists for debugging purposes only.
	   *
	   * @return textual representation of the stack
	   */
	  public String toString() {
	    return list.toString();
	  }
	}


