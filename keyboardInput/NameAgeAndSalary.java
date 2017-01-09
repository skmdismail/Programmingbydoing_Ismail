package keyboardInput;
import java.util.Scanner;

public class NameAgeAndSalary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Hello.  What is your name?");
		String name=kb.nextLine();
		System.out.println("Hi, "+name+"!  How old are you?");
		int age=kb.nextInt();
		System.out.println("So you're "+age+", eh?  That's not old at all!"				
				+"How much do you make, "+name+"?");
		double sal=kb.nextDouble();
		System.out.println(sal+"!  I hope that's per hour and not per year! LOL!");
	}
}
