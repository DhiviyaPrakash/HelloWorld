package project.test;

import java.util.Scanner;

public class Shapes_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char option;
		Scanner sc= new Scanner(System.in);
		Shapes_Area calculate = new Shapes_Area();
		char d = 0;
		do {
			System.out.println("a.circle area (pi*r*r)");
			 System.out.println("b.Rectangle area (l*b)");
			 System.out.println("c.Square area (a*a)");
			 System.out.println("d.Exit");
			 System.out.println("Enter your option ");
			 String choice = sc.next();
			 option = choice.charAt(0);
			 switch(option)
			 {
			 case 'a': System.out.println("Enter the value for radius:");
			           float pi = 3.14f;    
			           int radius = sc.nextInt();
			           calculate.areaCircle(pi, radius);
			           break;
			 case 'b' :System.out.println("Enter the value of length:");
			           int l = sc.nextInt();
			           System.out.println("Enter the value of breadth:");
			           int b = sc.nextInt();
			           calculate.areaRectangle(l, b);
			           break;
			 case 'c' :System.out.println("Enter the value of side:");
	                   int s = sc.nextInt();
	                   calculate.areaSquare(s);
	                   break;  
			 case 'd' :System.exit(0);
		               break;
			           
			 }
		
		}while(option!=d);

	}
	private void areaSquare(int a) {
		int area = a*a;
		System.out.println("The area of the square is:"+area);
		
	}
	void areaCircle(float pi, int r)
	{
		float area = pi*r*r;
		System.out.println("The area of the circle is:"+area);
	}
	void areaRectangle(int l, int b)
	{
		int area = l*b;
		System.out.println("The area of the rectangle is:"+area);
		
	}
	


}
