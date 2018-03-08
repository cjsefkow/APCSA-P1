//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		fileName = "";
		letters = new ArrayList<Character>();
		count = new ArrayList<Integer>();
	}
	
	public Histogram(char[] values, String fName)
	{
		fileName = fName;
		letters = new ArrayList<Character>();
		count = new ArrayList<Integer>();
		
		
		for (int i = 0; i < values.length; i++) {
			letters.add(values[i]);
			count.add(0);
		}
		
		
		out.println("search letters = " + letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner file = new Scanner(new File(fileName));
		while (file.hasNext()) {
			String nextWord = file.next();
			for (int i = 0; i < nextWord.length(); i++) {
				if (letters.contains(nextWord.charAt(i)))
					count.set(letters.indexOf(nextWord.charAt(i)), count.get(letters.indexOf(nextWord.charAt(i)))+1);
			}
		}
	}

	public char mostFrequent()
	{
		char largest = letters.get(0);
		for (int i = 1; i < count.size(); i++) {
			if (count.get(i) > largest)
				largest = letters.get(i);
		}
		return largest;
	}

	public char leastFrequent()
	{
		char smallest = letters.get(0);
		for (int i = 1; i < count.size(); i++) {
			if (count.get(i) < smallest)
				smallest = letters.get(i);
		}
		return smallest;
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}