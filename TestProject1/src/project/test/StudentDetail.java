package project.test;

public class StudentDetail {
	String name;
	int rollNo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetail std1 = new StudentDetail("Anu",1);
		StudentDetail std2 = new StudentDetail("Ram",2);
		std1.display();
		std2.display();
		


	}
	public StudentDetail(String name,int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}
	void display()
	{
		System.out.println("Student name:"+name);
		System.out.println("Roll no:"+rollNo);
	}

}
