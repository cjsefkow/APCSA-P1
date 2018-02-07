//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
	public static void main( String[] args )
    {
	    //add test cases
		
		Line testLine = new Line();
		
		testLine.setCoordinates(1, 9, 14, 2);
		testLine.calculateSlope();
		testLine.print();
		
		testLine.setCoordinates(1, 7, 18, 3);
		testLine.calculateSlope();
		testLine.print();
		
		testLine.setCoordinates(6, 4, 2, 2);
		testLine.calculateSlope();
		testLine.print();
		
		testLine.setCoordinates(4, 4, 5, 3);
		testLine.calculateSlope();
		testLine.print();
		
		testLine.setCoordinates(1, 1, 2, 9);
		testLine.calculateSlope();
		testLine.print();
		
	}
}