import java.util.Scanner;

/**
*Computes and displays the wind chill factor from given temperature and wind speed
*
* @author	Philippe Gabriel
* @version	02/16/2018
*/

public class WindChill
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double tair, v, wc;
		
		System.out.print ("Please provide a temperature between -45 °C to 5 °C: ");
		tair = keyboard.nextDouble();
		
		System.out.print ("Please provide a temperature between 5 km/h to 80 km/h: ");
		v = keyboard.nextDouble();
		
		wc = Math.round(13.12 + 0.6215*tair - 11.37*Math.pow(v, 0.16) + 0.3965*tair*Math.pow(v, 0.16));
		
		if 
		System.out.println ("**********Wind Chill**********");
		System.out.println ();
		System.out.println ("Given temperature: " + tair + " °C");
		System.out.println ("Wind speed: " + v + " km/h");
		System.out.println ("Wind Chill factor: " + wc);
		System.out.println (
		System.out.println ("\n\nWritten by Philippe Gabriel");