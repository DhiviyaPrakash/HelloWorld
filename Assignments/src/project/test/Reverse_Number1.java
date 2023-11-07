package project.test;

import java.util.Scanner;

public class Reverse_Number1 {
	int remainder,reverse = 0;
	static int number;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be reversed:");
		 number = sc.nextInt();
		 Reverse_Number1 rev = new Reverse_Number1();

	}
	public Reverse_Number1( )
	{
		this(number);
	
		System.out.println("The reverse of the given number is: "+reverse);
		
	}
	public Reverse_Number1(int n)
	{
		int number = n;
		while(number!=0)
		{
			remainder = number%10;
			reverse = reverse*10+ remainder;
			number = number/10;
		}
	}

}
