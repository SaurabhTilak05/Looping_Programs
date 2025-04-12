/* Power of a Number
Description: Write a program to calculate the power of a number x^y.

*/
import java.util.*;
public class PowerOfNumber
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Two Number Second Number as Power");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int power=1;
		for(int i=1;i<=n2;i++)
		{
			power=power*n1;
		}
			
		System.out.println(power);
		
	}
}