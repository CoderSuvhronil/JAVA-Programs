import java.util.Scanner;
class SwitchYield2
{
	public static void main(String[] s) 
	{
		System.out.print("Enter a number ");
		int number = new Scanner(System.in).nextInt();
		String message =switch (number) 
		{ 
			case 1-> 
				{yield "This is 1";}
			case 2-> 
				{yield "This is 2";} 
			default-> 
				{yield "More than 2";} 
		};
		System.out.println(message);
	}
}

