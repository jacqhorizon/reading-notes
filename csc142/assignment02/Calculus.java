/**
 * This class is to calculate pi and euler constant
 *
 * @author Jacq Kirkman 
 * @version 1
 */
public class Calculus {
	public static void main(String[] args) {
		for(int i=1; i<=30; i++) {
			System.out.println("Pi value after "+i+" term(s) = "+pi(i));
		}
		for(int i=1; i<=18; i++) {
			System.out.println("Euler value after "+i+" term(s) = "+euler(i));
		}
	}
	
	public static double pi(int n) {
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += Math.pow(-1, i) / ((2*i + 1)*Math.pow(3, i));
		}
		return Math.sqrt(12)*sum;
	}
	
	public static double euler(int n) {
		double sum = 0;
		for(int i=0; i<n; i++) {
			double factorial = 1;
			for(int y=1; y<=i; y++) {
				factorial = factorial * y;
			}
			sum += 1/factorial;
		}
		return sum;
	}
	
}
