
public class LinkedListUtil {

	public Node reverseList(Node head) {
		// Give resolution here. Please make sure your resolution covers all
		// above-listed test cases.
		// JUnit test cases are not required but you are welcome to provide it
		// to save my time to verify your resolution.
		// It is a good habit for the software engineer to prepare JUnit test
		// cases.
		Node prev = null;
		Node cur = head;
		Node next = head;

		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;

	}
}

class Node {
	Node next;
	int value;
	
	Node(int value){
		this.value=value;
		this.next=null;
	}

	public Node getNext() {
		return next;
	}

	public int getValue() {
		return value;
	}
}
