import java.util.Scanner;
class ConstructorUsingArray2
{
	int a[];
	ConstructorUsingArray2(int p[])
	{
		a=p;
	}
	void show()
	{
		for(int x:a)
			System.out.print(x+"  ");
	}
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array ");
		int n=sc.nextInt();
		int k[]=new int[n];
		System.out.print("Enter values of the array ");
		for(int i=0;i<k.length;i++)
			k[i]=sc.nextInt();
		ConstructorUsingArray2 cua=new ConstructorUsingArray2(k);
		cua.show();
	}
}

		