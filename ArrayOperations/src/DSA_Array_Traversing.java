import java.util.Scanner;

public class DSA_Array_Traversing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

//		Traversing
		
		if (arr.length>0) {
			System.out.println("Array elements are:");
//			for(int i=0;i<arr.length;i++) {
//				System.out.print(arr[i]+" ");
//			}
			for(int i:arr) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("No element to traverse!");
		}
	
		
	}

}
