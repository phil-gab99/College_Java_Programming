import java.util.Scanner;

/**
*Computes and displays a time given in seconds in its appropriate amount of hours, minutes and seconds
*
* @author	Philippe Gabriel
* @version	02/02/2018
*/

public class Time
{
	public static void main (String[] args)
	{
		//Declaring variables for user input and hours, minutes and seconds
		Scanner keyboard = new Scanner(System.in);
		
		int time, hours, min, sec;
		System.out.print ("Please provide an amount of seconds as a whole number: ");
		time = keyboard.nextInt();
		
		hours = time/3600;
		min = (time - (hours*3600))/60;
		sec = (time - (hours*3600) - (min*60));
		
		System.out.println ();
		System.out.println ("**********Time**********");
		System.out.println ();
		System.out.println ("Time inputted: " + time);
		System.out.println ("Hours: " + hours);
		System.out.println ("Minutes: " + min);
		System.out.println ("Seconds: " + sec);
		System.out.println ("\n\nWritten by Philippe Gabriel");
	}
}

