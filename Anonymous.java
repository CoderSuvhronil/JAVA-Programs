class A
{
	void pqr()
   	{
   		System.out.println("pqr() method of class A");
	}
}
class B extends A
{
	A obj=new A();//An object of class A is created
	A obj1=new A(){
		int p=10;
		void pqr()
		{
			System.out.println("pqr() of 1st anonymous class");
			System.out.println(this.p);
		}
		void xyz()
		{
			System.out.println("xyz() of 1st anonymous class");
		}
	};//Here an anonymous class has been defined in class B. This anonymous class is a sub-class of A
	A obj2=new A(){
		void pqr()
		{
			System.out.println("pqr() of 2nd anonymous class");
		}
		void myMeth()
		{
			System.out.println("myMeth() of 2nd anonymous class");
		}
	};//Here an anonymous class has been defined in class B. This anonymous class is a sub-class of A
	/*B obj3=new B(){
		void pqr()
		{
			System.out.println("pqr() of 3rd anonymous class");
		}
		void xyz()
		{
			System.out.println("xyz() of 3rd anonymous class");
		}
	};*/
	void aaa()
	{
		/*obj.pqr();
		obj1.pqr();
		obj2.pqr();*/
		//System.out.println("-------------------");
		System.out.println("obj is an object of "+obj.getClass().getName());
		System.out.println("obj1 is an object of "+obj1.getClass().getName());
		System.out.println("obj2 is an object of "+obj2.getClass().getName());
		System.out.println("obj3 is an object of "+obj3.getClass().getName());
		System.out.println("-------------------");
		System.out.println("Super class of obj: "+obj.getClass().getSuperclass());
		System.out.println("Super class of obj1: "+obj1.getClass().getSuperclass());
		System.out.println("Super class of obj2: "+obj2.getClass().getSuperclass());
		System.out.println("Super class of obj3: "+obj3.getClass().getSuperclass());

	}                
	public static void main(String s[])
	{
		B p=new B();
		p.pqr();
		p.aaa();
		
	}
}

/* 1. Annonymous inner class can't be public, private, protected or static.

   2. Annonymous inner class can't have a constructor

   3. Annonymous inner class can't extend another class

   4. Annonymous inner class can implement only one interface
*/