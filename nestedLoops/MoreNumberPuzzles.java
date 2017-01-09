package nestedLoops;
import java.util.Scanner;

public class MoreNumberPuzzles {
	
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		
		int opt;
		do {
			System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
			System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
			System.out.println("3) Quit");
			opt=kb.nextInt();
			
			if(opt==1) digitsOne();
			else if(opt==2) digitsTwo();
			System.out.println("-----------------------------------------------");
		} while(opt!=3);
	}
	
	static void digitsOne() {
		for(int i=1;i<=5;++i)
			for(int j=0;j<=9;++j)
				if( (i*10 + j) <=56 ) {
					if(i+j>10)
					  System.out.println(i+" "+j);
				}
	}

	static void digitsTwo() {
		for(int i=1;i<=5;++i)
			for(int j=0;j<=9;++j) {
				int sum=i+j;
				int rev=j*10+i;
				int num=i*10+j;
						if(num-rev==sum)
							System.out.println(i+" "+j);
			}
				
				
	}


}
