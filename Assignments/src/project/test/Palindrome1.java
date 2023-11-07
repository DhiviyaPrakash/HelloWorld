package project.test;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java";
		String t = "Malayalam";
		
		String a = s.toLowerCase();
		String b = t.toLowerCase();
		
		if(a.charAt(0)==a.charAt(3)&&a.charAt(1)==a.charAt(2))
		{
			System.out.println("The string "+a+" is a palindrome");
		}
		else
		{
			System.out.println("The string "+a+" is not a palindrome");
		}
		
		if(b.charAt(0)==b.charAt(8)&&b.charAt(1)==b.charAt(7)&&b.charAt(2)==b.charAt(6)&&b.charAt(3)==b.charAt(5))
		{
			System.out.println("The string "+b+" is a palindrome");
		}
		else
		{
			System.out.println("The string "+b+" is not a palindrome");
		}

	}

}
