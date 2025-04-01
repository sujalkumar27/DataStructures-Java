package AdvancePattern;
public class FloydsTriangle {
	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.println((j+1)+" ");
				if(j==n) {
					return;
				}
			}
		System.out.println();	
		}
		
	}
	
	

}
