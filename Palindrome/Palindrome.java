import java.util.Scanner;

/**
*Computes and displays a 6-digit palindrome from 3 given digits
*
* @author	Philippe Gabriel
* @version	02/16/2018
*/

public class Palindrome
{
	public static void main (String[] args)
	
	{
		//Declare variables for a 3 digit number and the separate digits as well as the palindrome
		Scanner keyboard = new Scanner(System.in);
		
		int num, dig1, dig2, dig3, pali;
		
		System.out.print ("Please provide a 3-digit whole number: ");
		num = keyboard.nextInt(); //The typed number is saved here
		
		//Using the modulus operator, we can dissect each digit from the number obtained by the user
		dig1 = num%10;
		dig2 = (num%100 - dig1)/10;
		dig3 = (num%1000 - dig2 - dig1)/100;
		
		//This palindrome is a 6-digit number composed of the previous dissected digits
		pali = dig3*100000 + dig2*10000 + dig1*1000 + dig1*100 + dig2*10 + dig3;
				
		System.out.println ();
		System.out.println ("**********Number and its Palindrome**********");
		System.out.println ();
		System.out.println ("Number provided: " + num);
		System.out.println ("Appropriate Palindrome: " + pali);
		System.out.println ("Remainder when palindrome is divided by 11: " + pali%11); //Here is to highlight a property of all even-numbered palindromes, that they are all divisible by 11; and so, no remainder remains
		System.out.println ("\n\nWritten by Philippe Gabriel");
	}
}

