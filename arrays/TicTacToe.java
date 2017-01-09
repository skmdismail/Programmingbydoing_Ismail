package arrays;
import java.util.Scanner;

public class TicTacToe {

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int fills=0;

		initBoard();
		displayBoard();
		System.out.println("(...a game already in progress)");
		
		do {
			System.out.println("'O', choose your location (row, column):");
			int r=keyboard.nextInt();
			int c=keyboard.nextInt();
			board[r][c]='O';
			displayBoard();
			++fills;
			
			if(checkWin('O')) {
				System.out.println("'O' Wins :)");
				System.exit(0);
			}
			
			System.out.println("'X', choose your location (row, column):");
			r=keyboard.nextInt();
			c=keyboard.nextInt();
			board[r][c]='X';		
			displayBoard();
			++fills;
			
			if(checkWin('X')) {
				System.out.println("'X' Wins :)");
				System.exit(0);
			}
			
		} while(fills<10);
		
		System.out.println("The game is a tie.");
	}
	
	public static boolean checkWin(char ch) {
		int continuous=0;
		
		for ( int r=0; r<3; r++ ) {
			for ( int c=0; c<3; c++ ) {
				if(board[r][c] == ch) {
					++continuous;
				}
				if( continuous ==3 ) {
					return true;
				}
			}
		}
		
		continuous=0;
		for ( int r=0; r<3; r++ ) {
			for ( int c=0; c<3; c++ ) {
				if(board[c][r] == ch) {
					++continuous;
				}
				if( continuous ==3 ) {
					return true;
				}
			}
		}

		continuous=0;
		for ( int r=0; r<3; r++ ) {
			for ( int c=0; c<3; c++ ) {
				if(r==c && board[c][r] == ch) {
					++continuous;
				}
				if( continuous ==3 ) {
					return true;
				}
			}
		}
		
		continuous=0;
		for ( int r=0; r<3; r++ ) {
			for ( int c=0; c<3; c++ ) {
				if((r+c==2) && board[c][r] == ch) {
					++continuous;
				}
				if( continuous ==3 ) {
					return true;
				}
			}
		}
		
		return false;
	}

	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}


	public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}
	
}
