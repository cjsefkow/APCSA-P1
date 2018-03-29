//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(int[] list)
	{
		int low = 0;
		int high = list.length - 1;
		for (int item : list) { System.out.print(item + " "); }
		int split;
		if (low < high) {
			split = partition(list, low, high);
			quickSort(list, low, split);
			quickSort(list, split+1, high);
		}
		for (int item : list) { System.out.print(item + " "); };
	}


	private static void quickSort(int[] list, int low, int high)
	{
		for (int item : list) { System.out.print(item + " "); };
		int split;
		if (low < high) {
			split = partition(list, low, high);
			quickSort(list, low, split-1);
			quickSort(list, split+1, high);
		}
		for (int item : list) { System.out.print(item + " "); };
	}


	private static int partition(int[] list, int low, int high)
	{
		System.out.println(" ");
		System.out.println(" ");
		int pivot = list[low];
		int bot = low+1;
		int top = high;
		System.out.print("Partitioning... Pivot is " + pivot + ", going from " + bot + " to " + top);
		int temp;
		
		if (top - bot == 1) {
			if (list[top] < list[bot]) {
				temp = list[top];
				list[top] = list[bot];
				list[bot] = temp;
			}
			return top;
		}
		
		while (top > bot) {
			System.out.println(" ");
			System.out.println("Pivot is " + pivot + ", bot is " + bot + " (value = " + list[bot] + "), top is " + top + " (value = " + list[top] + ")");
			if (list[top] < pivot && list[bot] > pivot) {
				System.out.println("Swapping bottom and top");
				for (int item : list) { System.out.print(item + " "); };
				System.out.println(" ");
				temp = list[top];
				list[top] = list[bot];
				list[bot] = temp;
			} else {
				System.out.println(pivot);
				System.out.println(list[top]);
				System.out.println(list[bot]);
				if (list[top] > pivot) {
					top--;
					System.out.println("Decrementing top");
				}
				if (top == bot) break;
				if (list[bot] < pivot) {
					System.out.println("Incrementing bottom");
					bot++;
				}
			}
		}
		temp = pivot;
		list[0] = list[bot];
		list[bot] = temp;
		System.out.print("After: ");
		for (int item : list) { System.out.print(item + " "); };
		System.out.println(" ");
		return bot;
	}
}