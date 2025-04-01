
package AdvancePattern;
import java.util.*;
public class ButterflyPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
//		//int n=sc.nextInt();
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
//			for(int j=2*(n-i-1);j<=0;j-=2) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
			System.out.println();
		}

	}

}
