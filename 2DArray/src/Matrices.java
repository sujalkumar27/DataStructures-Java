import java.util.Scanner;
public class Matrices {
	public static boolean search(int matrix[][], int key) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == key) {
					System.out.println("key found at cell (" + i + "," + j + ")");
					return true;
				}
			}

		}
		System.out.println("key not found");
		return false;
	}

	// method to find the largest element in 2d array
	public static int largest(int matrix[][]) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > largest) {
					largest = matrix[i][j];
				}
			}
		}
		return largest;

	}

	// method to find the smallest element in 2d array
	public static int smallest(int matrix[][]) {
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < smallest) {
					smallest = matrix[i][j];
				}
			}
		}
		return smallest;

	}

	public static void rotate90degree() {
		int matrix[][] = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		int ans[][]=new int[4][4];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				ans[j][matrix.length-i-1] = matrix[i][j];
			}
		}

		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void rotate180degree() {
		int matrix[][] = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		int ans[][]=new int[4][4];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				ans[matrix.length-i-1][matrix.length-j-1]=matrix[i][j];
			}
		}
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array values");
//		// taking input
//		int matrix[][] = new int[3][3];
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				matrix[i][j] = sc.nextInt();
//			}
//		}
//
//		// output
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
//		search(matrix, 5);
//		System.out.println(largest(matrix));
//		System.out.println(smallest(matrix));
//		rotate90degree();
		rotate180degree();

	}

}
