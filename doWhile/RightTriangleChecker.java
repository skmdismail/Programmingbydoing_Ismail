package doWhile;
import java.util.Scanner;

public class RightTriangleChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		
		System.out.println("Enter three integers:");
		boolean valuesCorrect=false;
		int s1,s2,s3;
		
		do {
			System.out.println("Side 1: "); s1=kb.nextInt();
			
			do {
				System.out.println("Side 2: "); s2=kb.nextInt();
				if (s2 < s1 ) {
					System.out.println(s2+" is smaller than "+s1+".  Try again");
				}
			} while(s2<s1);
			
			do {
				System.out.println("Side 3: "); s3=kb.nextInt();
				if (s3 < s2 ) {
					System.out.println(s3+" is smaller than "+s2+".  Try again");
				}
			} while(s3<s2);
			
			valuesCorrect=true;
		}while(valuesCorrect==false);
		
		System.out.println("Your three sides are "+s1+" "+s2+" "+s3);
		
		if(s3*s3 == (s2*s2 + s1*s1) ) {
			System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
		} else  {
			System.out.println("NO!  These sides do not make a right triangle!");
		}
	}

}
