
class FloydZero
{
	public static void main(String[] args)
	{
		int i,j,k=0;

		for(i=1;i<=5;i++)
		{
		System.out.print("\n\n");
			for(j=1;j<=i;j++)
			{
				if((i+j)%2 == 0)
					System.out.print("1\t");
				else
					System.out.print("0\t");
			
			}
		}
		 
	}
}