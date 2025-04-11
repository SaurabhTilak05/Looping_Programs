/*Count Non-Zero Digits
Description: Write a program to count the number of non-zero digits in a number.

*/
import java.util.*;
public class CountNonZeroDigit
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Digits");
		int no=s.nextInt();
		int count=0;
		int rem;
		while(no>0)
		{
			 rem=no%10;
			if(rem!=0)
			{
				count++;
			}
			no=no/10;
		}
		System.out.println(count);
	}
}