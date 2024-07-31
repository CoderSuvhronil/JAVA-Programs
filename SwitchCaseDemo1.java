public class SwitchCaseDemo1
{
	public static void main(String[] s) 
	{
       		long value = 1L;
		switch ((int) value) 
		{
    			case 1:
        			System.out.println("Value is 1");
        			break;
    			case 2:
        			System.out.println("Value is 2");
        			break;
    			case 123:
        			System.out.println("Value is 123");
        			break;
    			default:
        			System.out.println("Value is something else");
		}
   	}
}