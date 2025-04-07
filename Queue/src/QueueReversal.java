import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class QueueReversal {
	public static void reverse(Queue<Integer> q) {
		Stack<Integer> st= new Stack<>();
		while(!q.isEmpty()) {
			st.push(q.remove());
		}
		while(!st.isEmpty()) {
			q.add(st.pop());
		}
		System.out.println(q);
	}

	public static void main(String[] args) {
		Queue<Integer> q= new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(9);	
		q.add(10);
		reverse(q);
		
		

	}
}