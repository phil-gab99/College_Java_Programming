import java.util.Scanner;

/**
*Computes and displays the roots of a polynomial from a given initial value
*
*@author Philippe Gabriel
*@version 2018-03-05
*/

public class PolynomialRoots {
	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		int iterations=0; //Variable to count number of iterations before arriving at the real root
		double x0, xn, xnplus1;
		//x0 is the initial value accepted by the user, xn and xnplus1 are important parameters in the Newton-Raphson method
		boolean goodEnough = false;//Variable which determines if the real root approximation is "good enough"
		
		System.out.print ("Enter the initial value for x (x_0): ");
		x0 = keyboard.nextDouble(); //Accepts the initial value to be implemented in the function
		xn = x0; //The initial value is the first which will be evaluated in the Newton-Raphson method
		
		//So long as the root approximation is not good enough, we reiterate the Newton-Raphson method
		while (!goodEnough) {
			xnplus1 = newtonRaphsonF(xn, f(xn), fprime(xn)); //Call of Newton-Raphson method
			iterations++; //Keep count of iterations
			if (Math.abs(xnplus1 - xn) >= 0.0001) { //Whether the root approximation is good enough or not is determined here
				System.out.printf ("xn %.7f. xnplus1 %.7f. \n", xn, xnplus1);
				xn = xnplus1;
			} else {
				System.out.printf ("FINAL: xn %.7f. xnplus1 %.7f. \n", xn, xnplus1);
				goodEnough = true;
				System.out.println ();
				System.out.println ("Polynomial: f(x) = 3x^5 + x^3 - x - 1");
				System.out.println ("Derivative: f'(x) = 15x^4 + 3x^2 - 1");
				System.out.println ();
				System.out.println ("Initial x value (x_0): " + x0);
				System.out.println ("Root approximation: " + xnplus1);
				System.out.println ("Iterations: " + iterations);
			}
		}
	}
	
	/**
	*This method calculates the function value from a given parameter x
	*
	*@param x independent value by which the polynomial is to be evaluated
	*@return polyn the value of the function after evaluating the polynomial from the given independent value
	*/
	public static double f (double x) {
		double polyn = 3*Math.pow(x,5) + Math.pow(x,3) - x - 1.0;
		return polyn;
	}
	
	/**
	*This method calculates the derivative value of the polynomial from a given parameter x
	*
	*@param x independent value by which the derivative is to be evaluated
	*@return deriv the value of the derivative of the function after evaluating the polynomial from the given independent value
	*/
	public static double fprime (double x) {
		double deriv = 15*Math.pow(x,4) + 3*Math.pow(x,2) - 1.0;
		return deriv;
	}
	
	/**
	*This method evaluates the Newton-Raphson method for finding a polynomial's real roots
	*
	*@param xn the n'th value of x after n iterations have been lead
	*@param numerator the top number of the Newton-Raphson method which is the value of the function when it is given a parameter x
	*@param denominator the bottom number of the Newton-Raphson method which is the value of the derivative when it is given a parameter x
	*@return xnplus1 the n'th plus 1 value of x after n iterations have been lead
	*/
	public static double newtonRaphsonF (double xn, double numerator, double denominator) {
		double xnplus1 = xn - numerator/denominator;
		return xnplus1;
	}
}