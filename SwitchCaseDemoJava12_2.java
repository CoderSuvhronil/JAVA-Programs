import java.util.Scanner;
public class SwitchCaseDemoJava12_2
{
	public static void main(String[] s) 
	{
       		int month=new Scanner(System.in).nextInt();
		switch (month) 
		{
    			case 1,3,5,7,8,10,12 ->System.out.println("31 Days");
			case 4,6,9,11 ->System.out.println("30 Days");
			case 2 ->System.out.println("28 Days");
    			default->System.out.println("Invalid Month");
		}
   	}
}