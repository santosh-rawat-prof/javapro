//WAP to determine whether a number is Prime or not

import java.util.*;

class Prime
{
	public static void main(String args[])
		{
			Scanner obj  = new Scanner(System.in);
			System.out.println("\n Enter any number: ");
			int n = obj.nextInt();
			int r,i=2;
		
			while(i<n)
			{
				r=n%i;
				if(r==0)
				{
				System.out.println("\n Entered number is Not Prime");
				break;
				}
				i++;
			}
			if(n==i)
			System.out.println("\n Entered number is Prime");
		}
}