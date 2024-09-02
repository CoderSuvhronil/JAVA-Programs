class Outer
{
	private int x=10;	//Instance variable of Outer class
	class Inner		//It can be public,private,protected,default, final or abstract
	{
		private int x=100;//Instance variable of Inner class
		private void func_inner()
		{
			System.out.println("Method of inner class");
			System.out.println("Inner x = "+this.x);// x of Inner class	
			System.out.println("Outer x = "+Outer.this.x);// x of Outer class	
			Outer.this.x=Outer.this.x+25;
			System.out.println("Outer x = "+Outer.this.x);
		}
	}//End of Inner class
	void func_outer()
	{
		System.out.println("Method of outer class");
		Inner p=new Inner();
		p.func_inner();//Outer class can call even private methods of the Inner class
	}
	public static void main(String s[])
	{
		Outer m=new Outer();
		m.func_outer();
	}
}

