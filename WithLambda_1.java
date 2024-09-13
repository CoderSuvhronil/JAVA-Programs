interface Animal
{
	void sound();
}
class Dog
{
	public static void main(String s[])
	{
		Animal a=()->
		{
			System.out.println("It Barks. This is Lambda Expression");
		};
		a.sound();
	}
}