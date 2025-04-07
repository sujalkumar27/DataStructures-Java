import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
	static class Queue{
		Deque<Integer> dq= new LinkedList<>();
		public void add(int data) {
			dq.addLast(data);
		}
		public int remove() {
			return dq.removeFirst();
		}
		public int peek() {
			return dq.peek();
		}
	}

	public static void main(String[] args) {
		
		Queue q= new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println("Queue peek element "+ q.peek());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}

}
