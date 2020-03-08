import java.util.Scanner;
import java.text.DecimalFormat; //Allows rounding purposes

/**
*Computes and displays cost of covering a circular track with gravel
*
* @author	Philippe Gabriel
* @version	01/28/2018
*/

public class Gravel_Track
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double diameter, area, cost;
		
		System.out.print ("Please provide the diameter of the circular track (in meters): ");
		diameter = keyboard.nextDouble();
		
		//Computes the area of the track using the given diameter as well the cost of the track
		area = Math.PI * Math.pow((diameter/2),2);
		cost = area * 2.5;

		//Values will be rounded to two decimal places
		DecimalFormat formatter = new DecimalFormat("#0.00");
			
		System.out.println ();
		System.out.println ("**********Gravel Track calculator**********");
		System.out.println ();
		System.out.printf ("Diameter of Track:	" + formatter.format(diameter) + " meters");
		System.out.println ();
		System.out.printf ("Area of Circular Track: " +  formatter.format(area)  + " meters squared");
		System.out.println ();
		System.out.printf ("Cost of covering: " + formatter.format(cost) + " Can$");
		System.out.println ("\n\nWritten by Philippe Gabriel");
	}
}

