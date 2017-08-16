public class LinkedListUtilTestHelper {

	public static Node insert(Node head, int data) {
		Node node = new Node(data);
		Node current = head;

		if (head == null) {
			head = node;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
		return head;
	}

	public static void showLinkedList(Node head) {
		Node current = head;

		if (head == null){
			System.out.println("Linkedlist is empty");			
		}else{
			System.out.print(head.getValue() + " --> ");
		}

		while (current.next != null) {
			current = current.next;
			System.out.print(current.getValue() + " --> ");
		}
	}
}
