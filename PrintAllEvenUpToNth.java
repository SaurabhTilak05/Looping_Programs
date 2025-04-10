/* 	Even Numbers
	Description: Write a program to print all even numbers between 1 and n.
*/
import java.util.*;
public class PrintAllEvenUpToNth
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Nth tearm");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}