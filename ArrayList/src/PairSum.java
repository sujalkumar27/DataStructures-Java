import java.util.ArrayList;

public class PairSum {
	public static boolean pairSum(ArrayList<Integer> al, int target) {
		int lp = 0;
		int rp = al.size() - 1;
		while (lp != rp) {
			if (al.get(lp) + al.get(rp) == target) {
				return true;
			}
			if (al.get(lp) + al.get(rp) < target) {
				lp++;
			} else {
				rp--;
			}
		}

		return false;
	}
	//pair sum of rotated sorted array
	public static boolean pairSum2(ArrayList<Integer> list, int target) {
		//find breaking point
		int bp=-1;
		for(int i=0;i<list.size();i++ ) {
			if(list.get(i)>list.get(i+1)) {
				bp=i;
				break;
			}
		}
		int lp=bp+1;
		int rp=bp;
		int n=list.size();
		//then check
		while(lp!=rp) {
			if (list.get(lp) + list.get(rp) == target) {
				return true;
			}
			if (list.get(lp) + list.get(rp) < target) {
				lp=(lp+1)%n;
			} else {
				rp=(n+rp-1)%n;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		if (pairSum(al,5)) {
			System.out.println("yes");
		} else {
			System.out.println("Not exist");
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(15);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
		if (pairSum2(list,16)) {
			System.out.println("yes");
		} else {
			System.out.println("Not exist");
		}

	}

}
