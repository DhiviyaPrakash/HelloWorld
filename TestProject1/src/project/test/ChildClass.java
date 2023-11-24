package project.test;

public class ChildClass extends ParentClass {
	ChildClass()
	{
		System.out.println("default child class constructor");
	}
	ChildClass(int x)
	{
		super(20);
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		 ChildClass ob = new ChildClass(10);
		
		
		

	}

}
