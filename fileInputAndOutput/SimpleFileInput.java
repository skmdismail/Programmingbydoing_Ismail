package fileInputAndOutput;
import java.io.FileInputStream;
import java.io.IOException;

public class SimpleFileInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in=new FileInputStream("input.txt");

		int c;
			while ( (c=in.read()) != -1 )
			System.out.print((char)c);
			
		in.close();
	}

}
