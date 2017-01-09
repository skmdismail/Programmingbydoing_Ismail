package whileLoops;

import java.util.Random;
import java.util.Scanner;

public class HiLowithLimitedTries {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r=1 + new Random().nextInt(10);
		System.out.println("I'm thinking of a number from 1 to 100.\nYou have 7 guess: ");
		
		Scanner kb=new Scanner(System.in);
		int n=1;
		
		while( n<=7 ) {
			
			System.out.println("Your guess : "+n); 
			n++;
				int g=kb.nextInt();
				
				if ( g == r ) {
					System.out.println("You guessed it!  What are the odds?!? ");
				}
		}
		 	
	}
}
