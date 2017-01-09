package randomNumbers;
import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int r=1+new Random().nextInt(100);
		if( n< r)
			System.out.println("Sorry, you are too low.  I was thinking of "+r);
		else if ( n>r )
			System.out.println("Sorry, you are too high.  I was thinking of "+r);
			
	}

}
