import java.util.Scanner;

/**
*Computes and displays the rounded square root of a given number with given decimal places
*
* @author	Philippe Gabriel
* @version	02/16/2018
*/

public class SqrtRound
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int num, dec;
		double sqrt;
		
		System.out.print ("Please provide a number you wish its square root be taken: ");
		num = keyboard.nextInt();
		
		System.out.print ("Please provide the number of decimal places you wish the square root of that number to be rounded to: ");
		dec = keyboard.nextInt();
		
		sqrt = Math.round((Math.sqrt(num)*Math.pow(10,dec)))/Math.pow(10.0, dec);
		
		System.out.println ("**********Rounded Square Root**********");
		System.out.println ();
		System.out.println ("Given number: " + num);
		System.out.println ("Decimal places desired: " + dec);
		System.out.println ("Rounded Square Root: " + sqrt);
		System.out.println ("\n\nWritten by Philippe Gabriel");
	}
}

