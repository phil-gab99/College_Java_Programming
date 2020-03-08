import java.util.Scanner;

/**
*Computes and displays the final balance of a starting bank balance over a given amount of years
*
* @author	Philippe Gabriel
* @version	02/09/2018
*/

public class Balance
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double principle, fbalance
		int years
		
		System.out.print ("Please provide a starting bank balance in CAD: ");
		principle = keyboard.nextDouble();
		
		System.out.print ("Please provide the number of years: ");
		years = keyboard.nextInt();
		
		principle = (Math.round(principle*100))/100.0
		
		fbalance = principle*Math.Pow(1.075, years)
		
		System.out.println ();
		System.out.println ("**********Bank Balance**********");
		System.out.println ();
		System.out.println ("Starting balance: " + principle);
		System.out.println ("Years provided: " + years);
		System.out.println ("Final balance: " + fbalance)
		System.out.println ("\n\nWritten by Philippe Gabriel");
	}
}

