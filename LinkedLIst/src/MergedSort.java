class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class MergedSort {
	
	public static Node head;
	public static Node tail;
	public void addFirst(int data) {
		//step 1 (create new node)
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		//step 2(newNode next=head)
		newNode.next=head;
		//step  3  (head=newNode)  
		head=newNode;
		
	}
	public void print() {
		if(head==null) {
			System.out.println("linkedlist is empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}

	private static Node getMid(Node head) {
		Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}
		return slow;// mid node
	}

	private static Node merge(Node head1, Node head2) {
	
		Node mergedll = new Node(-1);
		Node temp = mergedll;
		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				temp.next = head1;
				head1 = head1.next;
				temp = temp.next;

			} else {
				temp.next = head2;
				head2 = head2.next;
				temp = temp.next;
			}

		}
		// for remaining left
		while (head1 != null) {
			temp.next = head1;
			head1 = head1.next;
			temp = temp.next;
		}
		// for remaing right half
		while (head2 != null) {
			temp.next = head2;
			head1 = head2.next;
			temp = temp.next;
		}
		return mergedll.next;
	}

	public static Node mergeSort(Node head) {

		// base case
		if (head == null || head.next == null) {
			return head;
		}
		// find the mid
		Node mid = getMid(head);
		// left and right Merge Sort

		Node rightHead = mid.next;
		mid.next = null;
		Node newLeftHead = mergeSort(head);
		Node newRightHead = mergeSort(rightHead);
		// merge
		return merge(newLeftHead, newRightHead);
	}

	public static void main(String[] args) {
		MergedSort ll = new MergedSort();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(4);
		//ll.addFirst(5);
		ll.print();
		ll.head=ll.mergeSort(ll.head);
		ll.print();
		

	}

}
