//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private String lookFor;

	public LetterRemover()
	{
		//call set
		sentence = "";
		lookFor = "";
	}

	//add in second constructor
	public LetterRemover(String sent, String ch)
	{
		//call set
		sentence = sent;
		lookFor = ch;
	}
	
	
	public void setRemover(String s, String rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		
		String newString = cleaned.replaceAll(lookFor, "");
		
		return newString;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}