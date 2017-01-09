package randomNumbers;
import java.util.Random;

public class FortuneCookie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fortune cookie says: \"You will find happiness with a new love.\"");
		System.out.println("Fortune cookie says: \"Stick with your wife.\"");
		int n=6;
		while( n>0 ) {
			--n;
			System.out.print(1+new Random().nextInt(54) + "-");
		}
		
	}

}
