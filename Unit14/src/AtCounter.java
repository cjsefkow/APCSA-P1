//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
							 {'@','@','@','-','@','@','-','@','-','@'},
							 {'-','-','-','-','-','-','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','-','@'},
							 {'-','@','-','@','-','@','-','@','-','@'},
							 {'@','@','@','@','@','@','-','@','@','@'},
							 {'-','@','-','@','-','@','-','-','-','@'},
							 {'-','@','@','@','-','@','-','-','-','-'},
							 {'-','@','-','@','-','@','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		if (r >= 0 && c >= 0 && r < atMat.length && c < atMat[0].length) {
			if (atMat[r][c] == '@') {
				atMat[r][c]='!';
				return 1+countAts(r+1,c)+countAts(r-1,c)+countAts(r,c+1)+countAts(r,c-1);
			} 
		}
		return 0;
	}
	
	public void resetBoard() {
		for (int i = 0; i < atMat.length; i++) {
			for (int n = 0; n < atMat[0].length; n++) {
				if (atMat[i][n] == '!') {
					atMat[i][n] = '@';
				}
			}
		}
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}