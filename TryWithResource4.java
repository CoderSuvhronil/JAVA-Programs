import java.util.*;
import java.io.*;
class TryWithResource4
{
	public static void main(String s[])
	{
		ArrayList <Integer> a=new ArrayList<Integer>();
		try(Scanner sc=new Scanner(new File("numbers.txt"))) //Introduced in JDK 7
		{
    			while(sc.hasNext()==true) 
			{
				a.add(Integer.parseInt(sc.nextLine()));
    			}
			System.out.println(a);
		} 
		catch(FileNotFoundException e) 
		{
    			e.printStackTrace();
		}
	}
}

/*The resource must be an object of a class which implements AutoCloseable interface*/














