interface Animal
{
	void sound();
}
class Dog
{
	public static void main(String s[])
	{
		Animal a=new Animal()
		{
			public void sound()
			{
				System.out.println("It Barks!!!!!");
			}
		};
		a.sound();
	}
}