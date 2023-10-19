//WAP to find reverse of a number

import java.util.*;

class Reverse
{
	public static void main(String args[])
		{
			Scanner obj  = new Scanner(System.in);
			System.out.println("\n Enter any number: ");
			int n = obj.nextInt();
			int s=0,r;
			
			while(n!=0)
			{
				r=n%10;
				s=s*10+r;
				n=n/10;
			}
			
			System.out.println("\n Reverse of the number is " +s);
		}
}