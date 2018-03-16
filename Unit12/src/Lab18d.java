//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\Unit12\\Unit12-2016\\Unit12-Assignments\\lab18d\\lab18d.dat"));

		int size = file.nextInt();

		Word[] words = new Word[size];
		
		int ct = 0;
		file.nextLine();
		while (file.hasNextLine()) {
			String str = file.nextLine();
			System.out.println(str);
			words[ct] = new Word(str);
			ct++;
		}
		
		for (int i = 0; i < words.length; i++) {
			for (int n = 0; n < words.length-1-i; n++) {
				if (words[n].compareTo(words[n+1]) > 0) {
					Word temp = words[n];
					words[n] = words[n+1];
					words[n+1] = temp;
				}
			}
		}
		System.out.println("");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
}