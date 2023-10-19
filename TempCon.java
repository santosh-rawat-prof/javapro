/*
WAP to convert value from degree celcius to farenheit from 1 to 50
And show it in Tabular Form.
Convergent formulae C = (F - 32) / 1.8
therefore, F will be : (C * 1.8) + 32 
*/

class TempCon
{
	public static void main(String[] args)
	{
		float f,c;
		
		System.out.println("Celcius\t\tFarenheit");
		
		for(c = 1; c <= 50; c++)
		{
			f = (c * 1.8f) + 32f;
			
			System.out.println(c + "\t\t" + f);   
		}
	}
}