import java.util.Scanner;

public class CountAverage
{
	public static void main (String[] args)
	{
		int test[];
		test = accumNum();
		for (int i = 0; i < test.length; i++) {
			System.out.print (i + ": " + test[i] + "	");	
			System.out.println();
		}
	}
	public static int[] accumNum()
	{
		Scanner keyboard = new Scanner(System.in);
		int num, large, small, sum=0, count=0;
		int result[];
		System.out.print ("Enter a number: ");
		num = keyboard.nextInt();
		large = small = num;
		while (num >= 0) {
			if (num<small) {
				small = num;
			}
			if (num>large) {
				large = num;
			}
			count++;
			sum+=num;
			System.out.print("Enter a number: ");
			num = keyboard.nextInt();
			
		}
		result = new int[3];
		result[0] = large;
		result[1] = small;
		result[2] = sum/count;
		return result;
	}
	
}

