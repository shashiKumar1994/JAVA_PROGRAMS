package sample_programs;

public class Find_string_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="MADAM";
		String s2="";
		for(int i=s1.length()-1; i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("given string ="+s1);
		System.out.println("reverse string="+s2);
		if(s1.equals(s2))
		{
			System.out.println("it is polindrome ");
		}
		else
		{
			System.out.println("it is not a polindrome");
		}

	}

}
