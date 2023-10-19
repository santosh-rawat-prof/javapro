import java.util.*;

class Product
{
	public static void main(String args[])
		{
			Scanner obj = new Scanner(System.in);
			int x,y,z;
			System.out.println("\n Enter any three numbers: ");
			x=obj.nextInt();
			y=obj.nextInt();
			z=obj.nextInt();
			System.out.println("\n The product of the entered numbers are "+(x*y*z));
		}
}