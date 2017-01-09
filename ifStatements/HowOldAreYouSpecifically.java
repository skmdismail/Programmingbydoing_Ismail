package ifStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Hello.  What is your name? (Sorry, I keep forgetting.)  "); String name=kb.nextLine();
		System.out.println("Hi, "+name+"!  How old are you? ");int age=kb.nextInt();
		
		if(age<16) System.out.println("You can't drive, "+name+".");
		else if(age<18) System.out.println("You can drive but not vote."+name+".");
		else if(age<25) System.out.println("You can vote but not rent a car. "+name+".");
		else System.out.println("You can do pretty much anything."+name+".");

	}
}
