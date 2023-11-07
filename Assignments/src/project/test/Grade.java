package project.test;

import java.util.Scanner;

public class Grade {
       int total;
       String name;
       int avg;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Grade st1 = new Grade();
		System.out.println("The name of Student:"+st1.name);
		System.out.println("total mark:"+st1.total);
		st1.getGrade();
		Grade st2 = new Grade();
		System.out.println("The name of Student:"+st2.name);
		System.out.println("total mark:"+st2.total);
		st2.getGrade();
        
	}
	public Grade()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name:");
		 name = sc.next();
		System.out.print("Enter the mark of English:");
		int english = sc.nextInt();
		System.out.print("Enter the mark of maths:");
        int maths = sc.nextInt();
        System.out.print("Enter the mark of science:");
        int science = sc.nextInt();
        total = english + maths +science; 
        
	}
	void getGrade()
	{
		 avg = total/3;
		 if( avg<40)
		 {
		 System.out.println("You are fail");
		 }
		 else if(avg>=40 && avg<=60)
		 {
		 System.out.println("Your grade is: D");
		 }
		 else if(avg>=61 && avg<=70)
		 {
		 System.out.println("Your grade is: C");
		 }
		 else if(avg>=71 && avg<=80)
		 {
		 System.out.println("Your grade is: B");
		 }
		 else if(avg>=81 && avg<=100)
		 {
		 System.out.println("Your grade is: A");
		 }
		 else
		 {
		 System.out.println("invalid");
		 }

	}
	}


