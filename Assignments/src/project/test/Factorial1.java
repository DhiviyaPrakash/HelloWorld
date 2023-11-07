package project.test;

import java.util.Scanner;

public class Factorial1 {
	int fact = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		Factorial1 fn = new Factorial1();
		fn.calculate(number);	

	}
	public void calculate(int n)
	{
		int number = n;
		for(int i=1;i<=number;i++)
		{
			fact = fact*i;
		}
		this.result(number,fact);
	}
	public void result(int n, int f)
	{
		int number = n;
		this.fact = f;
		System.out.println("The factorial of "+number+" is:"+fact);
	}

}
