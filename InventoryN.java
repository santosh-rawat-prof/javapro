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

class InventoryN
{
	public static void main(String args[])

        {
        	Scanner scan = new Scanner(System.in);

       		System.out.print("\n Enter demand rate: ");
       		float demandRate = scan.nextFloat();

       		System.out.print("\n Enter setup cost: ");
       		float setupCost = scan.nextFloat();

        	System.out.print("\n Enter holding cost: ");
       		float holdingCost = scan.nextFloat();

       		float eOQ = (float)Math.sqrt( ( 2 * demandRate * setupCost ) / holdingCost );
       		float tBO = (float)Math.sqrt( ( 2 * setupCost ) / ( demandRate * holdingCost ) );

      		System.out.println("\n EOQ is: "+eOQ);
       		System.out.println("\n TBO is: "+tBO);
	}
}