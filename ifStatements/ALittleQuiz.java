package ifStatements;
import java.util.Scanner;

public class ALittleQuiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Are you ready for a quiz? ");
		char ch=(char)kb.next().charAt(0);
		
		if(ch=='n'||ch=='N') 
			System.exit(1);
		
		int score=0;
		
		System.out.println("Q1) What is the capital of Alaska?\n"
	+"\t1) Melbourne"
	+"\t2) Anchorage"
	+"\t3) Juneau ");
		int ans=kb.nextInt();
		if(ans==3) {
			System.out.println("That's right!"); ++score;
		}
		else {
			System.out.println("That's wrong!");
		}
		
		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?\n"
	+"\t1) yes"
	+"\t2) no");
		ans=kb.nextInt();
		if(ans==1) {
			System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
		}
		else {
			System.out.println("That's right!"); ++score;
		}
		
		System.out.println("Q3) What is the result of 9+6/3?\n"
	+"\t1) 5"
	+"\t2) 11" 
	+"\t3) 15/3");
		ans=kb.nextInt();
		if(ans==2) {
			System.out.println("That's correct!"); ++score;
		}
		else {
			System.out.println("That's wrong!");
		}
		
		System.out.println("Overall, you got "+score+" out of 3 correct.\n"
+"Thanks for playing!");
	}

}
