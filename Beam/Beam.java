import java.util.Scanner;
import java.text.DecimalFormat; //Allows rounding purposes

/**
*Computes and displays the beam length
*
* @author	Philippe Gabriel
* @version	01/28/2018
*/

public class Beam
{
	public static void main (String[] args)
	{
		//Declare variables for the height of the pole, the distance from the beam, and the length of the beam
		Scanner keyboard = new Scanner(System.in);
		
		double height, base, hyp;
		System.out.print ("Please provide the height of the pole: ");
		height = keyboard.nextDouble();
		
		System.out.print ("Please provide the distance from the pole to the beam (in the same units of measurement): ");
		base = keyboard.nextDouble();
		
		//Computes the beam length
		hyp = Math.sqrt(Math.pow(height,2) + Math.pow(base,2));
		
		//Values will be rounded to two decimal places
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		System.out.println ();
		System.out.println ("**********Length of Beam**********");
		System.out.println ();
		System.out.println ("Pole height: " + formatter.format(height));
		System.out.println ("Distance from pole to beam: " + formatter.format(base));
		System.out.printf ("Beam Length: " + formatter.format(hyp));
		System.out.println ("\n\nWritten by Philippe Gabriel");
		
	}
}

