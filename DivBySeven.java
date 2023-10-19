/*
WAP to find the number of and sum of all integers greater than 100
and less than 200 that are divisible by 7.
*/

class DivBySeven
{
	public static void main(String[] args)
	{
		int n,count,sum;
		n=101;
		count=0;
		sum=0;

		while(n>100 && n<200)
		{
			if(n%7==0)
			{
			sum=sum+n;
			count++;
			}
			n++;
		}
		System.out.print("\n The number of integers between 100 and 200 which are divisible by 7 are: " +count);
		System.out.print("\n The sum of the integers are: " +sum); 
	}
}