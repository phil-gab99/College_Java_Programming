import java.util.Scanner;

/**
*Computes and displays the different 3 digits imputted by the user
*
* @author	Philippe Gabriel
* @version	02/02/2018
*/

public class Digits
{
	public static void main (String[] args)
	
	{
		//Declare variables 3 digit number and the seperate digits
		Scanner keyboard = new Scanner(System.in);
		
		int num, dig1, dig2, dig3;
		
		System.out.print ("Please provide a 3-digit whole number: ");
		num = keyboard.nextInt();
		
		dig1 = num%10;
		dig2 = ((num%100) - dig1)/10;
		dig3 = ((num%1000) - dig2 - dig1)/100;
		
		System.out.println ();
		System.out.println ("**********Number and its digits**********");
		System.out.println ();
		System.out.println ("Number provided: " + num);
		System.out.println ("First digit: " + dig3);
		System.out.println ("Second digit: " + dig2);
		System.out.println ("Third digit: " + dig1);
		System.out.println ("\n\nWritten by Philippe Gabriel");
	}
}

