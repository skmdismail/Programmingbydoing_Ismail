package ifStatements;

import java.util.Scanner;

public class BMICategories {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Your height in m: "); double h=kb.nextDouble();
		System.out.println("Your weight in kg:  "); double w=kb.nextDouble(),BMI=w/(h*h);

		if ( BMI < 18.5 ) {
			System.out.println("under weight");
		}
		else if ( BMI < 25 ) {
			System.out.println("normal weight");
		}
		else if ( BMI < 30 ) {
			System.out.println("over weight");
		}
		else {
			System.out.println("obese");
		}

	}

}
