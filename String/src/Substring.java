
public class Substring {
	public static String substring(String str, int si, int ei) {
		String st = "";
		for (int i = si; i < ei; i++) {
			st += str.charAt(i);

		}
		return st;
	}

	public static void main(String[] args) {
		// Substring
		String str = "HelloWorld";
		System.out.println(substring(str, 0, 5));

		// using method
		System.out.println(str.substring(0, 5));

	}

}
