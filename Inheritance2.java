class A
{
	int x,y;
	void product()
	{
		int p=x*y;
		System.out.println("Product is "+p);
		System.out.println("This is in class A");
	}
	
} 
class B extends A
{
	int z;//Now class B has three instance variables: x, y, and z
	void sum()
	{
		int s=x+y+z;
		System.out.println("Sum is "+s);
		System.out.println("This is in class B");	
	}
}
class Inheritance2
{
	public static void main(String s[])
	{
		B obj=new B();
		obj.product();
		obj.sum();
	}
} 