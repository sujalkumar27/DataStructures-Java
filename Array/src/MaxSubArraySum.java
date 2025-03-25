
public class MaxSubArraySum {
	public static void printSubarray(int numbers[]) {
		int ts=0;
		for (int i = 0; i < numbers.length; i++) {
			int start = i;
			for (int j = i; j < numbers.length; j++) {
				int end = j;
				int sum=0;
				for (int k = start; k <= end; k++) {
					System.out.print(numbers[k] + " ");
					sum=sum+numbers[k];

				}
				ts++;
				System.out.print("  sum:"+sum); //print sum of sub array
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total no of subarrays: " + ts);
	}

	public static void main(String[] args) {
		int numbers[] = { 3, 5, 7, 8, 9 };
		printSubarray(numbers);

	}

}
