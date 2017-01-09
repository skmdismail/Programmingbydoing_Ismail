package whileLoops;
import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I'm thinking of a number from 1 to 10. Your guess > ");
		Scanner kb=new Scanner(System.in);
		
		
		int g,r=1 + new Random().nextInt(10);
		
		do {
			g=kb.nextInt();
			if ( g != r ) {
				System.out.println("That is incorrect. Guess again.");
			
			}
			else {
				System.out.println("That's right! You're a good guesser.");
			}
		} while ( g!=r );
		 
		
	}

}
