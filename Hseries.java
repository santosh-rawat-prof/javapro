/*Q1. WAP to determine the sum of following harmonic series for a given value of n
		
		(1+1/2+1/3+1/4+....1/n)

		"n" should be input by user*/

import java.util.*;

class Hseries
{
		public static void main (String args[])
			{
				Scanner obj = new Scanner(System.in);
				System.out.println("\n Enter the value to be put in place of n in series: ");
				System.out.println("\n (1+1/2+1/3+1/4+....1/n) ");
				System.out.print("\n Where n = ");
				int n = obj.nextInt();
				float count = 1 , s = 0;

				while(count<=n)
				{
					s=s+1/count;
					count++;
				}
				
				System.out.println("\n After putting value of n the series gives out : " +s);
			}
}

 
