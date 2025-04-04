public class LinkedListEx1 {
	public  class Node{
		public int data;
		public Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	public void addFirst(int data) {
		//step 1 (create new node)
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		//step 2(newNode next=head)
		newNode.next=head;
		//step  3  (head=newNode)  
		head=newNode;
		
	}
	public void addLast(int data) {
		//step 1-create new node
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			tail=head=newNode;
			return;
		}
		//step2 =tail.next=newNode
		tail.next=newNode;
		//step3-tail=newNode
		tail=newNode;
		
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
	public void add(int idx,int data) {
		if(idx==0) {
			addFirst(data);
			return;
		}
		Node newNode= new Node(data);
		size++;
		Node temp=head;
		int i=0;
		while(i<idx-1) {
			temp=temp.next;
			i++;
		}
		//i=idx-1 temp->prev
		newNode.next=temp.next;
		temp.next=newNode;
	}
	public static int removeFirst() {
		if(size==0) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		}else if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		int val=head.data;
		head=head.next;
		size--;
		return val;
	}
	public static int removeLast() {
		if(size==0) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		}else if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		Node prev=head;
		//prev =size -2;
		for(int i=0;i<size-2;i++) {
			prev=prev.next;
		}
		int val=prev.next.data;//tail data
		prev.next=null;
		tail=prev;
		size--;
		return val;
	}
	public static int itrSearch(int key) {
		int idx=0;
		Node temp=head;
		while(temp!=null) {
			if(temp.data==key) {
				return idx;
			}
			temp=temp.next;
			idx++;
		}
		//key not found
		return -1;
	}
	public static int helper(Node head,int key) {
		if(head==null) {
			return -1;
		}
		if(head.data==key) {
			return 0;
		}
		int idx=helper(head.next,key);
		if(idx==-1) {
			return -1;
		}
		return idx+1;
	}
	public static int recSearch(int key) { //O(n)
		return helper(head,key);
	}
	public void reverse() {//Iterative approach
		Node prev=null;
		Node curr=tail=head;
		Node next;
		while(curr!=null) {
			 next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	//delete the nth node from the end of linked list
	public void delNthFromEnd(int n) {
		//calculate size
		int sz=0;
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			sz++;
		}
		int iToEnd=sz-n;
		if(n==sz) {//remove first node
			head=head.next;
			return;
		}
		Node prev=head;
		int i=1;
		while(i<iToEnd) {
			prev=prev.next;
			i++;
		}
		prev.next=prev.next.next;
	}
	//slow-fast approach
	public static Node findMiddle(Node head) {//helper function
		Node slow=head;
		Node fast=head;
		while(fast != null && fast.next != null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static boolean checkPalindrome() {
		if(head==null && head.next==null) {
			return true;
		}
		//step 1- find the middle
		Node midNode=findMiddle(head);
		//step 2- reverse the second half
		Node prev=null;
		Node curr=midNode;
		Node next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		Node right=prev;
		Node left=head;
		//step 3-check left half and right half
		while(right!=null) {
			if(left.data!=right.data) {
				return false;
			}
			left=left.next;
			right=right.next;
		}
		return true;
	}
	public static  boolean isCycle() {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	public static void removeCycle() {
		//detect loop
		Node slow=head;
		Node fast=head;
		boolean cycle=false;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				cycle=true;
				break;
			}
		}
		if(cycle=false) {
			return;
		}
		//find meeting point
		slow=head;
		Node prev=null;
		while(slow!=fast) {
			prev=fast;
			slow=slow.next;
			fast=fast.next;
		}
		//remove cycle last.next=null
		prev.next=null;	}
	public void zigzag() {
		//find the midnode
		Node slow=head;
		Node fast=head.next;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		Node mid=slow;
		//reverse second half
		Node curr=mid.next;
		mid.next=null;
		Node prev=null;
		Node next; 
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		Node left=head;
		Node right=prev;
		Node nextL , nextR;
		//alt merge - zig-zag merge
		while(left!=null && right!=null) {
			
			nextL=left.next;
			left.next=right;
			nextR = right.next;
			right.next=nextL;
			
			//update
			left=nextL;
			right=nextR;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListEx1 ll= new LinkedListEx1();
		ll.print();
		ll.addFirst(2);
		ll.print();
		ll.addFirst(1);
		ll.print();
		ll.addLast(4);
		ll.print();
		ll.addLast(5);
		ll.add(2, 3);
		ll.print();
//		System.out.println(ll.size);
//		ll.removeFirst();
//		ll.print(); 
//		ll.removeLast();
//		ll.print();
//		System.out.println(ll.recSearch(4));;
//		System.out.println(ll.recSearch(10));;
//		ll.reverse();
//		ll.print();
//		ll.delNthFromEnd(3);
//		ll.print();
//		System.out.println(findMiddle(head));
		
//		 head=ll.new Node(1);
//		 Node temp=ll.new Node(2);
//		 head.next=temp;
//		head.next.next=ll.new Node(3);
//		head.next.next.next=temp;
//		System.out.println(ll.isCycle());
//		ll.removeCycle();
//		System.out.println(ll.isCycle());
		ll.zigzag();
		ll.print();

	}

}
