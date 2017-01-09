package keyboardInput;
import java.util.Scanner;

public class TheForgetfulMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Give me a word!");
		kb.nextLine();
		System.out.println("Give me a second word!");
		kb.nextLine();
		System.out.println("Great, now your favorite number?");
		kb.nextLine();
		System.out.println("And your second-favorite number...");
		kb.nextLine();

	}

}
