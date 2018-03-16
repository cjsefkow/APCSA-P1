//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word18e implements Comparable<Word18e>
{
	private String word;

	public Word18e( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		
		for (int i = 0; i < word.length(); i++) {
			if (vowels.indexOf(word.charAt(i)) > 0) {
				vowelCount++;
			}
		}

		return vowelCount;
	}

	public int compareTo(Word18e rhs)
	{
		if (rhs.numVowels() > this.numVowels()) {
			return -1;
		} else if (rhs.numVowels() < this.numVowels()) {
			return 1;
		} else {
			for (int i = 0; i < word.length(); i++) {
				if ((int)rhs.toString().charAt(i) < (int)word.charAt(i)) {
					return 1;
				} else if ((int)rhs.toString().charAt(i) > (int)word.charAt(i)) {
					return -1;
				}
			}
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}