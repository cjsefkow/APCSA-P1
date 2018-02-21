//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private int numOfGrades = 0;
	private double gradeArr[];
	
	public Grades() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number of grades: ");
		numOfGrades = Integer.parseInt(keyboard.nextLine());
		gradeArr = new double[numOfGrades];
		for (int i = 0; i < numOfGrades; i++) {
			System.out.print("Enter grade " + (i+1) + ": ");
			gradeArr[i] = Double.parseDouble(keyboard.nextLine());
		}
	}
	

	public void setGrades() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number of grades: ");
		numOfGrades = Integer.parseInt(keyboard.nextLine());
		gradeArr = new double[numOfGrades];
		for (int i = 0; i < numOfGrades; i++) {
			System.out.print("Enter grade " + (i+1) + ": ");
			gradeArr[i] = Double.parseDouble(keyboard.nextLine());
		}
	}



	private double getSum()
	{
		double sum=0.0;
		
		for (int i = 0; i < numOfGrades; i++) {
			sum += gradeArr[i];
		}
		
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;

		average = getSum()/numOfGrades;

		return average;
	}


	//toString method
	public String toString() {
		return "Average = " + Math.round(getAverage()*100.0)/100.0;
	}
}