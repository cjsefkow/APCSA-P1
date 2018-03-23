//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
		maze = new int[0][0];
	}

	public Maze(int size, String line)
	{
		//System.out.println(line);
		maze = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int n = 0; n < size; n++) {
				//System.out.print(line.charAt(((i*size)+n)*2));
				maze[i][n] = (int)line.charAt(((i*size)+n)*2);
			}
			//System.out.println("");
		}
	}

	public boolean hasExitPath(int r, int c)
	{
		maze[r][c] = 0;
		if (c == maze.length-1 || (r != maze.length-1 && maze[r+1][c] == 49 && hasExitPath(r+1, c)) 
							   || (r != 0 && maze[r-1][c] == 49 && hasExitPath(r-1, c)) 
							   || (c != maze.length-1 && maze[r][c+1] == 49 && hasExitPath(r, c+1)) 
							   || (c != 0 && maze[r][c-1] == 49 && hasExitPath(r, c-1)) ) {
			return true;
		}
		return false;
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < maze.length; i++) {
			for (int n = 0; n < maze.length; n++) {
				if (maze[i][n] == 49) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println("");
		}
		return output;
	}
}