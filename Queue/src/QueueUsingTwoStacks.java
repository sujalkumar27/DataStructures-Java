
import java.util.Stack;

public class QueueUsingTwoStacks {
	static class Queue {
		static Stack<Integer> s1 = new Stack<>();
		static Stack<Integer> s2 = new Stack<>();

		public static boolean isEmpty() {
			return s1.isEmpty();
		}

		// add
		public void add(int n) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(n);
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}

		// remove
		public static int remove() {
			if (s1.isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int result = s1.pop();
			return result;
		}

		// peek
		public static int peek() {
			if (s1.isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return s1.peek();
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
