import java.util.*;
import java.lang.*;
class EnhancedForLoop

{
    public static void main(String[] args)
    {
	int numarray[] = {48,59,69};
	    for(int k : numarray)
		{
		    if(k>50 && k<100)
			{
			    System.out.println("\n The selected value is " +k);
			}
		}
    }
}
