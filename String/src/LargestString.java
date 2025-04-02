
public class LargestString {

	public static void main(String[] args) {
		//compare the string lexographically
		//TIME COMPLEXITY=0(x*n)
		String fruits[]= {"apple","Mango","banana","mango"};
		String largest=fruits[0];
		for(int i=1;i<fruits.length;i++) {
			if(largest.compareToIgnoreCase(fruits[i])<0) {
				largest=fruits[i];
				
			}
		}
		System.out.println(largest);
		String s="ram";
		String t="ram";
		System.out.println(s.compareTo(t));

	}

}
