
public class QueueUsingLinkedlist {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static class Queue{
		static Node head;
		static Node tail;
		
		public static boolean isEmpty() {
			return head==null && tail==null;
			
		}
		//add  O(1)
		public static void add(int data) {
			Node newNode=new Node(data);
			if(head==null) {
				head=tail=newNode;
				return;
			}
			tail.next=newNode;
			tail=newNode;
		}
		
		//remove
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1; 
			}
			int front=head.data;
			//only 1 ele in queue
			if(tail==head) {
				tail=head=null;
			}else {
				head=head.next;
			}
			return front;
			
		}
		//peek
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1; 
			}
			return head.data;
		}
	}
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
