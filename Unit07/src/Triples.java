//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Arrays;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
		number = 0;
	}

	public Triples(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private Boolean greatestCommonFactor(int a, int b, int c)
	{
		for (int i = 2; i < c; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				return true;
			}
		}
		return false;
	}

	public String toString()
	{
		String output="";
		for (int t = 0; t <= number; t++) {
			int maxVal = t*t;
			for (int i = 1; i < Math.ceil(Math.sqrt(maxVal/2)); i++) {
				int thirdNum = (int)Math.sqrt(maxVal - i*i);
				if (!greatestCommonFactor(i*i, thirdNum, maxVal)) {
					if ((Math.sqrt(maxVal - i*i) % 2) != ((i*i) % 2)) {
						if ((double)Math.sqrt(maxVal - i*i) == (double)Math.round(Math.sqrt(maxVal - i*i))) {
							output += i + " " + thirdNum + " " + t + "\n";
						}
					}
				}
			}
		} return output;
	}
}
