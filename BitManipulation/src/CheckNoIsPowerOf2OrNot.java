
public class CheckNoIsPowerOf2OrNot {
	public static boolean checkPowerOf2(int n) {
		if((n & (n-1))==0) { return true;} 
		
		return false;
		
//		return (n & (n-1))==0;
	}
	public static int countSetBits(int n) {
		int count=0;
		while(n>0) {
			if((n&1)!=0) {//check our LSB(least significant bit)
				count++;
			}
			n=n>>1;
		}
		return count;
		
	}
	public static int fastExpo(int a,int n) {
		int ans=1;
		while(n>0) {
			if((n&1)!=0) {//check LSB
				ans=ans*a;
			}
			a=a*a;
			n=n>>1;
		}
		return ans;
		
	}

	public static void main(String[] args) {
		System.out.println(checkPowerOf2(4));
		System.out.println(checkPowerOf2(8));
		System.out.println(checkPowerOf2(7));
		System.out.println(countSetBits(10));
		System.out.println(countSetBits(7));
		System.out.println(fastExpo(3, 5));

	}

}
