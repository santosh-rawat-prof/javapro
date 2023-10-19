/*
In Inventory management , the Economic Order Quantity for a single item is given by :

EOQ = √ { ( 2 * demand rate * setup cost ) / holding cost per unit time }

and the optimal Time Between Orders :

TBO = √ { ( 2 * setup cost ) / ( demand rate * holding cost per item per unit time ) }

WAP to compute EOQ and TBO , the demand rate ( items per unit time ) , setup cost ( per order ) 

and the holding cost (per item per unit time ) are input through the keyboard. 

*/

import java.lang.*;

import java.util.*;

class Inventory
{
	public static void main(String args[])

        {
        	Scanner obj = new Scanner(System.in);

       		System.out.print("\n Enter demand rate: ");
       		float demandRate = obj.nextFloat();

       		System.out.print("\n Enter setup cost: ");
       		float setupCost = obj.nextFloat();

        	System.out.print("\n Enter holding cost: ");
       		float holdingCost = obj.nextFloat();

	        float eoq , tbo ;

       		eoq = ( 2 * demandRate * setupCost ) / holdingCost ;
       		tbo = ( 2 * setupCost ) / ( demandRate * holdingCost );
  
       		float x , y;

       		x = (float)Math.sqrt(eoq) ;
       		y = (float)Math.sqrt(tbo) ;

       		System.out.println("\n EOQ is: "+x);
       		System.out.println("\n TBO is: "+y);
	}
}