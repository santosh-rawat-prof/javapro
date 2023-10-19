/*
For a given array of integers (positive and negative) find the largest sum of contiguous sequence
*/

import java.util.*;
import java.io.*;

class ContiguousSum
{
    // Driver Code
    
    public static void main(String []args)
    {
	Scanner scan = new Scanner(System.in);

	System.out.print("\n Enter the number of elments you want to store in array: ");

	int n = scan.nextInt();

	int array[] = new int[n];

	System.out.print("\n Enter the Elements: ");

	for( int i = 0; i < n; i++)
	    {
		array[i] = scan.nextInt();
	    }

	System.out.print("\n maximum Contiguous sum is : " + maxSubArraySum(array) + "\n\n");
    }

	//Function Call

	static int maxSubArraySum(int array[])
	{
	    int size = array.length;
	    int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

	    for( int i = 0; i < size; i++)
		{
		    max_ending_here = max_ending_here + array[i];

		    if( max_so_far < max_ending_here)
			max_so_far = max_ending_here;
		    if(max_ending_here < 0)
			max_ending_here = 0;
		}
	    return max_so_far;
	}
}
