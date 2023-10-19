/*
The total distance travelled by vehicle in t seconds is given distance = ut + (at2)/2. 
Where u is the initial velocity (m/s) , a is the acceleration (m/s2).
WAP to evaluate the distance travelled at regular intervals of time, given the values of u and a.
The Program should provide the flexibility to the use and select his own time intevals and 
repeat the calculations for different values of u ad a.
*/

import java.util.*;

class Distance
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.print("\n We have to find the Distance travelled in given time interval, initial veocity, acceleration");
		System.out.print("\n The equation for the distance formula is ut + (at2)/2");
		System.out.print("\n Enter the time interval: ");
		float t = obj.nextFloat();
		int ch;
		do
		{
			System.out.print("\n Enter the initial velocity: ");
			float u = obj.nextFloat();
			System.out.print("\n Enter the acceleration: ");
			float a = obj.nextFloat();
			float d;

		
			d = u * t + ( a * t * t ) / 2;
		
			System.out.print("\n The distance travelled by the vehicle is: " + d + " m " );

			System.out.print("\n To continue the calculation with different initial velocity and acceleration ");
			System.out.print("\n Press 1 or any other number to close: "); 
			ch = obj.nextInt();
		}

		while(ch==1);

	}
}