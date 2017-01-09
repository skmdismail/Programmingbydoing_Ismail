package functions;
import java.util.Scanner;

public class RefresherChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb=new Scanner(System.in);
		System.out.println("Enter name ");
		String name=kb.nextLine();
		int n=10;
		if( name.equals("Mitchell") ) { 
			n=5; name="Mitchell";
		}
		for(int i=1;i<=n;++i)
			System.out.println(name);
	}

}
