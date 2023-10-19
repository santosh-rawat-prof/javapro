//WAP to find factorial

import java.util.*;

class Factorial
{
	public static void main(String args[])
		{
			Scanner obj  = new Scanner(System.in);
			System.out.println("\n Enter any number: ");
			int n = obj.nextInt();
			int count=1,fact=1;
			
			while(count<=n)
			{
				fact=fact*count;
				count++;
			}
			
			System.out.println("\n Factorial is " +fact);
		}
}