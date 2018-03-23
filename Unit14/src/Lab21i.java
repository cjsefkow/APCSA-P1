//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner mazeFile = new Scanner(new File("H:\\APCSA-P1 - Completed files stored here\\Unit14\\src\\lab21i.dat"));
		int intToSend;
		String toSend;
		intToSend = mazeFile.nextInt();
		toSend = mazeFile.nextLine();
		toSend = mazeFile.nextLine();
		
		Maze test = new Maze(intToSend, toSend);
		System.out.print(test.toString());
		System.out.println(test.hasExitPath(0, 0));
		
		intToSend = mazeFile.nextInt();
		toSend = mazeFile.nextLine();
		toSend = mazeFile.nextLine();
		
		test = new Maze(intToSend, toSend);
		System.out.println("");
		System.out.print(test.toString());
		System.out.println(test.hasExitPath(0, 0));
		
		intToSend = mazeFile.nextInt();
		toSend = mazeFile.nextLine();
		toSend = mazeFile.nextLine();
		
		test = new Maze(intToSend, toSend);
		System.out.println("");
		System.out.print(test.toString());
		System.out.println(test.hasExitPath(0, 0));
		
		intToSend = mazeFile.nextInt();
		toSend = mazeFile.nextLine();
		toSend = mazeFile.nextLine();
		
		test = new Maze(intToSend, toSend);
		System.out.println("");
		System.out.print(test.toString());
		System.out.println(test.hasExitPath(0, 0));
		
		intToSend = mazeFile.nextInt();
		toSend = mazeFile.nextLine();
		toSend = mazeFile.nextLine();
		
		test = new Maze(intToSend, toSend);
		System.out.println("");
		System.out.print(test.toString());
		System.out.println(test.hasExitPath(0, 0));
		
		intToSend = mazeFile.nextInt();
		toSend = mazeFile.nextLine();
		toSend = mazeFile.nextLine();
		
		test = new Maze(intToSend, toSend);
		System.out.println("");
		System.out.print(test.toString());
		System.out.println(test.hasExitPath(0, 0));
	}
}