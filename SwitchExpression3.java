import java.util.Scanner;
public class SwitchExpression3
{
	public static void main(String[] s) 
	{
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Stop");
		System.out.print("Enter two numbers ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.print("Enter your choice ");
		int ch=sc.nextInt();
		String res = switch (ch) 
		{
    			case 1 -> String.valueOf(x+y);
    			case 2 -> String.valueOf(x-y);
    			case 3 -> String.valueOf(x*y);
    			case 4 -> String.valueOf(x/y);	
    			default -> "Invalid Input";
		};
		System.out.println(res);  
	}
}
