import java.util.Scanner;
import java.text.DecimalFormat; //Allows rounding purposes

/**
*Computes and displays the given temperature in Celsius in Kelvins
*
* @author	Philippe Gabriel
* @version	01/28/2018
*/

public class Temperature
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double TempC, TempK;
		
		System.out.print ("Enter a temperature in Celsius:	");
		TempC = keyboard.nextDouble();
		
		TempK = TempC + 273.15; //Conversion of Celsius to Kelvins
		
		//Values will be rounded to two decimal places
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		System.out.println ("**********Temperature**********");
		System.out.println ();
		System.out.println ("Temperature (°C): " + formatter.format(TempC));
		System.out.printf ("Temperature (K): " + formatter.format(TempK));
		System.out.println ("\n\nWritten by Philippe Gabriel");
		
	}
}

