package ifStatements;

import java.util.Scanner;

public class SpaceBoxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Please enter your current earth weight:  ");int w=kb.nextInt();
		
		System.out.println("I have information for the following planets:\n"
   +"\t1. Venus   2. Mars    3. Jupiter\n"
   +"\t4. Saturn  5. Uranus  6. Neptune");
		
		System.out.println("Which planet are you visiting? "); int p=kb.nextInt();
		
		double arr[]={.78,.39,2.65,1.17,1.05,1.23};
		
		System.out.println("Your weight would be "+ (w*arr[p-1])+" pounds on that planet.");
		
	}

}
