
import java.util.*;

class Abcd
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		float a,b,c,d,n,m,x1,x2;

		System.out.print("\n Enter the values of a,b,c,d,m and n: ");
		a=obj.nextFloat();
		b=obj.nextFloat();
		c=obj.nextFloat();
		d=obj.nextFloat();
		m=obj.nextFloat();
		n=obj.nextFloat();

		if((a*d-c*b)==0)
		System.out.print("\n The value is not defined as denominator is 0 ");
		else
		{
		x1 = (m*d - b*n) / (a*d - c*b);
		x2 = (n*a - m*c) / (a*d - c*b);
		
		System.out.print("\n x1 is: " +x1);
		System.out.print("\n x2 is: " +x2 );
		} 
	}
}