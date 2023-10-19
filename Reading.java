import java.io.BufferedReader;
import java.io.InputStreamReader;

class Reading
{
    public static void main(String[] args)
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int intNumber = 0;
        float floatNumber = 0.0f;

        try 
        {
            System.out.print("Enter an Integer: ");
            intNumber = Integer.parseInt(in.readLine());
            System.out.print("Enter a Float Number: ");
            floatNumber = Float.valueOf(in.readLine()).floatValue();
        }
        catch (Exception e) 
        {
            // TODO: handle exception\
        }
            System.out.println("intNumber = " + intNumber);
            System.out.println("floatNumber = " + floatNumber);
    }
}