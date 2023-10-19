import java.util.*;

class Staff
{
    Scanner obj = new Scanner(System.in);

    static int code;
    String name;

    void inputStaff()
    {
	System.out.print("\n Enter the code of the staff: \n 1. Teacher\n 2. Typist\n 3. officer\n ");
	code = obj.nextInt();

	System.out.print("\n Enter the name of the staff: ");
	name = obj.next();
    }

    void displayStaff()
    {
	System.out.print("\n Entered staff code is : " + code + "\n that is ");
	if(code == 1)
	    System.out.print("Teacher");
	else if(code == 2)
	    System.out.print("Typist");
	else if(code == 3)
	    System.out.print("Officer");
	else
	    System.out.print("\n Wrong Choice");

	System.out.print("\n Name of the Staff is " + name);
    }
}

class Teacher extends Staff
{
    String subject, publication;

    void inputTeacher()
    {
	System.out.print("\n Enter the Subject teacher teaches : ");
	subject = obj.nextLine();

	System.out.print("\n Enter the publication of the subjecct book : ");
	publication = obj.nextLine();
    }

    void displayTeacher()
    {
	System.out.print("\n Teacher teaches the subject : " + subject + " book of " + publication + " publication\n");
    }
}

class Typist extends Staff
{
    String speed;

    void inputTypist()
    {
	System.out.print("\n Enter the speeed of the Typist : ");
	speed = obj.nextLine();
    }

    void displayTypist()
    {
	System.out.print("\n Speed of the typist is: " + speed);
    }
}

class Officer extends Staff
{
    String grade;

    void inputOfficer()
    {
	System.out.print("\n Enter the grade of the officer: ");
	grade = obj.nextLine();
    }

    void displayOfficer()
    {
	System.out.print("\n Grade of the officer is : " + grade + "\n");
    }
}

class Regular extends Typist
{
    void displayRegular()
    {
	System.out.print("\n Typist is Regular hence he will get salary on monthly basis \n");
    }
}

class Casual extends Typist
{
    int dailyWages;

    void inputCasual()
    {
	System.out.print("\n Enter daily wages of Typist: ");
	dailyWages = obj.nextInt();
    }

    void displayCasual()
    {
	System.out.print("\n Typist is casual, hence his daily wages is: " + dailyWages + "\n");
    }
}

class Institution extends Staff
{
    public static void main(String args[])
    {
	Scanner scan = new Scanner(System.in);

	Staff stf = new Staff();
	Teacher teach = new Teacher();
	Officer off = new Officer();
	Regular reg = new Regular();
	Casual cas = new Casual();

	stf.inputStaff();
	stf.displayStaff();

	if(code == 1)
	    {
		teach.inputTeacher();
		teach.displayTeacher();
	    }
	else if(code == 2)
	    {
		System.out.print("\n Enter the type of typist\n 1. Regular\n 2. Casual\n ");
		int choice = scan.nextInt();

		if(choice == 1)
		    {
			reg.inputTypist();
			reg.displayTypist();
			reg.displayRegular();
		    }
		else if(choice == 2)
		    {
			cas.inputTypist();
			cas.inputCasual();
			cas.displayTypist();
			cas.displayCasual();
		    }
	    }

	else if(code == 3)
	    {
		off.inputOfficer();
		off.displayOfficer();
	    }
    }
}
