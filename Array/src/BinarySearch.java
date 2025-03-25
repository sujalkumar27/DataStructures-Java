
public class BinarySearch {
	//time complexity o(log n)   space complexity o(1)
	public static int binarysearch(int arr[], int key) {
		int start=0 , end =arr.length -1;
		while(start<=end) {
			int mid =(start +end)/2;
			if (arr[mid]==key) {
				return mid;
			}else if(arr[mid]<key) {
				start =mid+1;
			}else {
				end =mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 46, 67, 87, 89,94,96,98,99 };
		int key = 67;
		int index = BinarySearch.binarysearch(arr,key);
		if (index == -1) {
			System.out.println("Value not found");
		}else {
			System.out.println("Value is at index "+index);
		}

	}

}
