class Santi
{
	public static void main(String args[])
	{
		int i,n=0;
		

		for(i=1;i<=91;i++)
		{
			if(i==n)
			{
			System.out.println("\n");
			continue;
			}
			System.out.print(" "+i+" ");
			n++;
		}
	}
}

/*
1
2 3
4 5 6 
7 8 9 10
..........
............
.............91
*/