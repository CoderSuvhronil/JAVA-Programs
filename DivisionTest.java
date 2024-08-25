class DivisionTest
{
	public static void main(String s[])
	{
		//System.out.println(5/0);	Exception
		//System.out.println(0/0);	Exception
		System.out.println(5/0.0);	//Infinity
		System.out.println(-1.7/0.0);	//-Infinity
		System.out.println(0.0/0.0);	//NaN
		System.out.println( (0.0/0.0) == (0.0/0.0) );	//false
		System.out.println( (0.0/0.0) >= (0.0/0.0) );	//false
		System.out.println( (0.0/0.0) != (0.0/0.0) );	//true
		System.out.println(0/0.0);	//NaN
		System.out.println(0/4.0);	//0.0
		System.out.println(0.0/0);	//NaN


	}
}

		