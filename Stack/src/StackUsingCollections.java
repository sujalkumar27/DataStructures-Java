import java.util.*;
public class StackUsingCollections {
	public static void  pushAtBottom(Stack<Integer> s, int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;	
		}
		int top=s.pop();
		pushAtBottom(s, data);
		s.push(top);
	}
	public static String reverseString(String str) {
		Stack<Character> s= new Stack<>();
		int idx=0;
		while(idx<str.length()) {
			s.push(str.charAt(idx));
			idx++;
		}
		StringBuilder result= new StringBuilder();
		while(!s.isEmpty()) {
			result.append(s.pop());
		}
		str=result.toString();
		return str;
	}
	public static void reverseStack(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverseStack(s);
		pushAtBottom(s, top);
	}
	public static void printStack(Stack<Integer> s) {
		while (!s.isEmpty()) {
			System.out.println(s.pop());
			
		}
	}
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		//pushAtBottom(stack, 4);
		printStack(stack);
		reverseStack(stack);
		printStack(stack);
		//System.out.println(reverseString("abcd"));

	}

}
