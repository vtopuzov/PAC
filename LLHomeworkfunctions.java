
public class LLHomeworkfunctions {


	public static void main(String [] args) {
	        // TODO: Part of this assignment is to implement this correctly.
		
		ListNode<Integer> node1 = new ListNode<Integer>(1, null);
		ListNode<Integer> node2 = new ListNode<Integer>(2, node1);
		ListNode<Integer> node3 = new ListNode<Integer>(2, node2);
		ListNode<Integer> node4 = new ListNode<Integer>(4, node3);
		
		ListNode<Integer> node5 = new ListNode<Integer>(1, null);
		ListNode<Integer> node6 = new ListNode<Integer>(2, null);
		ListNode<Integer> node7 = new ListNode<Integer>(2, null);
		ListNode<Integer> node8 = new ListNode<Integer>(3, null);
//
		int i=9;
		node3= node3.setValue(9);
		printlist(node3);
		
	
		LinkedQueue<Integer> q= new LinkedQueue<Integer>();
		q.enqueue(10);
		q.enqueue(7);
		q.enqueue(3);
		q.dequeue();
		q.enqueue(3);
		q.enqueue(17);
		q.dequeue();
		System.out.println(q.toString());
		
		LinkedStack<Integer> fixer= new LinkedStack<Integer>();
		
		fixer.push(5);
		fixer.push(7);
		fixer.push(3);
		fixer.push(17);
		System.out.println(fixer.toString());
		System.out.println(Maxistack(fixer));
		
		
		
	
	
	
	
	
	
	}
	
	public static int Maxistack(LinkedStack<Integer> stack) {
		
			int max=0;
			while(stack.top()!=null) {
				int newmax= stack.pop();
				System.out.println(newmax);
				if(newmax>max) {
				max=newmax;}
			}
			return max;	
		}
		
//		node1.next=node2;
//		node2.next=node3;
//		node3.next=node4;
//		
//		node5.next=node6;
//		node6.next=node7;
//		node7.next=node8;
		
		//System.out.println(equalLists(node1, node5));
		//System.out.println(node1==node5);
//		System.out.println(terminatessolution(node4));
//		System.out.println(size(node4));	
//		printlist(node1);
//		ListNode<Integer> reversed= reverse(node1);
//		printlist(reversed);
//	
//		System.out.println("After removing duplicates");
//		printlist(node3);
		 
		
		
		public static int size(ListNode<Integer> list) {
			ListNode<Integer> testlist =list; 
			if(list==null) {return 0;}
			else {
			int size=1;
			while(testlist.next!=null) {
				testlist=testlist.next;
				  size++;
			}
			
			return size;}  
			
			
		}
		
		public static ListNode<Integer> remove (ListNode<Integer> list, int key) {
			ListNode<Integer> testlist =list; 
		
			
			return testlist;
		}
		
		public static ListNode<Integer> reverse(ListNode<Integer> list){
			ListNode<Integer> reversedlist =null; //list to fill
			ListNode<Integer> iterator =list; //points to head
			ListNode<Integer> NextToProcess = null; // find next node to add to head of list
			
			while(iterator!=null) {
				NextToProcess= iterator.next;
				iterator.next=reversedlist;
				reversedlist=iterator;
				iterator=NextToProcess;
			}
		iterator=reversedlist;	
		return iterator;
			
		}
		
		public static void printlist(ListNode<Integer> list){
			
			ListNode<Integer> iterator =list; //points to head
			while(iterator!=null) {
				System.out.println(iterator.value);
				iterator=iterator.next;
			}
			
		
			
		}
		
		
		public static int countadjacentpairs (ListNode<Integer> list) {
		
			int pairs=0;
			ListNode<Integer> walk;
			if(list.next!=null) {
				if(walk.element==list.element) {
					pairs++;
				}
				else {;}
				walk=walk.next;
			}
			return pairs;
			
		}
			
			
			
		
		
			
		        
			
		
		
		/**
		 * @param <T>
		 * @param list1
		 * @param list2
		 * @return true if the lists are equal.  Assume both lists terminate.
		 */
	    public static <T> boolean equalLists(ListNode<T> list1, ListNode<T> list2) {
			ListNode<T> testlist =list1;
			ListNode<T> testlist2=list2;
			//System.out.println("The values at the beginning are" + testlist.value + "and " +testlist2.value);
			if(testlist.value==null&& testlist2.value==null) {return true;}
			
			else while(testlist.next!=null&& testlist2.next!=null) {
			//System.out.println("check if both are null");
				if(testlist.value!=testlist2.value) {return false;}
				else {testlist=testlist.next;
				testlist2=testlist2.next;
				//System.out.println("The values are"+ testlist.value + " and "+ testlist2.value);
				}
				}
			//System.out.println("The values at the end are" + testlist.value + " and " + testlist2.value);
			//System.out.println("The pointers at the end are" + testlist.next +" and " + testlist2.next);
			if(testlist.value==testlist2.value && testlist.next==testlist2.next) {return true;}
			else {return false;}
			
	    	
			
		}
		
		/**
		 * @param <T>
		 * @param list
		 * @return true if the list eventually terminates, and false if the list points back at one of it's
		 *  previous nodes.
		 */
	
		
			
			
		
		public static <T> boolean terminatessolution(ListNode<T> listItem) {

			ListNode<T> listIterator = listItem;
			
			// keep list of listnodes as history
			ListNode<ListNode<T>> visitedNodes = null;
			
			// iterate through list. if listIterator becomes null, the list terminates
			while( listIterator != null )
			{
				ListNode<ListNode<T>> visitedNodesIterator = visitedNodes;
				
				// at each step of list iteration, iterate through history
				while( visitedNodesIterator != null )
				{
					// if history contains current listnode, the list has a cyclical reference and won't terminate
					if( visitedNodesIterator.value == listIterator )
					{
						return false;
					}
					
					visitedNodesIterator = visitedNodesIterator.next;
				}
						
				// add current listnode to beginning of history
				visitedNodes = new ListNode<ListNode<T>>( listIterator, visitedNodes );
				listIterator = listIterator.next;
			}
			
	        return true;
		}
	}