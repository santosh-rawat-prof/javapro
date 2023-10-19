//WAP for for-functional calculator using 2 classes

import java.util.*;

class Base
{

	Scanner obj  = new Scanner(System.in);
	float a , b , sum , mul , div , sub;

	void input()
	{
		System.out.print("\n Enter any two numbers: ");
		a = obj.nextFloat();
		b = obj.nextFloat();

		System.out.print("\n Enter the operator what you want to do between "+a+ " and "+b+ " : ");
	}

	void addition()
	{
		System.out.println("\n You have choosen to add "+a+ " and "+b);
	 	sum=a+b;
		System.out.println("\n Solution: " +sum);
	}

	void substraction()
	{
		System.out.println("\n You have choosen to subtract "+a+ " and "+b);
		sub=a-b;
		System.out.println("\n Solution: " +sub);
	}

	void multiply()
	{
		System.out.println("\n You have choosen to multiply "+a+ " and "+b);
		mul=a*b;
		System.out.println("\n Solution: " +mul);
	}

	void divide()
	{
		System.out.println("\n You have choosen to divide "+a+ " and "+b);
		div=a/b;
		System.out.println("\n Solution: " +div);

	}

}

class CalculatorC
{
	public static void main(String args[])
		{

		    Scanner obj = new Scanner(System.in);

		    String ch;
		    int i;
		    
		    Base obj2 = new Base();

			do
			{
			  obj2.input();

			  ch = obj.next();
			
			  switch(ch)
			  {
				case "+" : obj2.addition();
					   break;

				
				case "-" : obj2.substraction();
					   break;

				
				case "*" : obj2.multiply();
					   break;

				
				case "/" : obj2.divide();
					   break;
 
				default: System.out.println("\n You have done a wrong choice");
					 break;

			   }
			System.out.print("\n Enter 1 to continue or any other symbol to close: ");
		        i = obj.nextInt();
			}
	              while(i==1);
		}
}