package project.test;
import java.util.*;

public class Palindrome2 {

	public static void main(String[] args) {
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to check palindrome");
		String originalWord = sc.next();
		String word = originalWord.toLowerCase().trim();
		int wordLength = word.length();
		for(int i = (wordLength - 1); i>= 0;i--)
		{
			reverse = reverse + word.charAt(i);
			
		}
		
		if(reverse.equals(word))
		{
			System.out.println("The string "+ word +" is a palindrome");
		}
		else
		{
			System.out.println("The string "+word+" is not a palindrome");
		}
		

	}

}
