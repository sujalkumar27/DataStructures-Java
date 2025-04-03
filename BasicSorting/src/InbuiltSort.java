import java.util.*;
public class InbuiltSort {

	public static void main(String[] args) {
		int arr[]= {3,6,4,1,5,2,7};
		Integer arr1[]= {3,6,4,1,5,2,7};
		//Arrays.sort(arr);//Time Complexity O(nlogn)
		Arrays.sort(arr,0,5);//sort with indexing
		//sort the array in reverse as an object 
		//Arrays.sort(arr1,Collections.reverseOrder());
		Arrays.sort(arr1,0,5,Collections.reverseOrder());
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : arr1) {
			System.out.print(i+" ");
		}
	}

}
