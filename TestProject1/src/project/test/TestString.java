package project.test;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "hello";
       
       System.out.println(s.charAt(0));
       System.out.println(s.substring(2));
       System.out.println(s.substring(2,4));
       System.out.println(s.contains("ll"));
       System.out.println(s.equals("hey"));
       System.out.println(s.concat(" world"));
       System.out.println(s.replace("llo", "y"));
       System.out.println(s.equals("hello"));
       
       
	}

}
