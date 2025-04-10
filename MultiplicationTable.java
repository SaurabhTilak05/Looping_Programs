/*  Multiplication Table
	Description: Write a program to print the multiplication table for a number n.
	
*/
import java.util.*;
public class MultiplicationTable
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number For Table");
		int no=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(no*i);
		}
		
	}
}