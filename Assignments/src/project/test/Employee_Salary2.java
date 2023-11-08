package project.test;

import java.util.Scanner;

public class Employee_Salary2 {
	static double basicPay;
	static double deduction;
	static double bonus;
	static double pf;
	static double hra;
	public static void main(String args[])
	{
		Employee_Salary2 es = new Employee_Salary2();
		es.getData();
		es.new Employee_Salary3().calculate_hra_pf(basicPay,deduction,bonus);
		es.new Employee_Salary4().totalSalary(basicPay,hra,pf,deduction,bonus);
	}

	 public  void getData() {
		  
		 Scanner sc = new Scanner(System.in);
			System.out.print("Enter the basic pay amount:");
			basicPay = sc.nextDouble();
			System.out.print("Enter the deduction amount:");
			deduction = sc.nextDouble();
			System.out.print("Enter the bonus amount:");
			bonus = sc.nextDouble();
		
	}


public class Employee_Salary3  
{
	
	public void calculate_hra_pf(double bs,double Deduction,double Bonus)
	{
		basicPay = bs;
		bonus = Bonus;
		deduction = Deduction;
		hra = (5*basicPay)/100;
		//System.out.println("Hra: "+hra);
		pf = (20*basicPay)/100;
		//System.out.println("PF: "+pf);
		
	}
	
}

class Employee_Salary4
{
	double totalSalary;
	double basicPay, hra,pf,deduction,bonus;
	public void totalSalary(double bs,double Hra,double PF,double Deduction,double Bonus)
	{
		basicPay = bs;
		hra = Hra;
		pf = PF;
		this.deduction = Deduction;
		this.bonus = Bonus;
		totalSalary  = basicPay+hra-pf-deduction+bonus;
		Employee_Salary3 es3 = new Employee_Salary3();
		//es3.salarySlip(basicPay,hra,pf,deduction,bonus,totalSalary);
	}
	public void salarySlip(double bs,double Hra,double PF,double Deduction,double Bonus,double ts)
	{
		this.basicPay = bs;
		this.hra = Hra;
		this.pf = PF;
		this.deduction = Deduction;
		this.bonus = Bonus;
		this.totalSalary  = ts;
		System.out.println("Salary Slip");
		System.out.println("Basic pay: "+basicPay);
		System.out.println("Deduction:"+deduction);
		System.out.println("Hra: "+hra);
		System.out.println("PF: "+pf);
		System.out.println("Bonus: "+bonus);
		System.out.println("Total salry by hand:"+totalSalary);
		
	}
}
}


