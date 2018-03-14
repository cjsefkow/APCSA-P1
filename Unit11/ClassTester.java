//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.io.File;

public class ClassTester
{
   public static void main( String args[] )
   {
	    String stuString = "";
		try {
			Scanner students = new Scanner(new File("H:\\Unit11\\Unit11-2016\\Unit11-Assignments\\Lab19b\\gradebook.dat"));
			while (students.hasNextLine()) {
				stuString += students.nextLine();
				stuString += "!!!";
			}
		} catch(Exception e) {
			System.out.println("Grades not loaded correctly");
		}
		
		String[] stuArray = stuString.split("!!!");
		Class test = new Class(stuArray[0], Integer.parseInt(stuArray[1]));
		
		for (int i = 2; i < 2 + (Integer.parseInt(stuArray[1]) * 2); i+=2) {
			test.addStudent(i/2 - 1, new Student(stuArray[i], stuArray[i+1]));
		}
				
		System.out.println(test.getStudentName(1));
		out.println(test);
		test.sort();
		out.println("Sorted: ");
		out.println(test);
		
		out.println(String.format(test.getStudentName(0) + "\'s average = %.2f",test.getStudentAverage(0)));	
		out.println(String.format(test.getStudentName(1) + "\'s average = %.2f",test.getStudentAverage(1)));	
		out.println(String.format(test.getStudentName(2) + "\'s average %.2f",test.getStudentAverage(2)));	
		
		out.println(String.format("Marky\'s average %.2f",test.getStudentAverage("Marky")));	

		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",test.getClassAverage()));		
		
		Class[] arrayOfClasses = new Class[3];
		
		//6.2 array of classes
		arrayOfClasses[0] = test;
		arrayOfClasses[1] = new Class("AP Calc AB", 40);
		arrayOfClasses[2] = new Class("APUSH", 36);
		
		
	}		
}