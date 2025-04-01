
public class BinomialCoefficient {
	public static int factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact= fact*i;
		}
		return fact;
	}
	public static int binomialCoefficient(int n , int r) {
		int p=factorial(n);
		int q=factorial(r);
		int s=factorial(n-r);
		int b=p/(q*s);
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Binomial Coefficient is  "+binomialCoefficient(5,2));

	}

}
