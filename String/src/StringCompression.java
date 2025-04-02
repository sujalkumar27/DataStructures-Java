
public class StringCompression {
//	time complexity= O(n)
//	because in while loop also there is also i++ due to which 
//	loop run for the length of the string
	public static String compress(String str) {
		String newstr="";
		for(int i=0;i<str.length();i++) {
			Integer count=1;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			newstr+=str.charAt(i);
			if(count>1) {
				newstr+=count.toString();
			}
			
		}
		return newstr;
	}
	

	public static void main(String[] args) {
		String s="aaabbcccdd";
		String ss="abaabbac";
		System.out.println(compress(ss));
		System.out.println(compress(s));
		
		

	}

}
