//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 0;
		letter = "";
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}
	
	public void setVars(int count, String let) {
		size = count;
		letter = let;
	}

	public String setTriangle( String let, int sz )
	{
		String output = "";
		for (int i = 0; i < size; i++) {
			for (int n = size; n > i+1; n--) {
				output+=" ";
			}
			for (int n = 0; n <= i; n++) {
				output+=letter;
			}
			output += "\n";
		}
		return output;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output = setTriangle(letter, size);
		return output+"\n";
	}
}