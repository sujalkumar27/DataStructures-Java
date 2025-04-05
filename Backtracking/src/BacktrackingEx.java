
public class BacktrackingEx {
	public static void changeArr(int arr[],int i , int val) {
		//basecase
		if(i==arr.length) {
			printArr(arr);
			return;
		}
		//recursion
		arr[i]=val;
		changeArr(arr, i+1, val+1);//function call step
		arr[i]=arr[i]-2;//backtracking step
	}
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void findSubsets(String str, String ans, int i) {
		//base case
		if(i==str.length()) {
			System.out.print(ans+" ");
			return;
		}
		//recursion
		//yes choice
		findSubsets(str, ans+str.charAt(i), i+1);
		//no choice
		findSubsets(str, ans, i+1);
	}
	public static void findPermutation(String str, String ans) {
		//base case
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		//recursion
		for(int i=0;i<str.length();i++) {
			char curr=str.charAt(i);
			String NewStr=str.substring(0,i)+str.substring(i+1);
			findPermutation(NewStr, ans+curr);
		}
	}
	public static int gridWays(int i, int j, int n, int m) {
		//base case
		if(i==n-1 && j==m-1) {//condition for last cell
			return 1;
		}else if(i==n || j==m) {//boundary cross condition
			return 0;
		}
		
		
		int w1=gridWays(i+1, j, n, m);
		int w2=gridWays(i, j+1, n, m);
		return w1+w2;
	}

	public static void main(String[] args) {
		int arr[]=new int[5];
		changeArr(arr, 0, 1);
		printArr(arr);
		String str="abc";
		findSubsets(str, "", 0);
		System.out.println();
		findPermutation(str, "");
		System.out.println();
		int n=3;
		int m=3;
		System.out.println("grid ways: "+gridWays(0, 0, n, m));
	}
	

}
