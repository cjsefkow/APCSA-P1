//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("H:\\APCSA-P1 - Completed files stored here\\Unit14\\src\\lab24d.dat"));
		int size = file.nextInt();
		file.nextLine();
		TicTacToe test = new TicTacToe();
		
		for (int i = 0; i < size; i++) {
			test = new TicTacToe(file.next());
			System.out.println(test.getWinner());
			System.out.println(test.toString());
		}
		
	}
}



