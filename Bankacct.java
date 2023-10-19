/*
Assume that a bank maintains two kinds of account for its customers, one called saving account and the other current account.
The saving account provides compound interest and withdrawal facilities but no cheque book facility.
The current account provides cheque book facility but no interest.
Current account holders should also maintain a minimum balance an if the balance falls below this level, a service charge is imposed.
Create a class Account that stores customer name, account number and type of account.
From this derive the classes Curr-acct and Sav-acct to make them more specific to their requirements.
Include the necessary methods in order to achieve the following tasks:
(a)Accept deposit from customer and update the balance.
(b)Display the balance.
(c)compute and deposit interest.
(d)permit withdrawal and update the balance.
(e)Check for minimum balance, impose penalty if necessary, and update balance.

NOTE - DO NOT USE CONSTRUCTOR, USE MEMBER FUNCTIONS INSTEAD.
 */

import java.util.*;

class Account
{
    Scanner scan = new Scanner(System.in);

    String name, accNumber;
    int amount,accType;
    static double bal;

    //To initialize instance members
    void input()
    {
           System.out.print("\n Enter Name of the customer: ");
	   name = scan.next();
	   System.out.print("\n Enter Account Number: ");
	   accNumber = scan.next();
	   System.out.print("\n Enter type of the Account:\n 1. Saving Account \n 2. Current Account\n ");
	   accType = scan.nextInt();
	   System.out.print("\n Enter Account Balance: ");
	   bal = scan.nextInt();
    
    }

    //To display Balance
    void balance()
    {
	System.out.print("\n Updated Account Balance: " +bal);
    }

    //To deposit money in Account
    void deposit()
    {
	System.out.print("\n Enter the amount to be deposited: ");
	amount = scan.nextInt();
	bal = bal + amount;
	balance();
    }

    //To withdraw money from Account
    void withdraw()
    {
	System.out.print("\n Enter the amount to be withdrawn: ");
	amount = scan.nextInt();
	if(amount > bal)
	    System.out.print("\n Insufficient Balance");
	else
	    bal = bal - amount;
	balance();
    }
}

class CurrAcct extends Account
{
    void penalty()
    {
	if(bal < 300)
	    {
		System.out.print("\n Since your balance is lower than 300, 20 deducted as penalty charge");
		bal = bal - 20;
		balance();
	    }
    }
}

class SavAcct extends Account
{
    void interest()
    {
	int t;
	
	System.out.print("\n Since you own a Saving account you got an interest to calculate at the rate of 5% per annum,");
	System.out.print("\n Enter time interval in year: ");
	t = scan.nextInt();
	bal = bal * (Math.pow(1.05,t));
	System.out.print("\n After calculating Interest of your Account balance,");
	balance();
    }
}

class Bankacct
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	Account acc = new Account();

	SavAcct acc1 = new SavAcct();

	CurrAcct acc2 = new CurrAcct();

	acc.input();

	int type = acc.accType;

	if(type == 1)
	    {		
		acc.balance();
		System.out.print("\n Choose an option: \n 1. Deposite \n 2. Withdraw\n ");
		int choice = scan.nextInt();
		if(choice == 1)
		    acc.deposit();
		else
		    acc.withdraw();
		double bal = acc.bal;
		acc1.interest();
		System.out.print("\n\n--------Thank You Please Come & Visit Again--------\n\n");
	    }
	else if(type == 2)
	    {		
		acc.balance();
		System.out.print("\n\n Choose an option: \n 1. Deposite \n 2. Withdraw\n ");
		int choice = scan.nextInt();
		if(choice == 1)
		    acc.deposit();
		else
		    acc.withdraw();
		double bal = acc.bal;
		acc2.penalty();
		System.out.print("\n\n --------Thank You Please Come & Visit Again--------\n\n");
	    }	
    }
}
