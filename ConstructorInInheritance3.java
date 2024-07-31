class A
{
	int x,y;
	void prod()
	{
		int p=x*y;
		System.out.println("Product is "+p);
	}
	A(int p, int q)
	{
		x=p;y=q;
		System.out.println("In constructor of class A with TWO parameter");
	}
	A(int m)
	{
		x=y=m;
		System.out.println("In constructor of class A with ONE parameter");
	}
}
class B extends A
{
	int z;
	B(int i,int j, int k)
	{
		super(i,j);//Constructor of class A with 1 parameters is called
		System.out.println("Starting point: Constructor of class B");
		z=k;
		System.out.println("End: Constructor of class B");
	}
	void sum()
	{
		int s=x+y+z;
		System.out.println("The sum is "+s);
	}
}
class ConstructorInInheritance3
{
	public static void main(String s[])
	{
		B obj=new B(10,20,30);
		obj.sum();
		obj.prod();
	}
}

