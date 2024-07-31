import java.util.Scanner;
public class SwitchExpression2 
{
	public static void main(String[] s) 
	{
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.print("Enter two numbers ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.print("Enter your choice ");
		int ch=sc.nextInt();
		int res = switch (ch)
		{
    			case 1 -> x+y;
    			case 2 -> x-y;
    			case 3 -> x*y;
    			case 4 -> x/y;
    			default -> Integer.MIN_VALUE;
		};
		if(res==Integer.MIN_VALUE)
			System.out.println("Invalid Choice");
		else
			System.out.println("The result is "+res);  
	}
}
