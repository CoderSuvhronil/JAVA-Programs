class A
{
	int x=34,y=20;
	void product()
	{
		System.out.println("It does not multiply");
	}
}
class B extends A
{
	int z;//Now class B has three instance variables: x, y, and z
	void sum()
	{
		int s=x+y+z;
		System.out.println("Sum is "+s);	
	}
}
class Inheritance3
{
	public static void main(String s[])
	{
		A objA=new A();
		B objB=new B();
		objB.product();
		System.out.println("objA.x="+objA.x);
		System.out.println("objB.x="+objB.x);
		System.out.println("------------------------------");
		objB.x=100;
		System.out.println("AFTER CHANGE in class B");
		System.out.println("objA.x="+objA.x);
		System.out.println("objB.x="+objB.x);
		System.out.println("------------------------------");
		objA.x=70;
		System.out.println("AFTER CHANGE in class A");
		System.out.println("objA.x="+objA.x);
		System.out.println("objB.x="+objB.x);
	}
} 