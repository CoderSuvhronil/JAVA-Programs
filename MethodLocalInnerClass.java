class MyOuter 
{
	int x=10;
	void pqr() 
	{   
		int a=5, p=4; //Local variable of the method
      		class BBB //It can be final or abstract can't be private, protected or public
		{
			public void seeOuter()//Can use instance var of the class or local var of the method
			{
				System.out.println("Outer x is " + x);
				System.out.println("Local a is " + a);
			}
      		} 
		System.out.println("pqr()");
      		BBB mi = new BBB();           
      		mi.seeOuter();
	}
	void abc()
	{
		class AAA
		{
			public void seeOuter() 
			{
				System.out.println("Outer x is " + x);
			}
        	} 
		System.out.println("In abc()");
        	AAA mi = new AAA();           
        	mi.seeOuter();
	}
	void xyz()
	{
		class AAA
		{
			public void seeOuter() 
			{
				System.out.println("Outer x is " + x);
			}
        	} 
		System.out.println("In xyz()");
        	AAA mi = new AAA();           
        	mi.seeOuter();
	}

} 
class Inner3
{
	public static void main(String s[])
	{
		MyOuter m=new MyOuter();
		m.pqr();
		m.abc();
		m.xyz();
	}
}
/*
Till JDK 1.7, Method Local inner class cannot access non-final local variable 
of the method in which it has been declared.
But from JDK 1.8, it is possible to access the non-final local variable
Method Local inner class cannot be static
*/