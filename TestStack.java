
public class TestStack {

	public static void main(String[] args) {
		SlowMaxStack<ListNode<Integer>> slowmax= new SlowMaxStack<ListNode<Integer>>(null);
		
		ListNode<Integer> node1 = new ListNode<Integer>(1, null);
		ListNode<Integer> node2 = new ListNode<Integer>(2, node1);
		ListNode<Integer> node3 = new ListNode<Integer>(3, null);
		ListNode<Integer> node4 = new ListNode<Integer>(4, null);

		slowmax.push(node2);
		slowmax.push(node3);
		
	
		
		System.out.println(slowmax.getMaxSoFar());
		

	}



	public int getMax(int t1, int t2){
		return t1 > t2 ? t1 : t2;
	};
	
	public int getGlobalMin() {
		return 0;
	}
}