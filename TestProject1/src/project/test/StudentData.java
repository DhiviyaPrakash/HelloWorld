package project.test;

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name:");
		
		String name = sc.next();
		System.out.println("enter the Age:");
		int age = sc.nextInt();
		StudentEncap data = new StudentEncap();
		//data.setName("Anu");
		data.setName(name);
		data.setAge(age);
		System.out.println("Student name is:"+data.getName());
		System.out.println("Age is:"+data.getAge());

	}
	

}
