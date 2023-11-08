package project.test;

public class Employee_Calculate {
	double pf;
	double hra;

	public void calculate_hra_pf(double basicPay)
	{
	
		hra = (5*basicPay)/100;
		System.out.println("Hra: "+hra);
		pf = (20*basicPay)/100;
		System.out.println("PF: "+pf);
		
	}

}
