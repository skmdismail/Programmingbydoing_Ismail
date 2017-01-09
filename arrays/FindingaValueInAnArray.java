package arrays;

import java.util.Random;
import java.util.Scanner;

public class FindingaValueInAnArray {
	
	public static void main(String[] args) {
		
		int arr[] =  new int[10];
		Random r = new Random();
		for(int i=0;i<10;++i)
			arr[i]=r.nextInt(50)+1;
		
		for(int i=0;i<10;++i)
			System.out.print(arr[i]+" ");
		
		System.out.println("\nValue to find : ");
		int v=new Scanner(System.in).nextInt();
		
		for(int i=0;i<10;++i)
			if( v== arr[i] )
				System.out.println(arr[i]+" is in the array");
		
	}

}
