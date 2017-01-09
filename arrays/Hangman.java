package arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
	
	public static String playHangman() {
		
		Scanner kb=new Scanner(System.in);
		String words[]={"apple","mississippi","eleven","elephant","fill","umbrella"};
		String toGuess=words[new Random().nextInt(5)];
		
		int len=toGuess.length(),n=len;
		char guesses[]=new char[len];
		for(int i=0;i<len;++i)
			guesses[i]='-';
		
		String misses="";
		
		do {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.print("Word: "); printGuess(guesses,len);
			System.out.print("Misses: "+misses); 
			System.out.print("\nGuess: "); char ch=kb.next().charAt(0);
			
			int index=toGuess.indexOf(ch);
			
				if(index==-1) 
						misses+=ch;
				else 
					do {
						guesses[index]=ch;
						index=toGuess.indexOf(ch, index+1);
					} while(index!=-1);						
				
			if( toGuess.equals(new String(guesses))) {
				System.out.println("YOU GOT IT!");
				System.out.print("Word: "); printGuess(guesses,len);
				
				System.out.println("Play \"again\" or \"quit\"? quit");
				return kb.next();
			}
				
			--n;
		} while(2*n>0); // 2*n is number of attempts allowed
		
		System.out.println("Sorry :( your attempts lapse");
		
		System.out.println("Play \"again\" or \"quit\"? quit");
		return kb.next();
    }
	
	public static void main(String[] args) {
		
		while( playHangman().equals("again") ) ;
		
		System.out.println("Thank you for playing.");
	}
	
	public static void printGuess(char a[],int n) {
		for(int i=0;i<n;++i)
			System.out.print(a[i]);
		
		System.out.print('\n');
	}

}
