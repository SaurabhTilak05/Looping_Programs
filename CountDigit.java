/*  Count Digits
	Description: Write a program to count the number of digits in a number n.
	Input: n = 12345
Output: 5
*/
import java.util.*;
public class CountDigit
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=s.nextInt();
		int count=0;
		while(no>0)
		{
			no=no/10;
			count++;
		}
		System.out.println("Count is:"+count);
		
	}
}

