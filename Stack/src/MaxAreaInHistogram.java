import java.util.Stack;

public class MaxAreaInHistogram {
	public static void nextSmallerRight(int height[],int []nsr) {
		Stack<Integer> s= new Stack<>();
		int n=height.length;
		for(int i=n-1;i>=0;i--) {
			while(!s.isEmpty() && height[s.peek()]>=height[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsr[i]=n;
			}
			else {
				nsr[i]=s.peek();
			}
			s.push(i);
		}
	}
	public static void nextSmallerLeft(int height[],int []nsl) {
		Stack<Integer> s= new Stack<>();
		for(int i=0;i<height.length;i++) {
			while(!s.isEmpty() && height[s.peek()]>=height[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsl[i]=-1;
			}
			else {
				nsl[i]=s.peek();
			}
			s.push(i);
		}
	}
	public static int maxAreaInHistogram(int height[]) {
		int maxArea=0;
		int nsl[]=new int[height.length];
		int nsr[]=new int[height.length];
		nextSmallerRight(height, nsr);
		nextSmallerLeft(height, nsl);
		for(int k=0;k<height.length;k++) {
			int i=nsl[k];
			int j=nsr[k];
			int width=j-i-1;
			int area=width*height[k];
			maxArea=Math.max(maxArea, area);
			
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int height[]= {2,1,5,6,2,3};
		System.out.println(maxAreaInHistogram(height));

	}

}
                             