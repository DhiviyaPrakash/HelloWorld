package project.test;

public class Employee_Salary {

		double totalSalary;
		public static void main(String args[])
		{
			Employee_Read er = new Employee_Read();
			er.getData();
			Employee_Calculate ec = new Employee_Calculate();
			ec.calculate_hra_pf(er.basicPay);
			Employee_Salary es = new Employee_Salary();
			es.totalSalary(er.basicPay,ec.hra,ec.pf,er.deduction,er.bonus);
			
		    
					
		}
		public void totalSalary(double basicPay,double hra,double pf,double deduction,double bonus)
		{
			
			totalSalary  = basicPay+hra-pf-deduction+bonus;
			System.out.println("");
			System.out.println("Salary Slip");
			System.out.println("Basic pay: "+basicPay);
			System.out.println("Deduction:"+deduction);
			System.out.println("Hra: "+hra);
			System.out.println("PF: "+pf);
			System.out.println("Bonus: "+bonus);
			System.out.println("Total salry by hand:"+totalSalary);
			

}
}