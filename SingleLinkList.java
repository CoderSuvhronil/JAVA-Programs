import java.util.Scanner;
class SingleLinkList
{
	static class Node
	{
		int n;
		Node next;
		Node(int n)
		{
			this.n=n;
			this.next=null;
		}
	}
	Node head;
	static void addNode(SingleLinkList sl, int x)
	{
		Node t=new Node(x);
		if(sl.head == null)
			sl.head=t;
		else
		{
			Node p=sl.head;
			while(p.next != null)
				p=p.next;
			p.next=t;
		}
	}
	static void show(SingleLinkList sl)
	{
		Node h=sl.head;
		System.out.print("The elements are ");
		while(h != null)
		{
			System.out.print(h.n+"  ");
			h=h.next;
		}
	}
	public static void main(String s[])
	{
		SingleLinkList sl=new SingleLinkList();
		Scanner sc=new Scanner(System.in);
		String ans;
		do
		{
			System.out.print("Enter a value ");
			int x=sc.nextInt();
			addNode(sl,x);
			System.out.print("Enter another value ? ");
			ans=sc.next();
			ans=ans.toUpperCase();
		}
		while(ans.equals("YES"));
		show(sl);
	}
}




