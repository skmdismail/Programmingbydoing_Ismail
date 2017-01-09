package randomNumbers;
import java.util.Random;

public class Dice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HERE COMES THE DICE!");
		int r1=1+new Random().nextInt(6);
		int r2=1+new Random().nextInt(6);
		System.out.println("Roll #1:"+r1);
		System.out.println("Roll #2:"+r2);
		System.out.println("The total is "+ (r1+r2) );
	}

}
