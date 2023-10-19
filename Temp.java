/*Q2. WAP for temperature conversion from fahrenheit to celcius, fahrenheit is entered by user

		C = ( F - 32 ) / 1.8 */

import java.util.*;

class Temp
{
		public static void main (String args[])
			{
				Scanner obj = new Scanner(System.in);
				System.out.print("\n Enter the teperature in fahrenheit to be converted to celcius: ");
				float f = obj.nextFloat();
				float C;
				System.out.println("\n The conversion equation of Fahrenheit to Celcius is: ");
				System.out.println("\n Celcius = (Fahrenheit - 32) / 1.8 ");
				System.out.println("\n where you have entered Fahrenheit = " +f);

				C = ( f - 32 ) / 1.8f;

				System.out.println("\n After Conversion Celcius = " +C);
			}
}
				