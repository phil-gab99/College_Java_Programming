import java.util.Scanner;

/**
*Computes and displays the real roots of function provided that a, b, and c are given
*
* @author	Philippe Gabriel
* @version	02/09/2018
*/

public class Quadratic
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double a, b, c, root1, root2;
		
		System.out.print ("Please provide a: ");
		a = keyboard.nextDouble();
		
		System.out.print ("Please provide b: ");
		b = keyboard.nextDouble();
		
		System.out.print ("Please provide c: ");
		c = keyboard.nextDouble();
		
		root1 = (-b + Math.sqrt(Math.pow(b,2) - 4.0*a*c))/(2.0*a);
		root2 = (-b - Math.sqrt(Math.pow(b,2) - 4.0*a*c))/(2.0*a);
		
		System.out.println ();
		System.out.println ("**********Real roots of a quadratic function**********");
		System.out.println ();
		System.out.println ("a: " + a);
		System.out.println ("b: " + b);
		System.out.println ("c: " + c);
		System.out.println ("Real root 1: " + root1);
		System.out.println ("Real root 2: " + root2);
		System.out.println ("\n\nWritten by Philippe Gabriel");
	}
	
}

