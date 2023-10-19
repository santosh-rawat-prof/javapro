/*
The factorial of an integer m is product of consecutive integers from 1 to m.
That is factorial m = m! = m * (m-1) * (m-2) * ......... * 1.
Write a Program that computes and prints a table of factorials for any given m. 
*/

import java.util.*;

class FactLoop
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);   //Scanner class for input 
		int m, fact = 1, sum = 0;
		
		//Input
		System.out.println("\n factorial of a number m is:");
		System.out.println("\n m! = m * (m-1) * (m-2) * ......... * 1");
		System.out.print("\n Enter value of m: ");
		m = scan.nextInt();
		
		//Process
		System.out.print("\n Factorial of " +m+ " = " +m+ "! = (");
		for(int i = 1; i <= m; i++)
		{
			fact = fact * i;
			if( i < m)
			System.out.print(" " +i+ " *");
			else
			System.out.print(" " +i);
		}
		System.out.print(" ) = " +fact);
	}	
}