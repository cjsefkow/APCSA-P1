//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;
	private String[] sentenceArray;

	public FancyWords(String sentence)
	{
		sentenceArray = sentence.split(" ");
		int longestWord = sentenceArray[0].length();
		for (int i = 0; i < sentenceArray.length; i++) {
			if (sentenceArray[i].length() > longestWord) longestWord = sentenceArray[i].length();
		}
		for (int i = 0; i < sentenceArray.length; i++) {
			while (sentenceArray[i].length() < longestWord) {
				sentenceArray[i] = " " + sentenceArray[i];
			}
		}
		wordRay = new String[longestWord];
		setWords(sentence);
	}

	public void setWords(String sentence) {
		for (int i = 0; i < wordRay.length; i++) {
			String str = "";
			for (int n = sentenceArray.length-1; n >= 0; n--) {
				str += sentenceArray[n].charAt(i);
			}
			wordRay[wordRay.length-1-i] = str;
		}
	}

	public String toString()
	{
		String output="";
		
		for (int i = 0; i < wordRay.length; i++) {
			output += wordRay[i] + "\n";
		}
		
		return output+"\n\n";
	}
}