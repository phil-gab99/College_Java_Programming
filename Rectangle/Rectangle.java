import java.util.Scanner;
import java.text.DecimalFormat; //Allows rounding purposes

/**
*Computes and displays the multiple properties of a rectangle
*
* @author	Philippe Gabriel
* @version	02/02/2018
*/

public class Rectangle {
	public static void main (String[] args) {
		
		//Declare variables for width, height, area and perimeter of the rectangle
		Scanner keyboard = new Scanner(System.in);
		
		int width, height, perimeter;
		double area;
		
		System.out.print ("Please provide the width of the rectangle as a whole number value: ");
		width = keyboard.nextInt();
		
		System.out.print ("Please provide the height of the rectangle as a whole number value: ");
		height = keyboard.nextInt();
		
		//Computes the perimeter of the rectangle
		perimeter = 2*(width + height);
		
		//Computes the area of the rectangle
		area = width*height;
		
		//Values will be rounded to two decimal places
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		System.out.println ();
		System.out.println ("**********Rectangle Properties**********");
		System.out.println ();
		System.out.println ("Height: " + height);
		System.out.println ("Width: " + width);
		System.out.println ("Perimeter: " + perimeter);
		System.out.printf ("Area: " + formatter.format(area));
		System.out.println ("\n\nWritten by Philippe Gabriel");
	}
}

