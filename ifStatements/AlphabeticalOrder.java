package ifStatements;

import java.util.Scanner;

public class AlphabeticalOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What's your last name? ");
		Scanner kb=new Scanner(System.in);
		String name=kb.nextLine();
		
		if( name.compareTo("Carswell") <=0 ) {
			System.out.println("you don't have to wait long");
		}
		else if( name.compareTo("Jones") <=0 ) {
			System.out.println("that's not bad");
		}
		else if( name.compareTo("Smith") <=0 ) {
			System.out.println("looks like a bit of a wait");
		}
		else if( name.compareTo("Young") <=0 ) {
			System.out.println("it's gonna be a while");
		}
		else {
			System.out.println("not going anywhere for a while?");
		}
	}
}

