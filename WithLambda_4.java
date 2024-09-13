interface Calculation
{
	int operation(int x, int y);
}
class CalculationMain
{
	public static void main(String s[])
	{
		Calculation c1=(x,y)->(x+y);
		System.out.println("Sum is "+c1.operation(10,20));
		Calculation c2=(x,y)->(x*y);
		System.out.println("Product is "+c2.operation(10,20));

	}
}
