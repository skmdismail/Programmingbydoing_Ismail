package randomNumbers;
import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n"
							+"He glances at you out of the corner of his eye and starts shuffling.\n"
							+"He lays down three cards.\n"
							+"Which one is the ace?\n"
							+"##  ##  ##\n"
							+"##  ##  ##\n"
							+"1   2   3\n"					
							
				);
		
		int ace=1+new Random().nextInt(3);
		int card=new Scanner(System.in).nextInt();
		
		if(ace!=card) {
			System.out.println("Ha! Fast Eddie wins again! The ace was card number "+ace);
			if(ace==1) {
				System.out.println(	 "AA  ##  ##\n"
									+"AA  ##  ##\n"
									+"1   2   3\n"
								  );
			}
			if(ace==2) {
				System.out.println(	 "##  AA  ##\n"
									+"##  AA  ##\n"
									+"1   2   3\n"
								  );
			}
			if(ace==3) {
				System.out.println(	 "##  ##  AA\n"
									+"##  ##  AA\n"
									+"1   2   3\n"
								  );
			}
			
		}
		else  {
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
			if(ace==1) {
				System.out.println(	 "AA  ##  ##\n"
									+"AA  ##  ##\n"
									+"1   2   3\n"
								  );
			}
			if(ace==2) {
				System.out.println(	 "##  AA  ##\n"
									+"##  AA  ##\n"
									+"1   2   3\n"
								  );
			}
			if(ace==3) {
				System.out.println(	 "##  ##  AA\n"
									+"##  ##  AA\n"
									+"1   2   3\n"
								  );
			}
			
		}
		
	}

}
