
public class PairsInArray {
	//Reverse an array 
	public static void printpair( int arr[] ) {
		int tp=0;
		for(int i=0;i<arr.length;i++) {
			int curr=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				System.out.print("("+curr+","+arr[j]+") ");
				tp++;
			}System.out.println();
		}System.out.println("Total pairs = "+tp);
	}
	public static void main(String[] args) {
		int arr[] = { 1,5, 3, 6, 4, 1 };
		PairsInArray.printpair(arr);
		
	}
}
//Time complexity=o(n2	)
//Space complexity=o(1)