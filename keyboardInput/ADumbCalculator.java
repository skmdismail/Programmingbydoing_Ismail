package keyboardInput;
import java.util.Scanner;
public class ADumbCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("What is your first number? "); double n1=kb.nextDouble();
		System.out.println("What is your second number? "); double n2=kb.nextDouble();
		System.out.println("What is your third number? "); double n3=kb.nextDouble();
		System.out.println("( "+n1+" + "+n2+" + "+n3+" ) / 2 is... "+(n1+n2+n3)/3);
	}

}
