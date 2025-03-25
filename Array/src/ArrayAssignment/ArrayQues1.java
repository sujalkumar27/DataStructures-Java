    package ArrayAssignment;
/*make a function which returns true if any value appears at least twice
otherwise return false*/

public class ArrayQues1 {
	
	public static  boolean func(int nums[]) {
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int nums[]= {3,2,1,1,5};
		System.out.println(ArrayQues1.func(nums));

	}

}
