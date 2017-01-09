package whileLoops;

import java.util.Random;

public class DiceDoubles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HERE COMES THE DICE!");
		int r1,r2;
		
		do {
			r1=1+new Random().nextInt(6);
			r2=1+new Random().nextInt(6);
			System.out.println("Roll #1:"+r1);
			System.out.println("Roll #2:"+r2);
			System.out.println("The total is "+ (r1+r2) );
		} while(r1!=r2);
	}
}
