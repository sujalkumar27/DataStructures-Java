//the time complexity of staircase search is O(n+m)
//where n is no of rows and m is no of columns
public class StaircaseSearch {
	//first approach of staircase method
	public static boolean search(int matrix[][],int key) {
		int row=0;
		int col=matrix[0].length-1;
		while(row <matrix.length && col>=0) {
			if(matrix[row][col]==key) {
				System.out.println("key is present at ("+row+","+col+")");
				return true;
			}else if(key<matrix[row][col]) {
				col--;
			}else {
				row++;
			}
		}
		System.out.println("key not found");
		return false;
	}
	//second approach of staircase method
	public static boolean search2(int matrix[][],int key) {
		int row=matrix.length-1;
		int col=0;
		while(row>=0 && col<matrix[0].length) {
			if(matrix[row][col]==key) {
				System.out.println("key is present at ("+row+","+col+")");
				return true;
			}else if(key<matrix[row][col]) {
				row--;
			}else {
				col++;
			}
		}
		System.out.println("key not found");
		return false;
	}

	public static void main(String[] args) {
		int arr[][] = { { 10, 20, 30, 40 },
				{ 15, 25, 35, 45 }, 
				{ 27, 29,37,48 },
				{ 32, 33,39,50} };
		search(arr, 33);
		search2(arr, 45);

	}

}
