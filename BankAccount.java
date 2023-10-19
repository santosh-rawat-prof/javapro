/*
WAP to create a class named BankAccount
data -
Name of Depositor
Account number
Type of account
Balance amount

methods -
Input details
Deposit
Withdrawal
Display
*/

import java.util.*;

class Details
{
	String nameOfDepositor,accountNumber,typeOfAccount;
	float balanceAmount,deposit,withdrawal;
	Scanner obj = new Scanner(System.in);
	void inputDetails()
	{
		System.out.print("Enter the name of the Depositor : ");
		nameOfDepositor = obj.next();

		System.out.print("\nEnter the account number : ");
		accountNumber = obj.next();

		System.out.print("\nEnter the type of account : ");
		typeOfAccount = obj.next();

		System.out.print("\nEnter the balance amount : ");
		balanceAmount = obj.nextFloat();
		
	}

	void deposit()
	{
		System.out.print("\nEnter the amount to be deposited : ");
		deposit = obj.nextFloat();
		System.out.print("\n Balance left is: " +(balanceAmount+deposit) );
	}

	void withdrawal()
	{
		System.out.print("\nEnter the amount to be withdrawn : ");
		withdrawal = obj.nextFloat();
		System.out.print("\n Balance left is: " +(balanceAmount-withdrawal) );
	}

	void display()
	{
		System.out.print("\n Name of the Depositor is: " + nameOfDepositor);
		System.out.print("\n Type of Account is: " + typeOfAccount);
		System.out.print("\n Account Number :  " + accountNumber);

		
		
	}

}

class BankAccount
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		Details obj2 = new Details();
		obj2.inputDetails();
		obj2.display();
		
		System.out.print("\n Enter One for deposit or zero for withdrawal: ");
		int ch = obj.nextInt();


		switch(ch)
		{
		case 1 : System.out.print("\n You have choosen for deposit");
			 obj2.deposit();
			 break;
		case 0 : System.out.print("\n You have choosen for withdrawal");
			 obj2.withdrawal();
			 break;
		}

		
		
		
	}
}