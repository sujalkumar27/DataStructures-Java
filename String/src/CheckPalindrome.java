
public class CheckPalindrome {
	public static boolean checkPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static boolean isPalindrome(String str) {
		for(int i=0;i<str.length()/2;i++) {
			//check is not palindrome
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		String str="racecar ";
		System.out.println(checkPalindrome(str));
		System.out.println(isPalindrome(str));
	}

}
