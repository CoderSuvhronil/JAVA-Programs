public class SwitchCaseDemo2
{
	public static void main(String[] s) 
	{
       		String x="Sun", y="Day";
		switch (x+y) 
		{
    			case "SunDay":
        			System.out.println("Today is SunDay");
        			break;
    			case "MonDay":
        			System.out.println("Today is MonDay");
        			break;
    			case "TuesDay":
        			System.out.println("Today is TuesDay");
        			break;
    			default:
        			System.out.println("Invalid");
		}
   	}
}