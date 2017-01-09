package ifStatements;

import java.util.Scanner;

public class TwoQuestions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("TWO QUESTIONS!\n"
					+"Think of an object, and I'll try to guess it.");
		System.out.println("Question 1) Is it animal, vegetable, or mineral?\n> ");
		
		Scanner kb=new Scanner(System.in);
		String object=kb.nextLine();
		
		System.out.println("Question 2) Is it bigger than a breadbox?\n>");
		String size=kb.nextLine();
		
		String data[][]={  	{"animal","squirrel","moose" },
							{"vegetable","carrot","watermelon"},
							{"mineral","paper clip","truck"}
		};
		
		for(int i=0;i<3;++i) {
			if( object.compareToIgnoreCase(data[i][0]) == 0 ) {
				if (size.compareToIgnoreCase("yes") == 0 )
					System.out.println ("My guess is that you are thinking of a "+data[i][1]);
				else
					System.out.println ("My guess is that you are thinking of a "+data[i][2]);
					
			}
		}
		
	}

}
