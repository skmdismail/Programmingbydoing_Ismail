package keyboardInput;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Flush {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a number "); int x=kb.nextInt();
		Pattern pat=kb.delimiter();
		//System.out.println(pat);
		kb.skip(pat);
		System.out.println("Enter a string "); String s=kb.nextLine();
		System.out.println(x+","+s);
		
	}

}
