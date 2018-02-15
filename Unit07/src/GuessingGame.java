//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		int[] numbers = new int[upperBound];
		int count = 1;
		while (count <= upperBound) {
			numbers[count-1] = count;
			count++;
		}
		int correct = numbers[(int)(Math.floor(Math.random() * (double)numbers.length))];
		Scanner keyboard = new Scanner(System.in);
		out.printf("Enter a number between 1 and %d ", upperBound);
		int guess = Integer.parseInt(keyboard.nextLine());
		int guessCount = 1;
		while (guess != correct) {
			if (guess > correct) {
				System.out.println("Too high");
			} else {
				System.out.println("Too low");
			}
			out.printf("Enter a number between 1 and %d ", upperBound);
			guess = Integer.parseInt(keyboard.nextLine());
			guessCount++;
		}
		out.printf("It took %d guesses to guess %d.\n", guessCount, correct);
		out.printf("You guessed wrong %.2f percent of the time.", 100.0 - 100.0/(double)guessCount);
	}

	public String toString()
	{
		String output="";
		return output;
	}
}