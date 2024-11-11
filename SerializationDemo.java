import java.io.*;
import java.util.Date;
import java.util.Calendar;
class CurrentTime implements Serializable
{
	Date d;	//Reference var of Date class is an Instance var of CurrentTime class
	CurrentTime()
	{
		Calendar c=Calendar.getInstance();//getInstance() is a static method of Calendar class
		d=c.getTime();//getTime() returns an object of Date class
	}
	public Date getTime()
   	{
		return d;
	}
}
public class SerializationDemo
{
	public static void main(String [] args)
	{
		CurrentTime t=new CurrentTime();
		try
		{
			FileOutputStream fs=new FileOutputStream("time.txt");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(t);
			os.close();
		}
		catch(Exception e)
		{}
	}
}
