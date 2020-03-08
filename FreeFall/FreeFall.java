import java.util.Scanner;

/**
*Computes and displays the vertical displacement from a given an initial speed and time
*
* @author	Philippe Gabriel
* @version	02/09/2018
*/

public class FreeFall
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double inispeed, time, ydisp;
		
		System.out.print ("Please provide the initial speed of the stone in m/s: ");
		inispeed = keyboard.nextDouble();
		
		System.out.print ("Please provide the time after which the vertical displacement will be evaluated in seconds: ");
		time = keyboard.nextDouble();
		
		ydisp = Math.max(inispeed*time - (9.81*Math.pow(time,2))/2.0, 0);
		
		System.out.println ();
		System.out.println ("**********Vertical Displacement of a Stone**********");
		System.out.println ();
		System.out.println ("Initial speed of the stone: " + inispeed);
		System.out.println ("Time provided: " + time);
		System.out.println ("Vertical displacement of the stone: " + ydisp);
		System.out.println ("\n\nWritten by Philippe Gabriel");
	}
	
}

