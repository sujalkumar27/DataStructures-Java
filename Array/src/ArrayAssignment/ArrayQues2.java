package ArrayAssignment;


public class ArrayQues2 {
	
	public static  int func(int nums[],int target ){
		for(int i=0; i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int nums[]= {3,2,1,1,5};
		int target=6;
		System.out.println(ArrayQues2.func(nums,target));

	}

}
