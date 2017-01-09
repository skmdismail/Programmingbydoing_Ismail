package ifStatements;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GenderGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your gender (M or F): ");
		Scanner kb=new Scanner(System.in);
		char g=kb.next().charAt(0);
		System.out.println("First name: ");
		String fn=kb.next();
		System.out.println("Last name: ");
		String ln=kb.next();
		
		System.out.println("Age: ");
		int age=kb.nextInt();
		
		if (age < 18 ) {
			System.out.println("Then I shall call you "+ln+".");
			System.exit(0);
		}
		if(g=='M') {
			System.out.println("Then I shall call you Mr. "+ln+".");
		}
		else  {

			System.out.println("Are you married, "+fn+" (y or n)? ");
			char m=kb.next().charAt(0);

			if( m=='y' ) {
				System.out.println("Then I shall call you Mrs. "+ln+".");
			}
			else  {
				System.out.println("Then I shall call you Ms. "+ln+".");
			}

		}
	}

}
