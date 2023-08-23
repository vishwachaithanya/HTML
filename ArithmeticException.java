package HandleException11;
import java.util.Scanner;
public class ArithmeticException
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt(),b=s.nextInt();
		try 
		{
			System.out.println(a/b);
		}
		catch(Exception ae)
		{
			System.out.println("im in catch block");
		}
		
		
		
	}

}
