import java.util.Scanner;
public class SwitchExpression1 
{
	public static void main(String[] s) 
	{
		System.out.print("Enter day of week ");
		int day = new Scanner(System.in).nextInt();
		String dayName = switch (day)  
		{
    			case 1 -> "Sunday";
    			case 2 -> "Monday";
    			case 3 -> "Tuesday";
    			case 4 -> "Wednesday";
    			case 5 -> "Thursday";
    			case 6 -> "Friday";
    			case 7 -> "Saturday";
    			default -> "Invalid day";
		};
		System.out.println(dayName); 
	}
}
