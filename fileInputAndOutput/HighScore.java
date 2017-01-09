package fileInputAndOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class HighScore {

	public static void main(String[] args) throws IOException {
		
		  Scanner kb=new Scanner(System.in);
		  System.out.println("Enter score: ");
		  int score=kb.nextInt();
		  kb.skip("\n");
		  System.out.println("Enter name: ");
		  String name=kb.nextLine();
		  
	      FileOutputStream out = null;
	      out = new FileOutputStream("output.txt");
	      
	      //out.write(Integer.toString(score).getBytes());
	      out.write((score+"\n").getBytes());
	      out.write(name.getBytes());
	      
	      out.close();
	}
}
