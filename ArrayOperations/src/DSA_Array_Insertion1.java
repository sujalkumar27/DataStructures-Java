import java.util.Scanner;

public class DSA_Array_Insertion1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the value to be inserted:");
		int value = sc.nextInt();

//		Insertion at the end of the array
//		1. Create new array
		int newarr[] = new int[arr.length + 1];
//		2.Copy all elements to new array
		for (int i = 0; i < arr.length; i++) {
			newarr[i] = arr[i];
		}
//		3.set the value at the end in the new array
		newarr[newarr.length - 1] = value;
		arr = newarr;
//		4.print array
		System.out.println("Array after Insertion is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
