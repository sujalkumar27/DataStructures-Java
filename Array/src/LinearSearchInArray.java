
public class LinearSearchInArray {
	public static int linearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 45, 6, 4, 46, 67, 87, 34, 23, 45 };
		int key = 23;
		int index = LinearSearchInArray.linearSearch(arr,key);
		if (index == -1) {
			System.out.println("Value not found");
		}else {
			System.out.println("Value is at index "+index);
		}

	}

}
