//WAP for for-functional calculator

import java.util.*;

class Calculator
{
	public static void main(String args[])
		{
			Scanner obj  = new Scanner(System.in);
			float sum , mul , div , sub;
			int i;

			do
			{
			  System.out.print("\n Enter any two numbers: ");
			  float a = obj.nextFloat();
			  float b = obj.nextFloat();

			  System.out.print("\n Enter the operator what you want to do between "+a+ " and "+b+ " : ");
			  String choice = obj.next();
			
			  switch(choice)
			  {
				case "+" : System.out.println("\n You have choosen to add "+a+ " and "+b);
					 sum=a+b;
					 System.out.println("\n Solution: " +sum);
					 break;

				
				case "-" : System.out.println("\n You have choosen to subtract "+a+ " and "+b);
					 sub=a-b;
					 System.out.println("\n Solution: " +sub);
					 break;

				
				case "*" : System.out.println("\n You have choosen to multiply "+a+ " and "+b);
					 mul=a*b;
					 System.out.println("\n Solution: " +mul);
					 break;

				
				case "/" : System.out.println("\n You have choosen to divide "+a+ " and "+b);
					 div=a/b;
					 System.out.println("\n Solution: " +div);
					 break;

				default: System.out.println("\n You have done a wrong choice");
					 break;

			   }
			
			System.out.print("\n Enter 1 to continue the process or any other number to cancel: ");
			i = obj.nextInt();
			}
	              while(i==1);
		}
}