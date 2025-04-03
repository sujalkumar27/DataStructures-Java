
public class OperationsGetSetClearBit {
//  get the ith bit
	public static int getIthBit(int n,int i) {
		int bitmask=1<<i;
		if((n & bitmask)==0) return 0;
		else return 1;
	}
//	set the ith bit to 1
	public static int setIthPosition(int n,int i) {
		int bitmask=1<<i;
		n= n|bitmask;
		return n;
	}
//	clear the ith bit to 0
	public static int clearIthBit(int n, int i) {
		int bitmask=~(1<<i);
		return n&bitmask;
	}
//	update the ith bit to the newBit
	public static int updateIthBit(int n, int i,int newBit) {
		n=clearIthBit(n, i);
		int bitmask=newBit<<i;
		return n|bitmask;
	}
//	clear last i bits
	public static int clearIbit(int n, int i) {
		int bitmask=((-1)<<i);
		return n&bitmask;
	}
//  clear the range of bits from the ith position to jth position
	public static int clearRangeOfBits(int n,int i, int j) {
		int a=(~0)<<(j+1);
		int b=1<<(i-1);
		int bitmask=a|b;
		return n&bitmask;
	}

	public static void main(String[] args) {
		System.out.println(getIthBit(5, 2));
		System.out.println(getIthBit(5, 1));

		System.out.println(setIthPosition(10, 2));
		System.out.println(clearIthBit(10, 1));
		;System.out.println(updateIthBit(10, 2, 1));
		System.out.println(clearIbit(15, 2));
		System.out.println(clearRangeOfBits(10,2,4));
	}

}
