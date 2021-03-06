import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments 
	 */
	public Picture ()
	{
		/* not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor 
		 */
		super();  
	}

	/**
	 * Constructor that takes a file name and creates the picture 
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName)
	{
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * @param height the height of the desired picture
	 * @param width the width of the desired picture
	 */
	public Picture(int height, int width)
	{
		// let the parent class handle this width and height
		super(width,height);
	}

	/**
	 * Constructor that takes a picture and creates a 
	 * copy of that picture
	 * @param copyPicture the picture to copy
	 */
	public Picture(Picture copyPicture)
	{
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * @param image the buffered image to use
	 */
	public Picture(BufferedImage image)
	{
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * @return a string with information about the picture such as fileName,
	 * height and width.
	 */
	public String toString()
	{
		String output = "Picture, filename " + getFileName() + 
				" height " + getHeight() 
				+ " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(0);
			}
		}
	}

	public void keepOnlyBlue()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	public void negate()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(255-pixelObj.getRed());
				pixelObj.setGreen(255-pixelObj.getGreen());
				pixelObj.setBlue(255-pixelObj.getBlue());
			}
		}
	}

	public void grayscale()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				int avg = (pixelObj.getRed() + 
						pixelObj.getGreen() +
						pixelObj.getBlue()) / 3;
				pixelObj.setRed(avg);
				pixelObj.setGreen(avg);
				pixelObj.setBlue(avg);
			}
		}
	}

	public void fixUnderwater()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(5*pixelObj.getRed());
				//pixelObj.setGreen(0);
				//pixelObj.setBlue();
			}
		}
	}

	/** Method that mirrors the picture around a 
	 * vertical mirror in the center of the picture
	 * from left to right */
	public void mirrorVertical()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < width / 2; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		} 
	}

	public void mirrorVerticalRightToLeft()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = width - 1; col > width / 2; col--)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		} 
	}

	public void mirrorHorizontal()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel upPixel = null;
		Pixel downPixel = null;
		int height = pixels.length;
		int width = pixels[0].length;
		for (int row = 0; row < height / 2; row++)
		{
			for (int col = 0; col < width; col++)
			{
				upPixel = pixels[row][col];
				downPixel = pixels[height - 1 - row][col];
				downPixel.setColor(upPixel.getColor());
			}
		} 
	}

	public void mirrorHorizontalBotToTop()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel upPixel = null;
		Pixel downPixel = null;
		int height = pixels.length;
		int width = pixels[0].length;
		for (int row = 0; row < height / 2; row++)
		{
			for (int col = 0; col < width; col++)
			{
				upPixel = pixels[row][col];
				downPixel = pixels[height - 1 - row][col];
				upPixel.setColor(downPixel.getColor());
			}
		} 
	}

	public void mirrorDiagonal()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel upPixel = null;
		Pixel downPixel = null;
		int height = pixels.length;
		int width = pixels[0].length;
		for (int row = 0; row < height; row++)
		{
			for (int col = 0; col < width; col++)
			{
				if (row + col < (width+height)/2) {
					upPixel = pixels[row][col];
					int toDiagonal = (((width+height)/2) - (row + col) ) * 2;
					if (row + toDiagonal + 1< height && col + toDiagonal + 1 < width) {
						downPixel = pixels[row + toDiagonal][col + toDiagonal];
						downPixel.setColor(upPixel.getColor());
						downPixel = pixels[row + toDiagonal][col + toDiagonal + 1];
						downPixel.setColor(upPixel.getColor());
						downPixel = pixels[row + toDiagonal + 1][col + toDiagonal];
						downPixel.setColor(upPixel.getColor());
						downPixel = pixels[row + toDiagonal + 1][col + toDiagonal + 1];
						downPixel.setColor(upPixel.getColor());
					}
				}
			}
		} 
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple()
	{
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++)
		{
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++)
			{

				leftPixel = pixels[row][col];      
				rightPixel = pixels[row]                       
						[mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}

		System.out.println(count);

	}

	public void mirrorArms()
	{
		int mirrorPoint = 194;
		Pixel upPixel = null;
		Pixel downPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 164; row < 194; row++)
		{
			for (int col = 0; col < pixels[0].length; col++)
			{

				upPixel = pixels[row][col];
				downPixel = pixels[mirrorPoint * 2 - row][col];
				downPixel.setColor(upPixel.getColor());
				count++;
			}
		}

		System.out.println(count);

	}

	public void mirrorGull()
	{
		int mirrorPoint = 350;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 230; row < 330; row++)
		{
			// loop from 13 to just before the mirror point
			for (int col = 230; col < mirrorPoint; col++)
			{

				leftPixel = pixels[row][col];      
				rightPixel = pixels[row]                       
						[mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}

		System.out.println(count);

	}

	/** copy from the passed fromPic to the
	 * specified startRow and startCol in the
	 * current picture
	 * @param fromPic the picture to copy from
	 * @param startRow the start row to copy to
	 * @param startCol the start col to copy to
	 */
	public void copy(Picture fromPic, 
			int startRow, int startCol)
	{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; 
				fromRow < fromPixels.length &&
				toRow < toPixels.length; 
				fromRow++, toRow++)
		{
			for (int fromCol = 0, toCol = startCol; 
					fromCol < fromPixels[0].length &&
					toCol < toPixels[0].length;  
					fromCol++, toCol++)
			{
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}   
	}

	/** Method to create a collage of several pictures */
	public void createCollage()
	{
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1,0,0);
		this.copy(flower2,100,0);
		this.copy(flower1,200,0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue,300,0);
		this.copy(flower1,400,0);
		this.copy(flower2,500,0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}


	/** Method to show large changes in color 
	 * @param edgeDist the distance for finding edges
	 */
	public void edgeDetection()
	{
		Pixel pixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		Color color = null;

		int[][] copyArray = new int[pixels.length][pixels[0].length];

		for (int row = 1; row < pixels.length - 1; row++)
		{
			for (int col = 1; col < pixels[0].length-1; col++)
			{
				pixel = pixels[row][col];

				int diffSum = ( 
						Math.abs(pixels[row+1][col].getBlue() - pixel.getBlue()) +
						Math.abs(pixels[row-1][col].getBlue() - pixel.getBlue()) +
						Math.abs(pixels[row][col+1].getBlue() - pixel.getBlue()) +
						Math.abs(pixels[row][col-1].getBlue() - pixel.getBlue()) +

						Math.abs(pixels[row+1][col].getRed() - pixel.getRed()) +
						Math.abs(pixels[row-1][col].getRed() - pixel.getRed()) +
						Math.abs(pixels[row][col+1].getRed() - pixel.getRed()) +
						Math.abs(pixels[row][col-1].getRed() - pixel.getRed()) +

						Math.abs(pixels[row+1][col].getGreen() - pixel.getGreen()) +
						Math.abs(pixels[row-1][col].getGreen() - pixel.getGreen()) +
						Math.abs(pixels[row][col+1].getGreen() - pixel.getGreen()) +
						Math.abs(pixels[row][col-1].getGreen() - pixel.getGreen()) );
				copyArray[row][col] = 255-diffSum;

			}
		}
		for (int i = 0; i < copyArray.length; i++) {
			for (int j = 0; j < copyArray[0].length; j++) {
				pixels[i][j].setRed(copyArray[i][j]);
				pixels[i][j].setGreen(copyArray[i][j]);
				pixels[i][j].setBlue(copyArray[i][j]);
			}
		}
	}

	public void sharpen(int x, int y, int w, int h) {
		System.out.println("Conor Sefkow\nPeriod 1\n4/24/18\nComputer 02");
		Pixel[][] pixels = this.getPixels2D();
		Pixel thisPixel = null;
		Pixel upLeftPixel = null;
//		int height = pixels.length;
//		int width = pixels[0].length;
		for (int row = y+1; row < y+h; row++)
		{
			for (int col = x+1; col < x+w; col++)
			{
				thisPixel = pixels[row][col];
				upLeftPixel = pixels[row-1][col-1];
				
				int blueVal = thisPixel.getBlue() + (int)Math.abs(0.5 * (upLeftPixel.getBlue() - thisPixel.getBlue()));
				int redVal = thisPixel.getRed() + (int)Math.abs(0.5 * (upLeftPixel.getRed() - thisPixel.getRed()));
				int greenVal = thisPixel.getGreen() + (int)Math.abs(0.5 * (upLeftPixel.getGreen() - thisPixel.getGreen()));
				
				if (blueVal > 255) { blueVal = 255; } 
				else if (blueVal < 0) { blueVal = 0; }
				
				if (redVal > 255) { redVal = 255; } 
				else if (redVal < 0) { redVal = 0; }
				
				if (greenVal > 255) { greenVal = 255; } 
				else if (greenVal < 0) { greenVal = 0; }
				
				thisPixel.setBlue(blueVal);
				thisPixel.setRed(redVal);
				thisPixel.setGreen(greenVal);
			}
		}
	}
	
	/** Hide a black and white message in the current picture
	* @param messagePict the picture with a message
	*/
	public void encode(Picture messagePict)
	{

		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel messagePixel = null;
		for (int i = 0; i < messagePixels.length; i++) {
			for (int j = 0; j < messagePixels[0].length; j++) {
				messagePixel = messagePixels[i][j];
				if (messagePixel.getRed() < 250) {
					messagePixel.setBlue(0);
					messagePixel.setGreen(0);
					messagePixel.setRed(1);
				}
			}
		}
		for (int row = 0; row < this.getHeight(); row++)
		{
			for (int col = 0; col < this.getWidth(); col++)
			{
				currPixel = currPixels[row][col];
				if (messagePixels.length > row && messagePixels[0].length > col)
				{
					messagePixel = messagePixels[row][col];
					if (messagePixel.getRed() < 250) {
						currPixel.setRed(currPixel.getRed() + 1);
					}
				}
			}
		}
		currPixels[5][5].setColor(Color.BLACK);
	}
	/**
	 * Method to decode a message hidden in the
	 * red value of the current picture
	 * @return the picture with the hidden message
	 */
	public void decode(Picture original)
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel[][] origImage = original.getPixels2D();
		int height = this.getHeight();
		int width = this.getWidth();
		Pixel currPixel = null;
		Pixel messagePixel = null;
		Picture messagePicture = new Picture(height,width);
		Pixel[][] messagePixels = messagePicture.getPixels2D();
		for (int row = 0; row < this.getHeight(); row++)
		{
			for (int col = 0; col < this.getWidth(); col++)
			{
				currPixel = pixels[row][col];
				messagePixel = messagePixels[row][col];
				if (currPixel.getRed() - origImage[row][col].getRed() != 0) {
					currPixel.setColor(Color.BLACK);
				} else {
					currPixel.setColor(Color.WHITE);
				}
			}
		}
	}


	/* Main method for testing - each class in Java can have a main 
	 * method 
	 */
	public static void main(String[] args) 
	{
		Picture beach = new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\beach.jpg");
		beach.explore();
		beach.encode(new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\HelloThere.jpg"));
		beach.explore();
		beach.decode(new Picture("H:\\APCSA-P1 - Completed files stored here\\Unit16\\src\\images\\beach.jpg"));
		beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this
