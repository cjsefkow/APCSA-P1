//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner( new File("H:\\APCSA-P1 - Completed files stored here\\Unit13\\src\\lab15d.dat"));
		int n = file.nextInt();
		file.nextLine();
		FancyWords test;
		for (int i = 0; i < n; i++) {
			test = new FancyWords(file.nextLine());
			System.out.println(test);
		}
	}
}