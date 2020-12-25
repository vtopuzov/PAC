


public class FastMaxStack<T> implements MaxStack<T> {

	private final Maximizer<T> maximizer;
	private ListNode<T> top;
	private ListNode<T> max;
	
	public FastMaxStack(Maximizer<T> maximizer) {
		this.maximizer = maximizer;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void push(T value) {
		if (top == null) {
			// create a new list, new value will be highest
			top = new ListNode<T>(value, null);
			max = new ListNode<T>(value, null);
		} else {
			// add value at beginning of list
			top = top.setValue(value);
			// determine which value is higher, the current max or new value
			T maxVal = maximizer.getMax(getMaxSoFar(), value);
			// add max value at beginning of list
			max = max.setValue(maxVal);
		}
	}

	@Override
	public T pop() {
		// store popped value
		T value = top.value;
		// remove nodes from beginning of both lists
		top = top.next;
		max = max.next;
		return value;
	}

	@Override
	public T getMaxSoFar() {
		// head of max list is highest value
		return max.value;
	}

}


