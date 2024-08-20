class A
{
}
class B extends A
{
}
class C extends B
{
}
class InstanceOfExample2
{
	public static void main(String s[])
	{
		B obj=new B(); 
		C obj1=new C();
		System.out.println(obj instanceof A);
		System.out.println(obj1 instanceof A);
	}
}
