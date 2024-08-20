class ExceptionDemo
{
	public static void main(String s[])
	{
		int x,y,z=0;
		try
		{
			x=Integer.parseInt(s[0]);
			System.out.println("After the 1st input");
			y=Integer.parseInt(s[1]);
			System.out.println("After the 2nd input");
			z=x/y;
		}
		catch(NumberFormatException   e)
		{
			e=new NumberFormatException();
			System.out.println("Enter numbers only!!!");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by Zero");
		}
		finally
		{
			System.out.println("In the finally block");
		}
		System.out.println("The quotient is "+z);
		System.out.println("After the TRY-CATCH block");
	}
}