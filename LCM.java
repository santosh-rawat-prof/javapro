/*
Enter any two numbers and find LCM
*/

import java.util.*;

class LCM
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	System.out.print("\n Enter any two numbers: ");
	int a = scan.nextInt();
	int b = scan.nextInt();

        int i, hcf = 0,lcm = 0;
	if( a >= b || b >= a)
	    {
		for( i = 1; i <= b; i++)
		    {
			if( a % i == 0 && b % i == 0)
			    hcf = i;
		    }
		lcm = hcf * ( a / hcf ) * ( b / hcf); 
	    }
	
	    System.out.print("\n\n LCM of " + a + " and " + b + " is: " + lcm + "\n\n");
	
    }
}
