//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Arrays;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;
		number = 0;
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;
		roman = "";
	}

	public void setNumber(Integer num)
	{
		number = num;
		roman = "";
	}

	public void setRoman(String rom)
	{
		roman = rom;
		number = 0;
	}

	public Integer getNumber()
	{
		while (roman.length() > 0) {
			for (int i = 0; i < LETTERS.length; i++) {
				if (roman.indexOf(LETTERS[i]) == 0) {
					roman = roman.substring(LETTERS[i].length());
					number += NUMBERS[i];
					i = -1;
				}
			}
		} 
		return number;
	}

	public String toString()
	{
		while (number > 0) {
			for (int i = 0; i < NUMBERS.length; i++) {
				if (number >= NUMBERS[i]) {
					number -= NUMBERS[i];
					roman += LETTERS[i];
					i = -1;
				}
				if (number == 1) {
					return roman + "I";
				}
			}
		}
		
		return roman;
	}
}