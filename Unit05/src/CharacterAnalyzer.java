//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = ' ';
	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (theChar >= 65 && theChar <= 90) {
			return true;
		}
		return false;
	}

	public boolean isLower( )
	{
		if (theChar >= 97 && theChar <= 122) {
			return true;
		}
		return false;
	}
	
	public boolean isNumber( )
	{
		if (theChar >= 48 && theChar <= 57) {
			return true;
		}
		return false;
	}	

	public int getASCII( )
	{
		return (int) theChar;
	}

	public String toString()
	{
		if (isUpper()) {
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		} else if (isLower()) {
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		} else if (isNumber()) {
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}   return ""+getChar() + " is not a number or letter. ASCII == " + getASCII() + "\n";
	}
}