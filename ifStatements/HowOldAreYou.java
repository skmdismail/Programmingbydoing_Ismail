package ifStatements;

import java.util.Scanner;

public class HowOldAreYou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Hello.  What is your name? "); String name=kb.nextLine();
		System.out.println("Hi, "+name+"!  How old are you? ");int age=kb.nextInt();
		
		if(age<16) System.out.println("You can't drive, "+name+".");
		if(age<18) System.out.println("You can't vote, "+name+".");
		if(age<25) System.out.println("You can't rent a car, "+name+".");
		if(age>=25) System.out.println("You can do anything that's legal, "+name+".");

	}

}
