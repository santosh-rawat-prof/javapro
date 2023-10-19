import java.util.*;
class Abc
{
    Scanner obj = new Scanner(System.in);

    static int i;
    void input()
    {
    System.out.print("\n Enter any number : ");
    i = obj.nextInt();
    }

    void display()
    {
	System.out.print(i);
    }
}

class Ty extends Abc
{
    public static void main (String[] args)
    {
	Abc a = new Abc();
	a.input();
	a.display();
	System.out.print("\n Value of i is: " + (i+4)); 
    }
}
