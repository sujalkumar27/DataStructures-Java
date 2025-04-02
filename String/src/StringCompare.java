
public class StringCompare {

	public static void main(String[] args) {
		String s1 = "sujal";
		String s2 = "sujal";
		String s3 = new String("sujal");
		// this '==' comparator compare the reference value of the string

		if (s1 == s2) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("String are not equal");
		}

		if (s1 == s3) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("String are not equal");
		}
		// equal function compare the value stored in the string and
		// return the boolean
		if (s1.equals(s3)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("String are not equal");
		}
	}

}
