//WAP to determine whether a number is pallindrome or not using Command Line Argument

class ComLineArg
{
	public static void main(String args[])
	{
			int n = Integer.parseInt(args[0]);
			int s=0,r,org;
			
			org=n;
			while(n!=0)
			{
				r=n%10;
				s=s*10+r;
				n=n/10;
			}
			if(s==org)
			System.out.println("\n Entered number is Pallindrome");
			else
			System.out.println("\n Entered number is Not Pallindrome");
		}
}