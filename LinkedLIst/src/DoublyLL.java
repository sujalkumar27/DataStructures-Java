
public class DoublyLL {

	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	Node head = null;
	Node prev = null;
	Node tail = null;
	public int size;

	public void addFirst(int data) {
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;

	}

	public void addlast(int data) {
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
		tail = newNode;
	}

	public void print() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + "<->");
			temp = temp.next;

		}
		System.out.println("null");
	}

	public int removeFirst() {
		if (head == null) {
			System.out.println("Doubly Linkedlist is empty");
			return Integer.MIN_VALUE;
		}
		// size=1
		if (head.next == null) {
			int val = head.data;
			head = tail = null;
			size--;
			return val;
		}
		int val = head.data;
		head = head.next;
		head.prev = null;
		size--;
		return val;
	}

	public  int removeLast() {
		if (head == null) {
			System.out.println("Doubly Linkedlist is empty");
			return Integer.MIN_VALUE;
		}
		// size=1
		if (head.next == null) {
			int val = head.data;
			head = tail = null;
			size--;
			return val;
		}
		Node temp=head;
		while(temp.next != null) {
			temp=temp.next;
		}
		int val=temp.data;
		tail=temp.prev;
		tail.next=null;
		size--;
		return val;
		

	}
	public void reverse() {
		if (head == null || head.next==null) {
			System.out.println("Doubly Linkedlist is empty");
		}
		Node curr=tail=head;
		Node prev=null;
		Node next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			curr.prev=next;
			prev=curr;
			curr=next;
			
		}
		head=prev;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLL dll = new DoublyLL();
		dll.addFirst(5);
		dll.addFirst(4);
		dll.addFirst(3);
		dll.addFirst(2);
		dll.addFirst(1);
		dll.print();
		System.out.println(dll.size);
		dll.removeFirst();
		dll.print();
		System.out.println(dll.size);
		dll.addlast(6);
		dll.print();
		dll.removeLast();
		dll.print();
		dll.reverse();
		dll.print();
	}

}
