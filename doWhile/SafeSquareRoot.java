package doWhile;
import java.util.Scanner;

public class SafeSquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number for square root : ");
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		
		if(n<0) {
			System.out.println("You can't take the square root of a negative number, silly.");
			System.exit(1);
		}
		
		float r=0;
		while( r*r <= n) {
			++r;
		}
		
		--r; // Got integral root upto here.

		if( r*r !=n ) {
			while( Float.compare(r*r,n) <= 0 ) {
				r+=0.000001; // Accuracy upto 6 fractional part;
			}
	
		}
		
		System.out.printf("%.6f\n",r);
		
		System.out.printf("%.6f\n",Math.sqrt(n)); // Verifying here for accuracy.
		
	}

}
