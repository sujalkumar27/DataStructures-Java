
public class SubArrays { // kadane's algorithm
	public static void printMaxSum(int numbers[]) {
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		for (int i = 0; i < numbers.length; i++) {

			curSum = curSum + numbers[i];
			if (curSum < 0) {
				curSum = 0;
			}
			if (curSum > maxSum) {
				maxSum = curSum;
			}

		}
		System.out.println("Max sum of subarray is: " + maxSum);
	}
//array with the given sum using the two pointer approach and TC=O(n)
//the function print the index for the given sum.
	public static void arrwithsum(int arr[], int s) {
		int csum = arr[0];
		int left = 0;
		int right = 0;
		boolean is = false;
		while (right < arr.length) {
			if (csum < s) {
				right++;
				if (right < arr.length)
					csum += arr[right];

			} else if (csum == s) {
				is = true;
				break;
			} else {
				csum = csum - arr[left];
				left++;

			}

		}
		if (is) {
			System.out.println((left + 1) + " " + (right+1));
		}
	}

	public static void main(String[] args) {

		int numbers[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
		printMaxSum(numbers);
		int arr[] = { 1, 2, 3, 7, 5 };
		arrwithsum(arr, 12);

	}
}
//	public static void printMaxSum(int numbers[]) {   //prefix sum   TC=o(n*n)
//		int max=Integer.MIN_VALUE;
//		int cursum=0;
//		int prefix[]=new int[numbers.length];
//		prefix[0]=numbers[0];
//		for(int i=1;i<numbers.length;i++) {
//			prefix[i]=prefix[i-1]+numbers[i];
//		}
//		for(int i=0;i<numbers.length;i++) {
//			int start=i;
//			for(int j=i;j<numbers.length;j++) {
//				int end=j;
//				cursum=start==0?prefix[end]:prefix[end]- prefix[start-1];
//				if(cursum>max) {
//					max=cursum;
//				}
//			}
//		}
//		System.out.println("Max sum of subarray is: "+max);
//		
//	}
//	
//	public static void main(String[] args) {
//		int numbers[] = { 7, 5, 7, 8, 10,-2 };
//		printMaxSum(numbers);
//
//	}
//
//}

//public static void printMaxSum(int numbers[]) { //Brute force approach		
//		int maxsum=Integer.MIN_VALUE;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			int start = i;
//			for (int j = i; j < numbers.length; j++) {
//				int end = j;
//				int currentsum=0;
//				for (int k = start; k <= end; k++) {
//					currentsum=currentsum+numbers[k];
//				}
//				System.out.println(currentsum);
//				if(maxsum<currentsum) {
//					maxsum=currentsum;
//				}
//			}
//		}
//		System.out.println("Max sum of subarrays: " + maxsum);
//	}
//
//	public static void main(String[] args) {
//		int numbers[] = { 7, 5, 7, 8, 10,-2 };
//		printMaxSum(numbers);
//
//	}
//
//}
