class A
{
	private int x,y;
	void product()
	{
		int p=x*y;
		System.out.println("Product is "+p);
		System.out.println("This is in class A");
	}
} 
class B extends A
{
	int z;
	void sum()
	{
		int s=x+y+z;
		System.out.println("Sum is "+s);
	}
}
class Inheritance1
{
	public static void main(String s[])
	{
		B obj=new B();
		obj.product();
		obj.sum();
	}
} 
/*class B inherits from class A. Hence the variables and methods of class A are now members of class B. That's why product() method of class A can be called with an object of class B*/









