/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
	public static void testZeroBlue()
	  {
	    Picture beach = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\beach.jpg");
	    beach.explore();
	    beach.zeroBlue();
	    beach.explore();
	  }

	public static void testKeepOnlyBlue()
	  {
	    Picture beach = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
	  }

	public static void testNegate()
	  {
	    Picture beach = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\beach.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore();
	  }
	
	public static void testGrayscale()
	  {
	    Picture beach = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\beach.jpg");
	    beach.explore();
	    beach.grayscale();
	    beach.explore();
	  }
	
	public static void testFixUnderwater()
	  {
	    Picture beach = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\water.jpg");
	    beach.explore();
	    beach.fixUnderwater();
	    beach.explore();
	  }
  
	/** Method to test mirrorVertical */
	  public static void testMirrorVertical()
	  {
	    Picture caterpillar = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\beach.jpg");
	    //caterpillar.explore();
	    caterpillar.mirrorVertical();
	    caterpillar.explore();
	  }
	  
	  /** Method to test mirrorVerticalRightToLeft */
	  public static void testMirrorVerticalRightToLeft()
	  {
	    Picture caterpillar = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\beach.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();
	  }
	  
	  public static void testMirrorHorizontal()
	  {
	    Picture caterpillar = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\beach.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorHorizontal();
	    caterpillar.explore();
	  }
	  
	  public static void testMirrorHorizontalBotToTop()
	  {
	    Picture caterpillar = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\beach.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorHorizontalBotToTop();
	    caterpillar.explore();
	  }
	  
	  public static void testMirrorDiagonal()
	  {
	    Picture caterpillar = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\beach.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorDiagonal();
	    caterpillar.explore();
	  }
  
  /** Method to test mirrorTemple */
	  public static void testMirrorTemple()
	  {
	    Picture temple = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\temple.jpg");
	    temple.explore();
	    temple.mirrorTemple();
	    temple.explore();
	  }
	  
	  public static void testMirrorGull()
	  {
	    Picture temple = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\seagull.jpg");
	    temple.explore();
	    temple.mirrorGull();
	    temple.explore();
	  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\swan.jpg");
    swan.edgeDetection();
    swan.explore();
  }
  
  public static void testSharpen(int x, int y, int w, int h)
  {
       Picture redMoto = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\redMotorcycle.jpg");
       // sharpen method begins on line 437 of picture.java
       redMoto.sharpen(x,y,w,h);
       redMoto.explore();
  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
	  
	//params:  upper left row, col, width, height
	testSharpen(50,50,500,400); 

    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
	//testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}