//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char [0][0];
	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				mat[r][c] = game.charAt(r*3+c);
			}
		}
	}

	public String getWinner()
	{
		boolean isGoodSoFar;
		char checkingChar;
		// Horizontal
		for (int r = 0; r < mat.length; r++) {
			isGoodSoFar = true;
			checkingChar = mat[r][0];
			for (int c = 1; c < mat.length; c++) {
				if (isGoodSoFar && mat[r][c] != checkingChar) {
					isGoodSoFar = false;
				}
			}
			if (isGoodSoFar) { return Character.toString(checkingChar); }
		}
		
		// Vertical
		for (int c = 0; c < mat.length; c++) {
			isGoodSoFar = true;
			checkingChar = mat[0][c];
			for (int r = 1; r < mat.length; r++) {
				if (isGoodSoFar && mat[r][c] != checkingChar) {
					isGoodSoFar = false;
				}
			}
			if (isGoodSoFar) { return Character.toString(checkingChar); }
		}
		
		// Diagonal \
		isGoodSoFar = true;
		checkingChar = mat[0][0];
		for (int i = 1; i < mat.length; i++) {
			if (isGoodSoFar && mat[i][i] != checkingChar) {
				isGoodSoFar = false;
			}
		}
		if (isGoodSoFar) { return Character.toString(checkingChar); }
		
		// Diagonal /
		isGoodSoFar = true;
		checkingChar = mat[mat.length-1][0];
		for (int i = 1; i < mat.length; i++) {
			if (isGoodSoFar && mat[mat.length-1-i][i] != checkingChar) {
				isGoodSoFar = false;
			}
		}
		if (isGoodSoFar) { return Character.toString(checkingChar); }

		return "No winner";
	}

	public String toString()
	{
		String output="";

		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				output += mat[r][c];
			}
			output += "\n";
		}




		return output+"\n\n";
	}
}