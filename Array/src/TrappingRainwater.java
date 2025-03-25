
public class TrappingRainwater {
	public static int trappedWater(int height[]) {//Time Complexity=  O(n)
		int n=height.length;
		int trapedWater=0;
		//calculate left max boundary- array
		int leftMax[]= new int[n];
		leftMax[0]=height[0];
		for(int i=1;i<n;i++) {
			leftMax[i]=Math.max(height[i], leftMax[i-1]);
		}
		
		//calculate right max boundary-array
		int rightMax[]=new int[n];
		rightMax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--) {
			rightMax[i]=Math.max(height[i], rightMax[i+1]); 	
		}
		//loop
		for(int i=0;i<n;i++) {
			//waterlevel=min(left max bound, right max bound)
			int waterlevel=Math.min(leftMax[i], rightMax[i]);
			//trapedwater=waterlevel-height[i]
			trapedWater+=waterlevel-height[i];
		}
		
		return trapedWater;
	}
	public static void main(String[] args) {
		int height[]= {4,2,0,6,3,2,5};
		System.out.println(TrappingRainwater.trappedWater(height));
	}

}
