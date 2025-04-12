/*Check Leap Year
Description: Write a program to check if a given year is a leap year.

*/
import java.util.*;
public class CheckLeapYears
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Year");
		int yrs=s.nextInt();
		
		boolean b=false;
		if(yrs%4==0 || yrs%100==0||yrs%400==0)
		{
			b=true;
		}
		if(b)
		{
			System.out.println("Leap Year...!!");
		}
		else{
			System.out.println("Not Leap Year...!!");
		}
	
	}
}