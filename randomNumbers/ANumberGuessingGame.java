package randomNumbers;

import java.util.Scanner;
import java.util.Random;

public class ANumberGuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I'm thinking of a number from 1 to 10.\nYour guess: ");
		Scanner kb=new Scanner(System.in);
		int g=kb.nextInt();
		int r=1 + new Random().nextInt(10);
		if ( g != r ) {
			System.out.println("Sorry, but I was really thinking of "+r);
		}
		else {
			System.out.println("That's right!  My secret number was "+g);
		}
		 
		
	}

}
