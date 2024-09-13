interface Animal
{
	void sound(String a);
}
class AnyAnimal
{
	public static void main(String s[])
	{
		Animal a=(x)->
		{
			System.out.println(x+" Barks");
		};
		a.sound("Dog");
		Animal a1=(y)->
		{
			System.out.println(y+" roars");
		};
		a1.sound("Lion");

	}
}