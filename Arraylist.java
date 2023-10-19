import java.util.*;
public class Arraylistcollection
{
	public static void main(String[] args)
	{
	ArrayList<Integer> list = new ArrayList<Integer>();
	NumberingList(list);
	int total = 0;
	Iterator<Integer> iter = list.iterator();
		while(iter.hasNext())
		{
			Integer val = iter.next();
			total = total + val;
		}
	System.out.println("The Total Amount is" + total);
	}
	private static void NumberingList(ArrayList<Integer> list)
	{
		list.add(new Integer(1));
		list.add(new Integer(2));
	}
}