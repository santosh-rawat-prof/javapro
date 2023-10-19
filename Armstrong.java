//WAP to determine whether a number is armtrong or not

import java.util.*;

class Armstrong
{
	public static void main(String args[])
		{
			Scanner obj  = new Scanner(System.in);
			System.out.println("\n Enter any number: ");
			int n = obj.nextInt();
			int s=0,r,org;
			
			org=n;
			while(n!=0)
			{
				r=n%10;
				s=s+(r*r*r);
				n=n/10;
			}
			if(s==org)
			System.out.println("\n Entered number is Armstrong");
			else
			System.out.println("\n Entered number is Not an Armstrong");
		}
}