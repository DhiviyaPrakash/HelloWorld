package project.test;

import java.util.Scanner;

public class Employee_Read {
	double basicPay;
	double deduction;
	double bonus;
	
	
	 public  void getData() {
		  
		 Scanner sc = new Scanner(System.in);
			System.out.print("Enter the basic pay amount:");
			basicPay = sc.nextDouble();
			System.out.print("Enter the deduction amount:");
			deduction = sc.nextDouble();
			System.out.print("Enter the bonus amount:");
			bonus = sc.nextDouble();
	 }

}
