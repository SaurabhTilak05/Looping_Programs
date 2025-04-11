/* Print Square of a Number
Description: Write a program to print the square of a number.
Input: n = 4
Output: 16
*/
import java.util.*;
public class PrintSquare
{
	public static void main (String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number ");
		int no=s.nextInt();
		int sq=no*no;
		System.out.println("Square is:"+sq);
		
	}
}
