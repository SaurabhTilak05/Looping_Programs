	/*Find Minimum Number
	Description: Write a program to find the minimum number between two numbers.
	
*/

import java.util.*;
public class FindMinimumNum
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int n=s.nextInt();
		int no=s.nextInt();
		int min;
		if(n<no)
		{
			min=n;
		}
		else {
			min=no;
		}
		System.out.println("Minimum is:"+min);
	}
	
	
	
	
	
	
}