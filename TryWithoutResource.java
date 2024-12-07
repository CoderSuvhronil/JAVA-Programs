						//Prior to JDK 1.7
import java.util.*;
import java.io.*;
class TryWithoutResource
{
	public static void main(String s[])
	{
		Scanner sc=null;
		try
		{
			File f=new File("test.txt");
			sc=new Scanner(f);
    			while(sc.hasNext()==true) 
			{
				System.out.println(sc.nextLine());
    			}
		} 
		catch(FileNotFoundException e) 
		{
    			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
	}
}
















