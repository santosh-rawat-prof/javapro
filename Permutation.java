/*
WAP to print all permutations of an entered String !!
*/

import java.util.*;

class permutation
{
    public static void main(String args[])
    {
	Scanner scan = new Scanner(System.in);

	System.out.print("\n Enter any String u want permutation of : ");
	StringBuffer permut = new StringBuffer("GOD");
	//permut = scan.next();

	//int l = permut.length();

	System.out.print("\n Permuations of the etered String are : ");
	System.out.print("\n " + permut);
	str.charAt(1) = str.charAt(2);
	str.charAt(2) = str.charAt(1);
	System.out.print("\n " + permut);
	str.charAt(0) = str.charAt(2);
	str.charAt(2) = str.charAt(0);
	System.out.print("\n " + permut);
	str.charAt(1) = str.charAt(2);
	str.charAt(2) = str.charAt(1);
	System.out.print("\n " + permut);
	str.charAt(0) = str.charAt(2);
	str.charAt(2) = str.charAt(0);
	System.out.print("\n " + permut);
	str.charAt(1) = str.charAt(2);
	str.charAt(2) = str.charAt(1);
	System.out.print("\n " + permut);
    }
}
