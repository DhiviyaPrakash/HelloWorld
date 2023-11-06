package project.test;

public class Test2 {
	 String name;
	 int age;

	public Test2(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2("Anu",20);
		t.display();

	}
	void display()
	{
		System.out.println(name+" " +age);
	}

}
