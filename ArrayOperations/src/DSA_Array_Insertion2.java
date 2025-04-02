import java.util.Scanner;

public class DSA_Array_Insertion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the value to be inserted and index:");
		int value = sc.nextInt();
		int index=sc.nextInt();
		
//		Insertion at specified index
//		1.Check the index range
		if(index>=0 && index<arr.length -1) {
//			2.create new array and copy all elements to it.
			int newarr[] = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
//			3.shift all elements right of index element by one position
			for(int i=newarr.length -1;i>index;i--) {
				newarr[i]=newarr[i-1];
			}
//			4.insert value at position index
			newarr[index] = value;
			arr = newarr;
//			4. print new array
			System.out.println("Array after Insertion is:");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

		}
//		5.otherwise print invalid index
		else {
			System.out.println("Invalid Index");
		}
		
	}

}
