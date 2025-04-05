import java.util.ArrayList;

public class StackUsingLinkedList {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static class Stack {
		static Node head=null;
		public boolean isEmpty() {
			return head==null;
		}
		//push
		public void push(int data) {
			Node newNode=new Node(data);
			if(head==null) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
		}
		//pop
		public int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=head.data;
			head=head.next;
			return top;
		}
		//peek
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
				
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.push(3);
		while (!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}

	}

}
