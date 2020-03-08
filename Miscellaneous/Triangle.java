/**
   This program checks if three int lengths can represent a triangle.
   If so, it checks if the triangle is isoceles or scalene.
   Finally it calculates the area of the triangle.
   Modify the method stubs as instructed.   
 
  
   @author   Jaya (skeleton)
   @author Tricia (removed Joptionpane & decimalformat)
   @version Feb 24, 2017
*/

public class Triangle {
   public static void main(String[] args) {
      int a, b, c; // the three sides of the triangle

	  // ask the user for the three sides using method getInt
      a=acceptInt("Enter the length of the first side of the triangle:");
      b= acceptInt("Enter the length of the second side of the triangle:");
      c= acceptInt("Enter the length of the third side of the triangle:");

      // if the sides are valid, check the triangle type, and calculate
      // the area. Otherwise, let the user know the data was invalid
	  if (isTriangle(a, b, c))  { // it is a valid triangle
		if (isIsoceles(a,b,c)) {// it is an isoceles
			System.out.println("You have entered an isoceles triangle");
		} else {
			System.out.println("You have entered a scalene triangle");
		}
		
		System.out.printf("The area is %.2f"+getArea(a,b,c));
	  } else {
		// invalid triangle
		 System.out.println("Invalid triangle");
	  }
  }  // main()


   /**
	The acceptInt method takes a String parameter to prompt the user,
	and returns the int that the user enters.
	
	@param prompt The prompt displayed for the user to enter the int.
	@return The int entered.
	*/
	public static int acceptInt(String prompt)	{
		Scanner kb = new Scanner(System.in);
		System.out.print(prompt);
		int input = kb.nextInt();
		return input;
	}

   /**
	  The isTriangle method accepts 3 int arguments for each side
	  and returns a boolean indicating if the sides can form a triangle.
	
	  @param a The first side
	  @param b The second side
	  @param c The third side
	  @return true if the sides can form a valid triagle
			  false otherwise
   */
	public static boolean isTriangle(int a, int b, int c) {
		// TODO add the method logic
	}

   /**
	  The isIsoceles method accepts 3 int arguments for each side
	  and returns a boolean indicating if the sides can form an isoceles
	  triangle.
	  @param a The first side
	  @param b The second side
	  @param c The third side
	  @return true if the sides can form a valid isoceles triangle
			  false otherwise
   */
	public static boolean isIsoceles(int a, int b, int c) {
		// TODO add the method logic
	}

   /**
	  The getArea method accepts 3 int arguments for each side
	  and returns a double indicating the area of the triangle.
	  @param a The first side
	  @param b The second side
	  @param c The third side
	  @return double of the area of the triangle
   */
	public static double getArea(int a, int b, int c) {
		// TODO add the method logic
	}
}  // end Triangle
