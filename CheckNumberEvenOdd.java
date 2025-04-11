/*. Check for Odd or Even
Description: Write a program to check whether a given number is odd or even.
*/
import java.util.*;
public class CheckNumberEvenOdd
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=s.nextInt();
		if(no%2==0)
		{
			System.out.println("Even Number");
		}
		else 
		{
			System.out.println("Odd number");
		}
	}
}
