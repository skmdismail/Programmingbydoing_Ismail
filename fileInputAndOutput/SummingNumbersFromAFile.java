package fileInputAndOutput;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;


public class SummingNumbersFromAFile {

	    public static void main(String[] args) throws IOException {

	        Scanner s = null;
	        int sum = 0;
	        String fileName="numbers.txt";
	        
	            s = new Scanner(new BufferedReader(new FileReader(fileName)));
	            
	            while (s.hasNext()) {
	                if (s.hasNextInt()) {
	                    sum += s.nextInt();
	                } else {
	                    s.next();
	                }   
	            }

	            s.close();
	            System.out.println(sum);
	    }
}

