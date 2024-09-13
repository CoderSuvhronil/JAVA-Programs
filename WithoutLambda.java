interface Animal
{
	void sound();
}
class Dog implements Animal
{
	public void sound()
	{
		System.out.println("It Barks");
	}
	public static void main(String s[])
	{
		Dog d=new Dog();
		d.sound();
	}
}