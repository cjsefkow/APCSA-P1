//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\Unit12\\Unit12-2016\\Unit12-Assignments\\lab18e\\lab18e.dat"));

		int size = file.nextInt();

		Word18e[] words = new Word18e[size];
		
		int ct = 0;
		file.nextLine();
		while (file.hasNextLine()) {
			String str = file.nextLine();
			System.out.println(str);
			words[ct] = new Word18e(str);
			ct++;
		}
		
		for (int i = 0; i < words.length; i++) {
			for (int n = 0; n < words.length-1-i; n++) {
				if (words[n].compareTo(words[n+1]) > 0) {
					Word18e temp = words[n];
					words[n] = words[n+1];
					words[n+1] = temp;
				} else {
				}
			}
		}
		System.out.println("");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
}