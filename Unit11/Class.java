//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name = "";
		studentList = new ArrayList<Student>();
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum, s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;

		for (int i = 0; i < studentList.size(); i++) {
			classAverage += studentList.get(i).getAverage();
		}

		return classAverage / studentList.size();
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getName() == stuName) {
				return studentList.get(i).getAverage();
			}
		}
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}
	
	public void sort() {
		for (int i = 0; i < studentList.size() - 1; i++) {
			for (int n = 0; n < studentList.size() - i - 1; n++) {
				if (studentList.get(n).compareTo(studentList.get(n+1)) == -1) {
					Student temp = studentList.get(n);
					studentList.set(n, studentList.get(n+1));
					studentList.set(n+1, temp);
				}
			}
		}
	}

	public String getStudentWithHighestAverage()
	{
		sort();
		return studentList.get(0).toString();
	}

	public String getStudentWithLowestAverage()
	{
		sort();
		return studentList.get(studentList.size()-1).toString();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getAverage() < 60) {
				output += studentList.get(i).getName() + " ";
			}
		}
		
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		System.out.println(studentList.size());
		for (int i = 0; i < studentList.size(); i++) {
			output += studentList.get(i).toString() + "\n";
		}



		return output;
	}  	
}