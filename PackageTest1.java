import package1.*;
import package1.package2.*;

class PackageTest1
{
	public static void main(String[] args)
	{
		ClassA obj = new ClassA();
		obj.displayA();
		
		ClassB obj1 = new ClassB();
		obj1.displayB();
		
		ClassC obj2 = new ClassC();
		obj2.displayC();
	}
}