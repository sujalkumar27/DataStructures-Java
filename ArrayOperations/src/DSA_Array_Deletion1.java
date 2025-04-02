import java.util.Scanner;

public class DSA_Array_Deletion1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
//		Deletion at the end of array
//		1.create new array with one less element
		int newarr[] = new int[arr.length - 1];
		for (int i = 0; i < newarr.length; i++) {
			newarr[i] = arr[i];
		}
		arr = newarr;
		System.out.println("Array after Deletion is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
