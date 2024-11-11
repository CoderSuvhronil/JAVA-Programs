import java.util.*;
class StringToken
{
	public static void main(String s1[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string ");
		String s=sc.nextLine();
		System.out.println(s);
		StringTokenizer st=new StringTokenizer(s);
		String str[]=new String[st.countTokens()];
		
		int i=0;
		while(st.hasMoreTokens())
		{
			//System.out.println(st.nextToken());
			str[i]=st.nextToken();
			i++;
		}
		for(int j=0;j<str.length;j++)
			System.out.println(str[j]);	
	}
	
}
