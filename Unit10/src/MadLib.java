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

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	private String toReturn = "";
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		
		toReturn = "";
		
	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		loadSomething(nouns, "H:\\APCSA-P1 - Completed files stored here\\Unit10\\src\\nouns.dat");
		loadSomething(verbs, "H:\\APCSA-P1 - Completed files stored here\\Unit10\\src\\verbs.dat");
		loadSomething(adjectives, "H:\\APCSA-P1 - Completed files stored here\\Unit10\\src\\adjectives.dat");
		
		try {
			Scanner file = new Scanner(new File(fileName));	
			while (file.hasNext()) {
				String sym = file.next();
				if (sym.equals("&")) {
					toReturn += getRandomWordFrom(adjectives);
				} else if (sym.equals("@")) {
					toReturn += getRandomWordFrom(verbs);
				} else if (sym.equals("#")) {
					toReturn += getRandomWordFrom(nouns);
				} else {
					toReturn += sym;
				}
				toReturn += " ";
			}
			
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}
	
	public void loadSomething(ArrayList<String> thing, String place) {
		try {
			Scanner x = new Scanner(new File(place));
			while (x.hasNextLine()) {
				thing.add(x.nextLine());
			}
		}
		catch(Exception e) {
			System.out.println(thing + " not loaded correctly");
		}
	}
	
	public String getRandomWordFrom(ArrayList<String> from) {
		return from.get((int)Math.floor(Math.random()*from.size()));
	}

	public String toString()
	{
	   return toReturn;
	}
}