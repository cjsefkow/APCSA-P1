//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover test = new LetterRemover("I am Sam I am", "a");
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("\n\n");
		test.setRemover("ssssssssxssssesssssesss", "s");
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("\n\n");
		test.setRemover("qwertyqwertyqwerty", "a");
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("\n\n");
		test.setRemover("abababababa", "b");
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("\n\n");
		test.setRemover("abaababababa", "x");
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
											
	}
}