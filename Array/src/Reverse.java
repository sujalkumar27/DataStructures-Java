
public class Reverse {
	//Reverse an array 
	public static void reverse( int arr[] ) {
		int start=0, end=arr.length -1;
		while(start<end) {
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int arr[] = { 5, 45, 6, 4, 46, 67, 99, 1 };
		Reverse.reverse(arr);
		//print the reverse array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		
	}
}
//Time complexity=o(n)
//Space complexity=o(1)