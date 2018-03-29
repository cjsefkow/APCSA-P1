//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>();
	}

	//Modifiers
	public void add( String   word)
	{
		int loc = 0;
		while (list.size() > loc && word.compareTo(list.get(loc)) > 0) {
			loc++;
		}
		list.add(loc, word);
	}


	public void remove(String word)
	{
		if (list.indexOf(word) >= 0) list.remove(list.indexOf(word));
	}

	public String toString()
	{
		return list.toString();
	}
}