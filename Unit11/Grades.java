//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		String[] everything = gradeList.split(" ");
		grades = new double[Integer.parseInt(everything[0])];
		for (int i = 2; i < everything.length; i++) {
			grades[i-2] = Double.parseDouble(everything[i]);
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot] = grade;
	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = grades[0];
		for (int i = 1; i < grades.length; i++) {
			if (grades[i] < low) {
				low = grades[i];
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = grades[0];
		for (int i = 1; i < grades.length; i++) {
			if (grades[i] > high) {
				high = grades[i];
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output="";
		for (int i = 0; i < grades.length; i++) {
			output += grades[i];
			output += " ";
		}
		return output;
	}	
}