import java.util.*;

class SumOfDigit
{
	public static void main(String args[])
		{
			Scanner obj  = new Scanner(System.in);
			System.out.println("\n Enter any number: ");
			int n = obj.nextInt();
			int m,sum = 0;
			
			while(n>0)
			{
				m=n%10;
				sum=sum+m;
				n=n/10;
			}
			
			System.out.println("\n Sum of digits are " +sum);
		}
}