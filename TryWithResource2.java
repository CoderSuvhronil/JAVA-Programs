				
import java.io.*;
public class TryWithResource2
{
	public static void main(String[] s) throws FileNotFoundException
	{
		FileOutputStream fs=new FileOutputStream("info.txt"); // Outside the try block
		try(fs)		//Introduced in Java 9
		{
			fs.write("Java is an Object Oriented Programming Language".getBytes());
			System.out.println("File is written");
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
