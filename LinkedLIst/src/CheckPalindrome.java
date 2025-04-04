

public class CheckPalindrome {
	public class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node head;
	public static Node tail;
	
	public void addLast(int data) {
		//step 1-create new node
		Node newNode=new Node(data);
		if(head==null) {
			tail=head=newNode;
			return;
		}
		//step2 =tail.next=newNode
		tail.next=newNode;
		//step3-tail=newNode
		tail=newNode;
		
	}

	// slow-fast approach
	public static Node findMiddle(Node head) {// helper function
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static boolean checkPalindrome() {
		if (head == null && head.next == null) {
			return true;
		}
		// step 1- find the middle
		Node midNode = findMiddle(head);
		// step 2- reverse the second half
		Node prev = null;
		Node curr = midNode;
		Node next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node right = prev;
		Node left = head;
		// step 3-check left half and right half
		while (right != null) {
			if (left.data != right.data) {
				return false;
			}
			left = left.next;
			right = right.next;
		}
		return true;
	}

	public void print() {
		if (head == null) {
			System.out.println("linkedlist is empty");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListEx1 ll= new LinkedListEx1();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(1);
		ll.addLast(1);
		ll.print();
	    System.out.println(ll.checkPalindrome());
	}

}
