// this is not a class
// this is a code snippet
// in main() 
 int first, second;
 first= 5, second= 6;
 if (isEqual_(first, second)) {    // use isEqual1, isEqual2 or isEqual3    
	 System.out.println(first+" == "+second);
} else {
	System.out.println(first+" != "+second);
}
// example method that returns a boolean
// directly
public static boolean isEqual1(int a, int b) {  
  // return a literal 
  if (a == b) {
	  return true;
  }	  else {
	  return false;
  }
}   // isEqual1()
// example method that returns a boolean
// using a variable 
public static boolean isEqual2(int a, int b) {  
  boolean tf;
  // return a variable
  if (a == b) {
	  tf = true;
  }	  else {
	  tf = false;
  }
  return tf; 
}   // isEqual2()
// example method that returns a boolean
// using a comparison expression 
public static boolean isEqual3(int a, int b) {  
  // return the result of an expression
  return (a == b);
}   // isEqual3()