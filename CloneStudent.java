class CloneStudent implements Cloneable
{
        String name;
	int roll;
        CloneStudent(String name, int roll)
        {
                this.name=name;
		this.roll=roll;
        }
        public String toString()
        {
		String s="";
		s+="Name is: "+name+" Roll is: "+roll;
		return s;
        }
        public static void main(String s1[]) throws CloneNotSupportedException
	{
		CloneStudent c1=new CloneStudent("Arijit",23);
           	CloneStudent c2=(CloneStudent)c1.clone();
		CloneStudent c3=new CloneStudent("Mrinal",44);
		System.out.println(c1);
		System.out.println(c3);
		System.out.println(c2);

		System.out.println("c1 is an object of "+c1.getClass().getName());
		System.out.println("c2 is an object of "+c2.getClass().getName());
        }
}
/*
clone() is in Object class
Returns object of Object class
Access specifier: protected
*/













