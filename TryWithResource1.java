import java.util.*;
import java.io.*;
class TryWithResource1
{
	public static void main(String s[])
	{
		try(Scanner sc=new Scanner(new File("test.txt"))) //Introduced in JDK 7
		{
    			while(sc.hasNext()==true) 
			{
				System.out.println(sc.nextLine());
    			}
		} 
		catch(FileNotFoundException e) 
		{
    			e.printStackTrace();
		}
	}
}

/*The resource must be an object of a class which implements AutoCloseable interface*/














