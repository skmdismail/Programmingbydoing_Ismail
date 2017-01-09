package fileInputAndOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class DisplayingAFile {
	
	public static void main(String[] args) throws IOException {
        
			System.out.println("Open which file:");
			String fileName=new Scanner(System.in).nextLine();
        
            Scanner s = new Scanner(new BufferedReader(new FileReader(fileName)));
            
            while (s.hasNext()) {
            	System.out.println(s.nextLine());
            }

            s.close();
    }
}
