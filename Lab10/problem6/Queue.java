package problem6;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue {
	class Node {
		Object value;
		Node next;
	}
	private Node head;
	private Node tail;
	public void add(Object newValue) {
		Node n = new Node();
		if(head == null) head = n;
		else tail.next = n;
		tail = n;
		tail.value = newValue;
	}
	public Object remove() {
		if(head == null) return null;
		Node n = head;
		head = n.next;
		return n.value;
	}
	public int countElements() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;

	}
}

class MultiThreadedTest {
	public static void main(String[] args) {
		MultiThreadedTest mtt = new MultiThreadedTest();
		for (int i = 0; i < 10; ++i) {
			mtt.multipleCalls();
		}
		System.out.println("Number of elements in the queue: " + mtt.q.countElements());
	}

	final Queue q = new Queue();
	Runnable r = () -> {
		q.add(0);
		q.add(0);
		q.remove();

	};

	public void multipleCalls() {
		for (int i = 0; i < 500; ++i) {
			new Thread(r).start();
		}
	}
}