package doWhile;

import java.util.Scanner;

public class CollatzSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Starting number: "); 
		int n=kb.nextInt(),largest=n;
		
		do {
			System.out.print(n+" ");
			if(n==1) break;

			if(n>largest) largest=n;

			if(n%2==0) n/=2;
			else {
				n*=3; ++n;
			}
		} while( n>=1 );

	System.out.println("\n\nLargest="+largest); 
	}

}
