import java.util.*;

class Gcd
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	System.out.print("\n Enter any two numbers: ");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int i, gcd = 0;
	if( a > b )
	    {
		for( i = 1; i <= b; i++)
		    {
			if( a % i == 0 && b % i == 0)
			    gcd = i;
		    }
	    }
	if( b > a )
	    {
		for( i = 1; i <= a; i++)
		    {
			if( a % i == 0 && b % i == 0)
			    gcd = i;
		    }
	    }

	System.out.print("\n\n GCD of " + a + " and " + b + " is: " + gcd + "\n\n");
    }
}
