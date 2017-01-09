package keyboardInput;

import java.util.Scanner;

public class AgeinFiveYears {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Hello.  What is your name? "); String name=kb.nextLine();
		System.out.println("Hi, "+name+"!  How old are you? ");int age=kb.nextInt();
		System.out.println("Did you know that in five years you will be "+ (age+5) +" years old?"
+"And five years ago you were "+ (age-5) +"! Imagine that!");
	}

}
