
public class DiagonalSum {
	public static void diagonalSum(int matrix[][]) {
		//time complexity is O(n)
		int sum=0;
		for(int i=0;i<matrix.length;i++) {
			//primary diagonal sum
			sum += matrix[i][i];
			//secondary diagonal sum
			if(i != matrix.length-1-i) {
				sum += matrix[i][matrix.length-1-i];
			}
		}
		System.out.println("The diagonal sum of matrix is: "+sum);
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		int ar[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		diagonalSum(arr);
		diagonalSum(ar);
	}

}
