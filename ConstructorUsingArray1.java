class ConstructorUsingArray1
{
	int a[];
	ConstructorUsingArray1()
	{
		a=new int[]{1,2,3,4,5};
	}
	void show()
	{
		for(int x:a)
			System.out.print(x+"  ");
	}
	public static void main(String s[])
	{
		ConstructorUsingArray1 cua=new ConstructorUsingArray1();
		cua.show();
	}
}

		