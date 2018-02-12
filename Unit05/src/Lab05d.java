//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		char letter;
		
		for (int i = 0; i < 9; i++) {
			out.print("Enter a letter :: ");
			letter = keyboard.next().charAt(0);
			CharacterAnalyzer test = new CharacterAnalyzer(letter);
			out.println(test);
		}
	}
}