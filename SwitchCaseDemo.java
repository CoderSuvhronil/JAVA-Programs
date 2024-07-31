public class SwitchCaseDemo
{
	public static void main(String[] s) 
	{
       		int x=2,y=0;
       		switch (x+y) 
		{
           		case 1:
               			System.out.println("Monday");
               			break;
           		case 2:
               			System.out.println("Tuesday");
               			//break;
           		case 3:
               			System.out.println("Wednesday");
               			break;
			default:
               			System.out.println("Invalid day");
              			break;
       		}
   	}
}