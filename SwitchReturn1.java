import java.util.Scanner;
public class SwitchReturn1 
{
	public static void main(String[] s) 
	{
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Stop");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your choice ");
		int ch=sc.nextInt();
		System.out.print("Enter two numbers ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int res=calculate(x,y,ch);
		if(res!=Integer.MIN_VALUE)
			System.out.println("The result is "+res);
		else
			System.out.println("Invalid Choice");
	}
	public static int calculate(int x, int y, int ch)
	{		
		switch (ch) 
		{
    			case 1 : 
				return (x+y);
    			case 2 :
				return (x-y);
    			case 3 :
				return (x*y);
    			case 4 : 
				return (x/y);	
    			default : 
				return Integer.MIN_VALUE;
		}
	}
}
