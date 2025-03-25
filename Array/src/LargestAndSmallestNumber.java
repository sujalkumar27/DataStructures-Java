
public class LargestAndSmallestNumber {
	public static int largest(int arr[]) {
		int large=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large=arr[i];
			}
		}
		return large;
	}
	public static int smallest(int arr[]) {
		int small=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small=arr[i];
			}
		}
		return small;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 45, 6, 4, 46, 67,99,1, 87, 34, 23, 45 };
		int large=LargestAndSmallestNumber.largest(arr);
		System.out.println("The largest value is "+large);
		int small=LargestAndSmallestNumber.smallest(arr);
		System.out.println("The smallest value is "+small);

	}

}
