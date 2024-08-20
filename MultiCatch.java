class MultiCatch
{
	public static void main(String s[])
	{
		int a,b,c;
		try
		{
			a=Integer.parseInt(s[0]);
			b=Integer.parseInt(s[1]);
			c=a/b;
			System.out.println("Quotient is "+c);
		}
		catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e)
		{
			if(e instanceof ArithmeticException)
			{
				//System.out.println("Can't divide by Zero");
				handleArithmeticException();
			}
			else if(e instanceof NumberFormatException)
			{
				System.out.println("Please enter numbers only");
			}
			else if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("Enter atleast two numbers");
			}
		}
	}
	static void handleArithmeticException()
	{
		System.out.println("Can't divide by Zero");
	}
}











