package ifStatements;
import java.util.Scanner;

public class TheWorstNumberGuessingGameEver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int secret_num=4;
		System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
		System.out.println("I\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS! ");
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		if (num!=secret_num) {
			System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS "+secret_num+"!");
		} else  {
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS 4!");
		}
	}

}
