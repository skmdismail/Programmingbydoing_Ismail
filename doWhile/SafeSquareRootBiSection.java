package doWhile;

import java.util.Scanner;

public class SafeSquareRootBiSection {

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
		float l=0,h=n,m;
		int ret;
		do {
			m=(l+h)/2;
			ret=Float.compare(m*m,n);
			if(ret<0) l=m;
			else h=m;			
		} while(ret!=0);
		
		System.out.printf("%.6f\n",m);
		
		System.out.printf("%.6f\n",Math.sqrt(n)); // Verifying here for accuracy.
	}

}
