interface Animal
{
	String sound();
}
class Dog
{
	public static void main(String s[])
	{
		Animal a=()->
		{
			return "It Barks. This is another Lambda Expression";
		};
		System.out.println(a.sound());
	}
}