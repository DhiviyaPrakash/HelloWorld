package project.test;
import java.util.*;
public class Student1 {
	String name;
	int age;
	static String schoolName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1.schoolName = "ABC";
		Student1 st1 = new Student1();
		System.out.println("The name of student1:"+st1.name);
		System.out.println(" The age of student1:"+st1.age);
		System.out.println(" The school name:"+Student1.schoolName );
		Student1 st2 = new Student1 ();
		System.out.println("The name of student2:"+st2.name);
		System.out.println(" the age of student2:"+st2.age);
		System.out.println(" The school name:"+Student1.schoolName );
	}
	public Student1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name:");
		name = sc.next();
		System.out.print("Enter age:");
		age = sc.nextInt();
	}
	
	}


