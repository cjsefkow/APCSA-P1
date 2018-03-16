//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;
	}

	public int compareTo(Word rhs)
	{
		if (rhs.toString().length() < word.length()) {
			return 1;
		} else if (rhs.toString().length() > word.length()) {
			return -1;
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