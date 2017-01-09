package keyboardInput;

import java.util.Scanner;

public class BMICalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Your height in m: "); double h=kb.nextDouble();
		System.out.println("Your weight in kg:  "); double w=kb.nextDouble();
		//System.out.println("Your BMI is "+ (w/(h*h)));
		System.out.printf("Your BMI is %.6f", (w/(h*h)));
	}

}
