import java.util.*;

class Add
{
    Scanner scan = new Scanner(System.in);

    int a,b;

    void input()
    {
	System.out.print("\n Enter any two numbers: ");
	a = scan.nextInt();
	b = scan.nextInt();
    }
}

class Addition extends Add
{
    void sum()
    {
	int res = a + b;
	System.out.print("\n The sum is: " + res);
    }
}

class SingleIn
{
    public static void main(String[] args)
    {
	Addition obj = new Addition();

	obj.input();
	obj.sum();
    }
}
