import java.util.ArrayList;

public class ContainerWithMaxWater {
	public static int storeWater(ArrayList<Integer> height) {
		int lp=0;
		int rp=height.size()-1;
		int maxWater=0;
		while(lp<rp) {
			int ht=Math.min(height.get(lp), height.get(rp));
			int width=rp-lp;
			int currWater=ht*width;
			maxWater=Math.max(maxWater, currWater);
			
			//update
			if(lp<rp) {
				lp++;
			}else {
				rp++;
			}
			
		}
		return maxWater;
	}


	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(8);
		al.add(6);
		al.add(2);
		al.add(5);
		al.add(4);
		al.add(8);
		al.add(3);
		al.add(7);
		System.out.println("Container with maxWater :"+storeWater(al));
		

	}

}
