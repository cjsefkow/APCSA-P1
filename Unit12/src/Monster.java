//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor 
	
	public Monster() {
		myWeight = 0;
		myHeight = 0;
		myAge = 0;
	}

	//write an initialization constructor with an int parameter ht

	public Monster(int ht) {
		myWeight = 0;
		myHeight = ht;
		myAge = 0;
	}

	//write an initialization constructor with int parameters ht and wt

	public Monster(int ht, int wt) {
		myWeight = wt;
		myHeight = ht;
		myAge = 0;
	}

	//write an initialization constructor with int parameters ht, wt, and age

	public Monster(int ht, int wt, int age) {
		myWeight = wt;
		myHeight = ht;
		myAge = age;
	}

	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(getMyHeight(), getMyWeight(), getMyAge());
	}

	/**
	 * @return the myWeight
	 */
	public int getMyWeight() {
		return myWeight;
	}

	/**
	 * @param myWeight the myWeight to set
	 */
	public void setMyWeight(int myWeight) {
		this.myWeight = myWeight;
	}

	/**
	 * @return the myHeight
	 */
	public int getMyHeight() {
		return myHeight;
	}

	/**
	 * @param myHeight the myHeight to set
	 */
	public void setMyHeight(int myHeight) {
		this.myHeight = myHeight;
	}

	/**
	 * @return the myAge
	 */
	public int getMyAge() {
		return myAge;
	}

	/**
	 * @param myAge the myAge to set
	 */
	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}

	public boolean equals( Object obj )
	{
		Monster rhs = (Monster)obj;
		if (getMyHeight() == rhs.getMyHeight() &&
			getMyWeight() == rhs.getMyWeight() &&
			getMyAge() == rhs.getMyAge()) {
			return true;
		}
		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if (myHeight > rhs.getMyHeight()) {
			return 1;
		} else if (myHeight < rhs.getMyHeight()) {
			return -1;
		} else if (myWeight > rhs.getMyWeight()) {
			return 1;
		} else if (myWeight < rhs.getMyWeight()) {
			return -1;
		} else if (myAge > rhs.getMyAge()) {
			return 1;
		} else if (myAge < rhs.getMyAge()) {
			return -1;
		} else if (equals(rhs)) {
			return 0;
		}
 		return -1;
	}

	//write a toString() method
	
	public String toString() {
		return "" + getMyHeight() + "  " + getMyWeight() + "  " + getMyAge();
	}
	
	
}