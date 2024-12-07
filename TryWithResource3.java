			//Introduced in Java 9
import java.util.*;
import java.io.*;
class TryWithResource3
{
	public static void main(String s[]) throws Exception
	{
		File f=new File("test.txt");
		Scanner sc= new Scanner(f);
		try(sc) 
		{
    			while(sc.hasNext()) 
			{
        			System.out.println(sc.nextLine());
    			}
		} 
		catch(Exception e) 
		{
    			e.printStackTrace();
		}
	}
}
