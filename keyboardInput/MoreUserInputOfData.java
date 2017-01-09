package keyboardInput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MoreUserInputOfData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		kb.useDelimiter("\n");
		
		String first_name;
		String last_name;
		int grade;
		int student_id_number;
		String login_name;
		double GPA;
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.println("First name: "); first_name=kb.nextLine();
		System.out.println("Last name: "); last_name=kb.nextLine();
		System.out.println("Grade (9-12): "); grade=kb.nextInt();
		System.out.println("Student ID: "); student_id_number=kb.nextInt();
		
		Pattern pat=kb.delimiter();
		kb.skip(pat);
		System.out.println("Login: "); login_name=kb.nextLine();
		
		System.out.println("GPA (0.0-4.0): "); GPA=kb.nextDouble();
		
		System.out.println("Your information: ");
		System.out.println("	Login: "+login_name);
		System.out.println("	ID: "+student_id_number);
		System.out.println("	Name: "+first_name+", "+last_name);
		System.out.println("	GPA: "+GPA);
		System.out.println("	Grade: "+grade);

	}

}
