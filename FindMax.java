/* Find Maximum Number
Description: Write a program to find the maximum number between two numbers.

*/
import java.util.*;
public class FindMax
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int n=s.nextInt();
		int no=s.nextInt();
		int max;
		if(n>no)
		{
			max=n;
		}
		else {
			max=no;
		}
		System.out.println("Max is:"+max);
	}
}