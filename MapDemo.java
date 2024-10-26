import java.util.*;
class MapDemo
{
	public static void main(String s[])
	{
		Map <Integer, String> m = new HashMap<>();
		m.put(101,"Shreya");   
		m.put(102,"Avinash");
		m.put(103,"Parag");
		m.put(104,"Sayan");
		m.put(103,"Shreya");
		System.out.println("Name with key 103 is "+m.get(103));
	}
}
